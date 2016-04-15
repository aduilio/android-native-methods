LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := jni-example
LOCAL_SRC_FILES := MyJavaClass.c

include $(BUILD_SHARED_LIBRARY)
