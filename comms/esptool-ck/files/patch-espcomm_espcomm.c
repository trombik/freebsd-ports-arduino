--- espcomm/espcomm.c.orig	2021-05-30 22:14:34 UTC
+++ espcomm/espcomm.c
@@ -55,6 +55,8 @@ static const char *espcomm_port =
 "COM1";
 #elif defined(__linux__)
 "/dev/ttyUSB0";
+#elif defined(__FreeBSD__)
+"/dev/cuaU0";
 #else
 "";
 #endif
