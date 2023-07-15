SUMMARY = "TorizonCore k3s"
DESCRIPTION = "TorizonCore Linux with k3s."

require recipes-images/images/torizon-core-container.inc

CORE_IMAGE_BASE_INSTALL:append = " \
    k3s \
"

IMAGE_VARIANT = "k3s"

inherit extrausers

EXTRA_USERS_PARAMS += "\
usermod -a -G torizon; \
"
