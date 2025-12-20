SUMMARY = "Samples device tree overlay"
SECTION = "bsp"

inherit devicetree

PROVIDES = "virtual/dtb"

SRC_URI += "file://mydevice.dts"

# Change to your machine
COMPATIBLE_MACHINE = "(qemuarm|qemuarmv5)"

