# Hello World example  + library (Autotools)
DESCRIPTION = "Helloworld software with library (autotools)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
PR = "r0"

DEPENDS = "bbexample-lib"

SRC_URI = "http://pficheux.free.fr/pub/tmp/hello-example-lib-1.0.tar.gz"

inherit autotools

SRC_URI[md5sum] = "11c5e2918b22b1314a3a42ce82db7cd1"
