# helloworld application

SUMMARY = "This is helloworld application built by Autotools"
DESCRIPTION = "Helloworld application"
LICENSE = "CLOSED"

inherit autotools

FILESEXTRAPATHS_prepend := "${THISDIR}/:"
SRC_URI = "file://helloworld/"

S = "${WORKDIR}/helloworld"

FILES_${PN} = "${bindir}/"
