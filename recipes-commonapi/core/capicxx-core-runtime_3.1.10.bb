SUMMARY = "Genivi CommonAPI"
SECTION = "commonapi"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

inherit cmake lib_package pkgconfig

SRCREV = "a4c5fed7760238b2ef0e3b204801fed088c99fa7"

SRC_URI = "git://github.com/GENIVI/capicxx-core-runtime.git;protocol=https"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_PREFIX=/usr \
    -DINSTALL_LIB_DIR:PATH=${baselib} \
    -DINSTALL_CMAKE_DIR:PATH=${baselib}/cmake/CommonAPI \
    "

FILES_${PN}-dev += "${libdir}/cmake"
