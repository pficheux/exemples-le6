#
# Hello World library (Autotools)
#
DESCRIPTION = "Helloworld library (autotools)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
PR = "r0"

SRC_URI = "http://pficheux.free.fr/pub/tmp/bbexample-lib-1.0.tar.gz"

inherit autotools

SRC_URI[md5sum] = "d35d3a7b65a46d884954d04a8c1df89d"
