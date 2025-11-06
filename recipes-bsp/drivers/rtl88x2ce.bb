SUMMARY = "RTL88x2CE kernel driver (wifi)"
DESCRIPTION = "RTL88x2CE kernel driver (like RTL8812CE)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://core/rtw_ap.c;md5=a43e610cf16f15641fa3a0fe21b6e40e "

SRCREV = "ae4c11130ee931df10bb9cc88c2cd0a7d3968fe2"
SRC_URI = " \
	https://github.com/juanro49/rtl88x2ce-dkms;protocol=https;branch=master \
	file://0001-fix-makefile.patch \
"
PV = "5.7.3-git"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
