HELLO_CMAKE_GIT_VERSION =bf6946955e17bd8c92f118ecd6ab94a58ea1324f 
HELLO_CMAKE_GIT_SITE = $(call github,pficheux,hello-cmake-git,$(HELLO_CMAKE_GIT_VERSION))

$(eval $(cmake-package))
