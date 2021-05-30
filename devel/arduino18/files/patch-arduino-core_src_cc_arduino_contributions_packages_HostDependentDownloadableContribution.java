--- arduino-core/src/cc/arduino/contributions/packages/HostDependentDownloadableContribution.java.orig	2021-05-14 13:23:52 UTC
+++ arduino-core/src/cc/arduino/contributions/packages/HostDependentDownloadableContribution.java
@@ -106,6 +106,16 @@ public class HostDependentDownloadableContribution ext
       }
     }
 
+    if (osName.contains("FreeBSD")) {
+      if (osArch.contains("amd64")) {
+        return host.matches("x86_64-freebsd[0-9]*");
+      } else if (osArch.contains("arm")) {
+        return host.matches("arm.*-freebsd[0-9]*");
+      } else {
+        return host.matches("i386-freebsd[0-9]*");
+      }
+    }
+
     return false;
   }
 }
