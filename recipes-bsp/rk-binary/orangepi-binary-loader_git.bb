DESCRIPTION = "Rockchip-OrangePi binary loader"

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://${THISDIR}/dummy;md5=d41d8cd98f00b204e9800998ecf8427e"
NO_GENERIC_LICENSE[BINARY] = "LICENSE.TXT"

DEPENDS = "orangepi-binary-native"

SRC_URI = "git://github.com/rockchip-linux/rkbin;branch=master;"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/bin/rk35"


LOADER_rk3566 ?= "rk356x_spl_v1.14.bin"

MINILOADER_rk3566 ?= "rk356x_spl_v1.14.bin"

DDR_rk3566 ?= "rk3566_ddr_1056MHz_D3_LP3_eyescan_v1.23.bin"

BL31_rk3566 ?= "rk3568_bl31_ultra_v2.17.elf"

inherit deploy

DDR_BIN = "ddr.bin"
LOADER_BIN = "loader.bin"
MINILOADER_BIN = "miniloader.bin"
ATF_BIN = "atf.bin"
UBOOT_IMG = "uboot.img"
UBOOT_ITB = "u-boot.itb"
BL31_ELF = "bl31.elf"

RKBINARY_DEPLOY_DIR = "${DEPLOYDIR}/orangepi-binary"

do_deploy () {
	install -d ${RKBINARY_DEPLOY_DIR}
	[ ${DDR} ] && cp ${S}/${DDR} ${RKBINARY_DEPLOY_DIR}/${DDR_BIN}
	[ ${MINILOADER} ] && cp ${S}/${MINILOADER} ${RKBINARY_DEPLOY_DIR}/${MINILOADER_BIN}	
	[ ${LOADER} ] && cp ${S}/${LOADER} ${RKBINARY_DEPLOY_DIR}/${LOADER_BIN}
	[ ${ATF} ] && cp ${S}/${ATF} ${RKBINARY_DEPLOY_DIR}/${ATF_BIN}
	[ ${BL31} ] && cp ${S}/${BL31} ${RKBINARY_DEPLOY_DIR}/${BL31_ELF}
}

addtask deploy before do_build after do_compile

do_package[noexec] = "1"
do_packagedata[noexec] = "1"
do_package_write[noexec] = "1"
do_package_write_ipk[noexec] = "1"
do_package_write_rpm[noexec] = "1"
do_package_write_deb[noexec] = "1"
do_package_write_tar[noexec] = "1"
