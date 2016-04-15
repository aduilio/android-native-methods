package com.example.aduilio.nativemethods;

public class MyJavaClass {

    static {
        System.loadLibrary("jni-example");
    }

    public native String getInfo();
}
