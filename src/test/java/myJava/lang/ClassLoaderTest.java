package myJava.lang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassLoaderTest {
    @Test
    void sunBootClassPath(){
        System.out.println(System.getProperty("sun.boot.class.path"));
    }
    @Test
    void extClassLoaderLoadPath(){
        System.out.println(System.getProperty("java.ext.dirs"));
    }
    @Test
    void appClassLoaderLoadPath(){
        System.out.println(System.getProperty("java.class.path"));
    }
    @Test
    void whichLoaderLoadMe(){
        ClassLoader cl = ClassLoaderTest.class.getClassLoader();
        System.out.println("ClassLoader is:"+cl.toString());
    }
    @Test
    void whichLoaderLoadInt(){
        ClassLoader cl = int.class.getClassLoader();
        assertNull(cl);
    }
    @Test
    void parentOfAppClassLoader(){
        ClassLoader cl = ClassLoaderTest.class.getClassLoader();
        System.out.println("ClassLoader is:"+cl.toString());
        System.out.println("ClassLoader's parent is:"+cl.getParent().toString());
    }
    @Test
    void parentOfExClassLoader(){
        ClassLoader cl = ClassLoaderTest.class.getClassLoader();
        System.out.println("ClassLoader is:"+cl.toString());
        System.out.println("ClassLoader's parent is:"+cl.getParent().toString());
        assertNull(cl.getParent().getParent());
    }
}