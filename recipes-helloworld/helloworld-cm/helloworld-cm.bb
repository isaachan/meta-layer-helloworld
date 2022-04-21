# helloworld application

SUMMARY = "This is helloworld application built by CMake"
DESCRIPTION = "Helloworld application"
LICENSE = "CLOSED"

inherit cmake

FILESEXTRAPATHS_prepend := "${THISDIR}/:"
SRC_URI = "file://helloworld/"

S = "${WORKDIR}/helloworld"

FILES_${PN} = "${bindir}/"
