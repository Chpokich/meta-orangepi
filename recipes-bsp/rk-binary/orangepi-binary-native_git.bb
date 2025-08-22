inherit native deploy

DESCRIPTION = "Rockchip-OrangPi binary tools"

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://${THISDIR}/dummy;md5=d41d8cd98f00b204e9800998ecf8427e"
NO_GENERIC_LICENSE[BINARY] = "LICENSE.TXT"

SRC_URI = "git://github.com/rockchip-linux/rkbin;branch=master;"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/"

do_install () {
	install -d ${D}/${bindir}
	install -m 0755 "${S}/tools/trust_merger" ${D}/${bindir}
	install -m 0755 "${S}/tools/firmwareMerger" ${D}/${bindir}

	install -m 0755 "${S}/tools/kernelimage" ${D}/${bindir}
	install -m 0755 "${S}/tools/loaderimage" ${D}/${bindir}

	install -m 0755 "${S}/tools/mkkrnlimg" ${D}/${bindir}
	install -m 0755 "${S}/tools/resource_tool" ${D}/${bindir}

}
