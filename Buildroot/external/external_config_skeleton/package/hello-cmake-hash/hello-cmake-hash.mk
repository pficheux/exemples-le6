HELLO_CMAKE_HASH_VERSION = 1.0
HELLO_CMAKE_HASH_SOURCE = hello-cmake-hash-$(HELLO_CMAKE_HASH_VERSION).tar.gz
HELLO_CMAKE_HASH_SITE = http://pficheux.free.fr/pub/tmp

$(eval $(cmake-package))
