--- argparse/argparse.c.orig	2021-05-30 22:18:05 UTC
+++ argparse/argparse.c
@@ -98,7 +98,8 @@ they are given.\n\
 \n\
 -cp <device>\n\
     Select the serial port device to use for communicating with the ESP.\n\
-    Default is /dev/ttyUSB0 on Linux, COM1 on Windows, /dev/tty.usbserial on Mac OS.\n\
+    Default is /dev/ttyUSB0 on Linux, COM1 on Windows, /dev/tty.usbserial on Mac OS,\n\
+    /dev/cuaU0 on FreeBSD.\n\
 \n\
 -cd <board>\n\
     Select the reset method to use for resetting the board.\n\
