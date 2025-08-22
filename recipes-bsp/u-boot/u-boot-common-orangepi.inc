HOMEPAGE = "https://github.com/orangepi-xunlong/u-boot-orangepi"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"

SRC_URI = " \
	git://github.com/orangepi-xunlong/u-boot-orangepi;branch=v2017.09-rk3588; \
"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
