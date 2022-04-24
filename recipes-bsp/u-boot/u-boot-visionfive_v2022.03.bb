require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "git://github.com/starfive-tech/u-boot.git;protocol=https;branch=JH7100_upstream \
           file://uEnv_visionfive.txt \
          "

SRCREV = "0c08d335c5acb6b1293f89d621c7271a27c20065"

DEPENDS:append = " u-boot-tools-native"


do_deploy:append() {
    if [ -f "${WORKDIR}/uEnv_visionfive.txt" ]; then
        install -d ${DEPLOY_DIR_IMAGE}
        install -m 755 ${WORKDIR}/uEnv_visionfive.txt ${DEPLOY_DIR_IMAGE}/uEnv.txt
    fi
}

COMPATIBLE_MACHINE = "(starfive-visionfive-jh7100)"

TOOLCHAIN = "gcc"
