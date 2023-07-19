SUMMARY = "TorizonCore K3s Server Node"
DESCRIPTION = "TorizonCore Linux with K3s Server."

require recipes-images/images/torizon-core-container.inc

CORE_IMAGE_BASE_INSTALL:append = " \
    packagegroup-k3s-host \
"

DISTRO_FEATURES:append = " virtualization k8s"

IMAGE_VARIANT = "k3s"

inherit extrausers
