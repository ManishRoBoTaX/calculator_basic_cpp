// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("calculator_basic");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("calculator_basic")
//      }
//    }
#include<jni.h>

extern "C" JNIEXPORT jint JNICALL
Java_com_example_calculator_basic_MainActivity_add(JNIEnv *env, jobject, jint a, jint b){
    return a+b;
}
extern "C" JNIEXPORT jint JNICALL
Java_com_example_calculator_basic_MainActivity_sub(JNIEnv *env, jobject, jint a, jint b){
    return a-b;
}
extern "C" JNIEXPORT jint JNICALL
Java_com_example_calculator_basic_MainActivity_mul(JNIEnv *env, jobject, jint a, jint b){
    return a*b;
}
extern "C" JNIEXPORT jint JNICALL
Java_com_example_calculator_basic_MainActivity_div(JNIEnv *env, jobject, jint a, jint b){
    if (b==0) return 0;
    return a/b;
}