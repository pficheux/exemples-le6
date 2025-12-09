DESCRIPTION = "This is a simple Hello World recipe - downloads the application from github and uses CMake to build it"
HOMEPAGE = "https://kickstartembedded.com"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45269dcabf49617cca580ad6878cbcd2"

SRCREV = "09906a2b36bd9a12292b23c07cee5741f9c3af86"
PV = "0.1+git${SRCPV}"
SRC_URI = "git://github.com/pficheux/yocto-test-apps.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake


