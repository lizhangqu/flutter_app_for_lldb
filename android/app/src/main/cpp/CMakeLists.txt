cmake_minimum_required(VERSION 3.6)
project(FlutterTest)

set(
        FlutterTest_FILES
        ${CMAKE_SOURCE_DIR}/test.cpp
)

#NDK < 21 时，如果同时设置-fuse-ld=lld和--build-id就会触发生成形如BuildID[xxHash]=086ed6b255edf06d，lldb无法识别此类型的BuildID
#set(CMAKE_SHARED_LINKER_FLAGS "-fuse-ld=lld -Wl,--build-id")

add_library(fluttertest SHARED ${FlutterTest_FILES})
target_link_libraries(
        fluttertest
        log
)