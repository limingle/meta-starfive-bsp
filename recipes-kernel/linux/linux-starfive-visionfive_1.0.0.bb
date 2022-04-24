SUMMARY = "VisionFive kernel recipe"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV = "${LINUX_VERSION}+git${SRCPV}"

KERNEL_VERSION_SANITY_SKIP = "1"

#SRCREV = "${AUTOREV}"
SRCREV = "0729a282564fe3940277937536b1e67f98885c49"

BRANCH ?= "visionfive"
SRC_URI = "git://github.com/limingle/starfive-linux.git;protocol=https;branch=${BRANCH} \
          "
LINUX_VERSION ?= "5.18.0"
LINUX_VERSION_EXTENSION:append = "-limingle"

KCONFIG_MODE = "--alldefconfig"

KERNEL_FEATURES:remove = "features/debug/printk.scc"
KERNEL_FEATURES:remove = "features/kernel-sample/kernel-sample.scc"

KBUILD_DEFCONFIG:starfive-visionfive-jh7100 = "visionfive_defconfig"

COMPATIBLE_MACHINE = "(starfive-visionfive-jh7100)"
