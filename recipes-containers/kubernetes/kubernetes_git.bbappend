do_install:append() {
        rm -f ${D}/bin/k8s-init
        rm -rf ${D}/bin
}