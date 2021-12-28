package test;/*
 * Copyright
 */

/**
 * @author Bao.f
 * @version V1.0
 */
public class JNITest  {

    static {
        System.loadLibrary("JNITest");
    }

    public static native void sayHelloWorld(String msg);

    public static void main(String[] args) {
//        System.out.println(System.getProperty("java.library.path"));
        sayHelloWorld("Hello, world");
    }

}
