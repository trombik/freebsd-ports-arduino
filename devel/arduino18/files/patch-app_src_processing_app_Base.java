--- app/src/processing/app/Base.java.orig	2021-05-14 13:23:52 UTC
+++ app/src/processing/app/Base.java
@@ -503,7 +503,7 @@ public class Base {
       new Thread(new NewBoardListener(this)).start();
 
       // Check for updates
-      if (PreferencesData.getBoolean("update.check")) {
+      if (false) {
         new UpdateCheck(this);
 
         contributionsSelfCheck = new ContributionsSelfCheck(this, new UpdatableBoardsLibsFakeURLsHandler(this), contributionInstaller, libraryInstaller);
@@ -1108,15 +1108,6 @@ public class Base {
       return;
     importMenu.removeAll();
 
-    JMenuItem menu = new JMenuItem(tr("Manage Libraries..."));
-    // Ctrl+Shift+I on Windows and Linux, Command+Shift+I on macOS
-    menu.setAccelerator(KeyStroke.getKeyStroke('I',
-        Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() |
-        ActionEvent.SHIFT_MASK));
-    menu.addActionListener(e -> openLibraryManager("", ""));
-    importMenu.add(menu);
-    importMenu.addSeparator();
-
     JMenuItem addLibraryMenuItem = new JMenuItem(tr("Add .ZIP Library..."));
     addLibraryMenuItem.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
@@ -1438,31 +1429,11 @@ public class Base {
     boardMenu.putClientProperty("removeOnWindowDeactivation", true);
     MenuScroller.setScrollerFor(boardMenu).setTopFixedCount(1);
 
-    boardMenu.add(new JMenuItem(new AbstractAction(tr("Boards Manager...")) {
-      public void actionPerformed(ActionEvent actionevent) {
-        String filterText = "";
-        String dropdownItem = "";
-        if (actionevent instanceof Event) {
-          Event e = ((Event) actionevent);
-          filterText = e.getPayload().get("filterText").toString();
-          dropdownItem = e.getPayload().get("dropdownItem").toString();
-        }
-        try {
-          openBoardsManager(filterText, dropdownItem);
-        } catch (Exception e) {
-          //TODO show error
-          e.printStackTrace();
-        }
-      }
-    }));
     boardsCustomMenus.add(boardMenu);
 
     // If there are no platforms installed we are done
     if (BaseNoGui.packages.size() == 0)
       return;
-
-    // Separate "Install boards..." command from installed boards
-    boardMenu.add(new JSeparator());
 
     // Generate custom menus for all platforms
     for (TargetPackage targetPackage : BaseNoGui.packages.values()) {
