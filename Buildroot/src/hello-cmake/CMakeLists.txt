cmake_minimum_required(VERSION 2.0)
ADD_EXECUTABLE(hello-cmake hello-cmake.c)
INSTALL(TARGETS hello-cmake DESTINATION "bin")
