do_install:append() {
        install -d ${D}${bindir}
        install -m 0755 "${S}/src/import/dist/artifacts/k3s" ${D}${bindir}
        ln -sr ${D}${bindir}/k3s ${D}${bindir}/crictl
        ln -sr ${D}${bindir}/k3s ${D}${bindir}/kubectl
        install -m 0755 "${WORKDIR}/k3s-clean" ${D}${bindir}
        install -m 0755 "${WORKDIR}/k3s-killall.sh" ${D}${bindir}

        if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
                install -m 755 "${WORKDIR}/k3s-agent" ${D}${bindir}
        fi
}