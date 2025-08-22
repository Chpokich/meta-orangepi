DEFAULT_PREFERENCE = "1"

DESCRIPTION = "OrangePi 4 LTS U-Boot"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

include u-boot-orangepi.inc

SRC_URI = " \
	git://github.com/orangepi-xunlong/u-boot-orangepi;branch=v2017.09-rk3588; \
"

SRCREV = "${AUTOREV}"
