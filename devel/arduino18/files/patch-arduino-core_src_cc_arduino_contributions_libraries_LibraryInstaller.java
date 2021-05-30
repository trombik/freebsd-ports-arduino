--- arduino-core/src/cc/arduino/contributions/libraries/LibraryInstaller.java.orig	2021-05-14 13:23:52 UTC
+++ arduino-core/src/cc/arduino/contributions/libraries/LibraryInstaller.java
@@ -68,47 +68,6 @@ public class LibraryInstaller {
   }
 
   public synchronized void updateIndex(ProgressListener progressListener) throws Exception {
-    final MultiStepProgress progress = new MultiStepProgress(3);
-
-    DownloadableContributionsDownloader downloader = new DownloadableContributionsDownloader(BaseNoGui.librariesIndexer.getStagingFolder());
-    // Step 1: Download index
-    File outputFile = BaseNoGui.librariesIndexer.getIndexFile();
-    // Create temp files
-    String signatureFileName = FilenameUtils.getName(new URL(Constants.LIBRARY_INDEX_URL).getPath());
-    File libraryIndexTemp = File.createTempFile(signatureFileName, ".tmp");
-    final URL libraryURL = new URL(Constants.LIBRARY_INDEX_URL);
-    final URL libraryGzURL = new URL(Constants.LIBRARY_INDEX_URL_GZ);
-    final String statusText = tr("Downloading libraries index...");
-    try {
-      GZippedJsonDownloader gZippedJsonDownloader = new GZippedJsonDownloader(downloader, libraryURL, libraryGzURL);
-      gZippedJsonDownloader.download(libraryIndexTemp, progress, statusText, progressListener, true);
-    } catch (InterruptedException e) {
-      // Download interrupted... just exit
-      return;
-    }
-    progress.stepDone();
-
-    URL signatureUrl = new URL(libraryURL.toString() + ".sig");
-    if (downloader.verifyDomain(signatureUrl)) {
-      if (downloader.checkSignature(progress, signatureUrl, progressListener, signatureVerifier, statusText, libraryIndexTemp)) {
-        // Replace old index with the updated one
-        if (libraryIndexTemp.length() > 0) {
-          Files.move(libraryIndexTemp.toPath(), outputFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
-        }
-      } else {
-        FileDownloader.invalidateFiles(libraryGzURL, libraryURL, signatureUrl);
-        log.error("Fail to verify the signature of {} the cached files have been removed", libraryURL);
-      }
-    } else {
-      log.info("The domain is not selected to verify the signature. library index: {}", signatureUrl);
-    }
-
-    // Step 2: Parse index
-    BaseNoGui.librariesIndexer.parseIndex();
-
-    // Step 3: Rescan index
-    rescanLibraryIndex(progress, progressListener);
-
   }
 
   public void install(ContributedLibrary lib, ProgressListener progressListener) throws Exception {
