DESCRIPTION = "SysVInit service example"

LICENSE = "CLOSED"

SRC_URI = "file://init file://my_loop.sh"

inherit update-rc.d

SRC_URI[md5sum] = "4de05eaab461e23f8d352a7ff1a69cbc"

INITSCRIPT_NAME = "hello-sysvinit"
INITSCRIPT_PARAMS = "defaults 99"

do_install:append() {
        mkdir -p ${D}${bindir}
        install -m 0755 ${WORKDIR}/my_loop.sh ${D}${bindir}
        install -d ${D}${sysconfdir}/init.d
        install -m 0755 ${WORKDIR}/init  ${D}${sysconfdir}/init.d/hello-sysvinit
}

