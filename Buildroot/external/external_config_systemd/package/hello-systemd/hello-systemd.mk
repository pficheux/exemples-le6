define HELLO_SYSTEMD_INSTALL_INIT_SYSTEMD
	$(INSTALL) -D -m 644 $(BR2_EXTERNAL_SYSTEMD_PATH)/package/hello-systemd/hello-systemd.service $(TARGET_DIR)/usr/lib/systemd/system/hello-systemd.service
	$(INSTALL) -D -m 755 $(BR2_EXTERNAL_SYSTEMD_PATH)/package/hello-systemd/hello-systemd.sh $(TARGET_DIR)/usr/bin
endef

$(eval $(generic-package))
