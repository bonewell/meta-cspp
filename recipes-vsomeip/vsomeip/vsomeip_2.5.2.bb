SUMMARY = "the implementation of SOME/IP"
SECTION = "base"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

DEPENDS = "boost"

SRCREV = "1a230558936ec84b4fb44b2346dc5ae52d6f2805"
SRC_URI = "git://github.com/GENIVI/vsomeip.git;protocol=https \
           file://build_fixup.patch \
"

S = "${WORKDIR}/git"

inherit cmake lib_package gitpkgv

CXXFLAGS := "${@oe_filter_out('-fvisibility-inlines-hidden', '${CXXFLAGS}', d)}"

PACKAGES_remove += "${PN}-bin"
FILES_${PN} += "${bindir}/vsomeipd"
FILES_${PN}-dev += "${libdir}/cmake"
