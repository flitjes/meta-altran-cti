#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SUMMARY = "Simple helloworld application"
SRCREV = "${AUTOREV}"
PV = "1.97+svnr${SRCPV}"
PR = "r6"
SRC_URI = "svn://svn.code.sf.net/p/lpc21isp/;module=code;protocol=https \
	  file://lpcprog_824.patch \  
          file://Makefile_yocto.patch"

S = "${WORKDIR}/code"
DEPENDS = ""

do_install() {
	install -d ${D}${bindir}
	install -m 0755 lpc21isp ${D}${bindir}
}
