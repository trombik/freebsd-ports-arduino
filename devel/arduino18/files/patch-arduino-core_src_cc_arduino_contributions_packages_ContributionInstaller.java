--- arduino-core/src/cc/arduino/contributions/packages/ContributionInstaller.java.orig	2021-05-14 13:23:52 UTC
+++ arduino-core/src/cc/arduino/contributions/packages/ContributionInstaller.java
@@ -284,29 +284,5 @@ public class ContributionInstaller {
   }
 
   public synchronized void updateIndex(ProgressListener progressListener) {
-    MultiStepProgress progress = new MultiStepProgress(1);
-
-    final DownloadableContributionsDownloader downloader = new DownloadableContributionsDownloader(BaseNoGui.indexer.getStagingFolder());
-
-    final Set<String> packageIndexURLs = new HashSet<>(
-      PreferencesData.getCollection(Constants.PREF_BOARDS_MANAGER_ADDITIONAL_URLS)
-    );
-    packageIndexURLs.add(Constants.PACKAGE_INDEX_URL);
-
-    for (String packageIndexURLString : packageIndexURLs) {
-      try {
-        // Extract the file name from the URL
-        final URL packageIndexURL = new URL(packageIndexURLString);
-
-        log.info("Start download and signature check of={}", packageIndexURLs);
-        downloader.downloadIndexAndSignature(progress, packageIndexURL, progressListener, signatureVerifier);
-      } catch (Exception e) {
-        log.error(e.getMessage(), e);
-        System.err.println(e.getMessage());
-      }
-    }
-
-    progress.stepDone();
-    log.info("Downloaded package index URL={}", packageIndexURLs);
   }
 }
