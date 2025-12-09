# Celsius to Fahrenheit utility (CMake version)
DESCRIPTION = "Celsius to Fahrenheit utility"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "http://pficheux.free.fr/pub/tmp/fahr-2.0.tar.gz"

inherit cmake ptest

SRC_URI[md5sum] = "8cd41891470ea0e909181d3a1ec6d47e"
