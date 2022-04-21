# helloworld application

SUMMARY = "This is helloworld application built by Makefile"
DESCRIPTION = "Helloworld application"
LICENSE = "CLOSED"


FILESEXTRAPATHS_prepend := "${THISDIR}/:"
SRC_URI = "file://helloworld/"

S = "${WORKDIR}/helloworld"

CFLAGS_append = "-Wall -O -g"

EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS}'"
EXTRA_OEMAKE_append = " 'LDFLAGS=${LDFLAGS}'"
EXTRA_OEMAKE_append = " 'DESTDIR=${D}'"

do_install () {
	oe_runmake install
}

FILES_${PN} = "${bindir}/"

