--- sync_default.go.orig	2021-06-24 03:41:13 UTC
+++ sync_default.go
@@ -15,7 +15,7 @@
 // a commercial license, send an email to license@arduino.cc.
 //
 
-// +build !linux,!windows,!darwin
+// +build !linux,!windows,!darwin,!freebsd
 
 package main
 
