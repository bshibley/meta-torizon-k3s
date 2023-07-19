SUMMARY = "TorizonCore K3s Agent Node"
DESCRIPTION = "TorizonCore Linux with K3s Agent."

require recipes-images/images/torizon-core-container.inc

CORE_IMAGE_BASE_INSTALL:append = " \
    packagegroup-k3s-node \
"

DISTRO_FEATURES:append = " virtualization k8s"

IMAGE_VARIANT = "k3s"

inherit extrausers
