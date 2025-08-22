SOC_FAMILY = "rk3566"

require conf/machine/include/arm/arch-armv8a.inc
require conf/machine/include/soc-family.inc

#UBOOT_SUFFIX = "img"
#UBOOT_BINARY = "u-boot.img"
#UBOOT_IMAGE = "u-boot-${MACHINE}.img"


MACHINEOVERRIDES =. "mali-gpu:mali-midgard:"

PREFERRED_PROVIDER_virtual/kernel = "linux-orangepi-4-lts"
PREFERRED_VERSION_linux-orangechip = "5.10.160"

SERIAL_CONSOLES = "1500000;ttyFIQ0"
KERNEL_IMAGETYPE = "Image"
KBUILD_DEFCONFIG = "rockchip_linux_defconfig"

PREFERRED_PROVIDER_virtual/bootloader ?= "u-boot-orangepi-4-lts"

MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS += "\
   kernel-modules \
   resize-helper \
"

IMAGE_FSTYPES += "rockchip-orangepi-gpt-img"
IMAGE_CLASSES += "rockchip-orangepi-gpt-img"
