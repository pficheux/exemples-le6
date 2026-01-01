define MY_SCRIPT_INSTALL_INIT_SYSV
	$(INSTALL) -D -m 0755 $(BR2_EXTERNAL_SYSVINIT_PATH)/package/my_script/S60my_script  \
	$(TARGET_DIR)/etc/init.d/S60my_script
	$(INSTALL) -D -m 0755 $(BR2_EXTERNAL_SYSVINIT_PATH)/package/my_script/my_script.sh \
	$(TARGET_DIR)/usr/bin
endef

define MY_SCRIPT_INSTALL_INIT_SYSTEMD
	$(INSTALL) -D -m 644 $(BR2_EXTERNAL_SERVICE_PATH)/package/my_script/my_script.service \
	$(TARGET_DIR)/usr/lib/systemd/system/my_script.service
	$(INSTALL) -D -m 755 $(BR2_EXTERNAL_SERVICE_PATH)/package/my_script/my_script.sh \
	$(TARGET_DIR)/usr/bin
endef

$(eval $(generic-package))
