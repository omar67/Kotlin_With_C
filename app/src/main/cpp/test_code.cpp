//
// Created by shb7almot on 2021-06-30.
//
#include <string.h>
#include <iostream>
#include <jni.h>



// Java Native Interface
extern "C" JNIEXPORT jstring

JNICALL
// getText() Function path in MainActivity
Java_com_omar67_kotlinwithc_MainActivity_getText(JNIEnv *env, jobject thiz) {
    std::string str = "Hello, This is  C++ Code!!!";
    return env->NewStringUTF(str.c_str());
}


