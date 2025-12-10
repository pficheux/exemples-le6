DESCRIPTION = "Celsius to Fahrenheit utility (CMake based)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

# New revision with ptest support
PR = "r1"

SRC_URI = "http://pficheux.free.fr/pub/tmp/fahr-2.0.tar.gz"
SRC_URI += "file://run-ptest file://temp-list.txt"

inherit cmake ptest

do_install_ptest () {
	cp ${WORKDIR}/temp-list.txt ${D}${PTEST_PATH}
}

SRC_URI[md5sum] = "8cd41891470ea0e909181d3a1ec6d47e"
