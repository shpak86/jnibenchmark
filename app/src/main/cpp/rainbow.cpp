#include <jni.h>
#include "csorter.h"
#include <ctime>
#include <cmath>

// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("rainbow");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("rainbow")
//      }
//    }

extern "C"
JNIEXPORT jlong JNICALL
Java_com_example_rainbow_CppSorter_cppBubble(JNIEnv *env, jobject thiz) {
    csorter sorter = csorter();

    struct timeval t;
    gettimeofday(&t, nullptr);
    time_t start_time = (t.tv_sec * 1000) + (t.tv_usec / 1000);
    sorter.bubble();
    gettimeofday(&t, nullptr);
    time_t finish_time = (t.tv_sec * 1000) + (t.tv_usec / 1000);
    return finish_time - start_time;
}