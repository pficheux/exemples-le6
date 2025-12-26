DESCRIPTION = "SysVInit service example"

LICENSE = "CLOSED"

SRC_URI = "file://init file://my_loop.sh"

inherit update-rc.d

INITSCRIPT_NAME = "hello-sysvinit"
INITSCRIPT_PARAMS = "defaults 99"

do_install:append() {
        mkdir -p ${D}${bindir}
        install -m 0755 ${WORKDIR}/my_loop.sh ${D}${bindir}
        install -d ${D}${sysconfdir}/init.d
        install -m 0755 ${WORKDIR}/init  ${D}${sysconfdir}/init.d/hello-sysvinit
}

