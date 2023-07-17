SUMMARY = "TorizonCore k3s"
DESCRIPTION = "TorizonCore Linux with k3s."

require recipes-images/images/torizon-core-container.inc

CORE_IMAGE_BASE_INSTALL:append = " \
    packagegroup-k3s-host \
"

DISTRO_FEATURES:append = " virtualization k8s"

IMAGE_VARIANT = "k3s"

inherit extrausers
