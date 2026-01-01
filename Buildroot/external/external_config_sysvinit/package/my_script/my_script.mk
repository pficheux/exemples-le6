define MY_SCRIPT_INSTALL_INIT_SYSV
	$(INSTALL) -D -m 0755 $(BR2_EXTERNAL_SYSVINIT_PATH)/package/my_script/S60my_script  \
	$(TARGET_DIR)/etc/init.d/S60my_script
	$(INSTALL) -D -m 0755 $(BR2_EXTERNAL_SYSVINIT_PATH)/package/my_script/my_script.sh \
	$(TARGET_DIR)/usr/bin
endef

$(eval $(generic-package))
