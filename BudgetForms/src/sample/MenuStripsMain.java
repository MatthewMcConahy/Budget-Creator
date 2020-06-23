package sample;

import javafx.scene.Parent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

// Menu Strips for the layout on top in the main Scene
// This class has no functionality only GUI information

public class MenuStripsMain{

    // Main menu bars on the top
    Menu aboutMenuMain = new Menu("About");
    Menu helpMenuMain = new Menu("Help");
    Menu fileMenuMain = new Menu("File");
    MenuBar mainMenuBar = new MenuBar();
    VBox mainVbox = new VBox(mainMenuBar);


    // Sub Menus File
    MenuItem saveMenuSub = new MenuItem("Save");
    MenuItem exitMenuSub = new MenuItem("Exit");
    MenuItem openMenuSub = new MenuItem("Open");
    MenuItem closeMenuSub = new MenuItem("Close");
    MenuItem newMenuSub = new MenuItem("New");


    // Drop down menu for the all items

    public Menu getAboutMenuMain() {
        return aboutMenuMain;
    }

    public void setAboutMenuMain(Menu aboutMenuMain) {
        this.aboutMenuMain = aboutMenuMain;
    }

    public Menu getHelpMenuMain() {
        return helpMenuMain;
    }

    public void setHelpMenuMain(Menu helpMenuMain) {
        this.helpMenuMain = helpMenuMain;
    }

    public Menu getFileMenuMain() {
        return fileMenuMain;
    }

    public void setFileMenuMain(Menu fileMenuMain) {
        this.fileMenuMain = fileMenuMain;
    }

    public MenuBar getMainMenuBar() {
        return mainMenuBar;
    }

    public void setMainMenuBar(MenuBar mainMenuBar) {
        this.mainMenuBar = mainMenuBar;
    }

    public VBox getMainVbox() {
        return mainVbox;
    }

    public void setMainVbox(VBox mainVbox) {
        this.mainVbox = mainVbox;
    }

    public MenuItem getSaveMenuSub() {
        return saveMenuSub;
    }

    public void setSaveMenuSub(MenuItem saveMenuSub) {
        this.saveMenuSub = saveMenuSub;
    }

    public MenuItem getExitMenuSub() {
        return exitMenuSub;
    }

    public void setExitMenuSub(MenuItem exitMenuSub) {
        this.exitMenuSub = exitMenuSub;
    }

    public MenuItem getOpenMenuSub() {
        return openMenuSub;
    }

    public void setOpenMenuSub(MenuItem openMenuSub) {
        this.openMenuSub = openMenuSub;
    }

    public MenuItem getCloseMenuSub() {
        return closeMenuSub;
    }

    public void setCloseMenuSub(MenuItem closeMenuSub) {
        this.closeMenuSub = closeMenuSub;
    }

    public MenuItem getNewMenuSub() {
        return newMenuSub;
    }

    public void setNewMenuSub(MenuItem newMenuSub) {
        this.newMenuSub = newMenuSub;
    }


}
