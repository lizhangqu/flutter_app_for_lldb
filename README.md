# flutter app for lldb debug

See [Flutter Engine C++ 源码调试初探](https://fucknmb.com/2019/12/06/Flutter-Engine-C-%E6%BA%90%E7%A0%81%E8%B0%83%E8%AF%95%E5%88%9D%E6%8E%A2/)

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
