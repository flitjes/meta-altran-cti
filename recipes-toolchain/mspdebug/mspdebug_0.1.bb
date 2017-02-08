DESCRIPTION = "mspdebug"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://COPYING;md5=3178b603d6560dc009468f671919776f"

SRCREV = "a16ef760ab65ab0d7496d04317c6419d006b4ceb"
SRC_URI = "git://github.com/dlbeer/mspdebug.git;protocol=http"

PV = "1.0+${SRCPV}"

S = "${WORKDIR}/git"
DEPENDS = "libusb readline"
do_compile() {
	  make
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 mspdebug ${D}${bindir}
}
