inherit deploy nopackages

LICENSE = "CLOSED"

INHIBIT_DEFAULT_DEPS = "1"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "file://uEnv.txt \
          "

do_configure:prepend() {
    sed -i -e 's,@IMAGETYPE@,${KERNEL_IMAGETYPE},g' ${WORKDIR}/uEnv.txt
}

do_deploy() {
    if [ -f "${WORKDIR}/uEnv.txt" ]; then
        install -d ${DEPLOY_DIR_IMAGE}
        install -m 755 ${WORKDIR}/uEnv.txt ${DEPLOY_DIR_IMAGE}/uEnv.txt
    fi

}

addtask deploy before do_build after do_install

COMPATIBLE_MACHINE = "(starfive-visionfive-jh7100)"
#PACKAGE_ARCH = "${MACHINE_ARCH}"

