HELLO_GENERIC_SOURCE = hello-generic.tar.gz
HELLO_GENERIC_SITE = http://pficheux.free.fr/pub/tmp

HELLO_GENERIC_DEPENDENCIES = simple-dependency

define HELLO_GENERIC_BUILD_CMDS
	$(TARGET_CONFIGURE_OPTS) $(MAKE) -C $(@D)
endef

define HELLO_GENERIC_INSTALL_TARGET_CMDS
	$(TARGET_CONFIGURE_OPTS) $(MAKE) -C $(@D) DESTDIR="$(TARGET_DIR)" install
endef

$(eval $(generic-package))

