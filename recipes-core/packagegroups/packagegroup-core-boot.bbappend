# Убираем brcmfmac, чтобы не ломалась сборка для orangepi-4-lts
RDEPENDS_packagegroup-core-boot_remove = "brcmfmac"
RDEPENDS_packagegroup-core-boot-dev_remove = "brcmfmac"
RDEPENDS_packagegroup-core-boot-staticdev_remove = "brcmfmac"

# Для отладки, чтобы точно видеть, что append применяется
python __anonymous() {
    bb.warn("HELLO FROM APPEND! brcmfmac removed from packagegroup-core-boot")
}
