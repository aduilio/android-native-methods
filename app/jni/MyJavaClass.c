#include <string.h>
#include <jni.h>
#include "MyJavaClass.h"

#define INFO "Olá, estou no arquivo .so"

/*
 * Class:     com_example_aduilio_nativemethods_MyJavaClass
 * Method:    getInfo
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_aduilio_nativemethods_MyJavaClass_getInfo
  (JNIEnv *env, jobject thiz) {
	return (*env)->NewStringUTF(env, INFO);
}

