LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := fluttertest
LOCAL_SRC_FILES := \
    $(LOCAL_PATH)/test.cpp  \


#NDK < 21 时，如果同时设置-fuse-ld=lld和--build-id就会触发生成形如BuildID[xxHash]=086ed6b255edf06d，lldb无法识别此类型的BuildID
#LOCAL_LDFLAGS := -fuse-ld=lld -Wl,--build-id

LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)
