SUMMARY = "Genivi CommonAPI-SomeIP"
SECTION = "commonapi"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

DEPENDS = "boost capicxx-core-runtime vsomeip"

SRCREV = "e21e8f37195b3d37faf1d179d182dd3b87e826f0"
SRC_URI = "git://github.com/GENIVI/capicxx-someip-runtime.git;protocol=https"

S = "${WORKDIR}/git"

inherit cmake lib_package gitpkgv

EXTRA_OECMAKE += "-DUSE_INSTALLED_COMMONAPI=ON"
CXXFLAGS := "${@oe_filter_out('-fvisibility-inlines-hidden', '${CXXFLAGS}', d)}"

FILES_${PN}-dev += "${libdir}/cmake"

RDEPENDS_${PN}-dev = "vsomeip-dev"
