--- arduino-core/src/cc/arduino/contributions/packages/ContributionsIndexer.java.orig	2021-05-25 05:33:04 UTC
+++ arduino-core/src/cc/arduino/contributions/packages/ContributionsIndexer.java
@@ -85,27 +85,6 @@ public class ContributionsIndexer {
     File bundledIndexFile = new File(builtInHardwareFolder, Constants.BUNDLED_INDEX_FILE_NAME);
     mergeContributions(bundledIndexFile);
 
-    // ...and overlay the default index if present
-    File defaultIndexFile = getIndexFile(Constants.DEFAULT_INDEX_FILE_NAME);
-    if (defaultIndexFile.exists()) {
-      // Check main index signature
-      if (signatureVerifier.isSigned(defaultIndexFile)) {
-        mergeContributions(defaultIndexFile);
-      } else if (PreferencesData.areInsecurePackagesAllowed()) {
-        System.err.println(format(tr("Warning: forced trusting untrusted contributions")));
-        mergeContributions(defaultIndexFile);
-      } else {
-        BaseNoGui
-            .showWarning(Constants.DEFAULT_INDEX_FILE_NAME,
-                              tr("A package index has an invalid signature and needs to be updated.\n"
-                                 + "Please open the Board Manager from the menu\n"
-                                 + "\n" //
-                                 + "      Tools -> Board -> Board Manager\n"
-                                 + "\nto update it"),
-                              null);
-      }
-    }
-
     // Set main and bundled indexes as trusted
     index.getPackages().forEach(pack -> pack.setTrusted(true));
 
