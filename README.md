# flutter app for lldb debug


create link to flutter engine src

```
git clone https://github.com/lizhangqu/flutter_app_for_lldb.git
cd flutter_app_for_lldb
ln -s /path/to/engine/src ./android/flutter_source
```



config local engine path in android/gradle.properties

```
target-platform=android-arm
localEngineOut=/path/to/engine/src/out/android_debug_unopt
```