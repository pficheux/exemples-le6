DESCRIPTION = "systemd example"
LICENSE = "CLOSED"

inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "hello.service"

SRC_URI:append = " file://hello.service file://hello.sh"

FILES:${PN} += "${systemd_unitdir}/system/hello.service"

do_install:append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/hello.service ${D}/${systemd_unitdir}/system
  mkdir -p ${D}${bindir}
  install -m 0755 ${WORKDIR}/hello.sh ${D}${bindir}/hello.sh
}
