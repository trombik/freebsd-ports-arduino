--- arduino-core/src/processing/app/BaseNoGui.java.orig	2021-05-14 13:23:52 UTC
+++ arduino-core/src/processing/app/BaseNoGui.java
@@ -702,7 +702,7 @@ public class BaseNoGui {
       if (installedFolder != null) {
         toolPath = installedFolder.getAbsolutePath();
       } else {
-        toolPath = Constants.PREF_REMOVE_PLACEHOLDER;
+        toolPath = "%%PREFIX%%";
       }
       String toolName = tool.getName();
       String toolVersion = tool.getVersion();
