# Copyright (C) 2021, Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

inherit auto-patch

inherit freeze-rev local-git

SRCREV = "29af993b46f024360e6d02c0d26c9fd3057aa918"
SRC_URI = " \
	git://github.com/JeffyCN/mirrors.git;protocol=https;nobranch=1;branch=kernel-5.10-2021_12_23; \
"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"