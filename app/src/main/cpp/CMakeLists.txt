cmake_minimum_required(VERSION 3.4.1)

add_library(
        test_code
        SHARED
        test_code.cpp
)

find_library(
        test_code
        log
)

target_link_libraries(
        test_code
        ${log-lib}
)