DESCRIPTION = "Helloworld software (autotools + external file)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "http://pficheux.free.fr/pub/tmp/hello-example-msg-1.0.tar.gz file://message.h" 

inherit autotools

EXTRA_OEMAKE = "CFLAGS=-I../"

SRC_URI[md5sum] = "dee778412bea8fe5c832351623fd8ad5"

