#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT int JNI_OnLoad(JavaVM *vm, void *reserved) {
    return JNI_VERSION_1_6;
}

#ifdef __cplusplus
}
#endif