package com.example.rainbow;

public class CppSorter {
    static {
        System.loadLibrary("rainbow");
    }

    public long bubble() {
        return cppBubble();
    }

    public native long cppBubble();
}
