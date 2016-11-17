SUMMARY = "Image for CSPP project based on core-image-minimal"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL_append = " capicxx-core-runtime"

IMAGE_FEATURES += "package-management"

IMAGE_FEATURES += "ssh-server-openssh"
