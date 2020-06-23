package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import java.io.File;
import java.util.Stack;

/*\
 Description: Main Window with all the labels, buttons this class will be designed for holding the layout of the program
 functionality will be kept elsewhere to be determined
 Programmer: Matthew McConahy


 Date: 6/4/2020
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Budget Creator");

        // THIS CODE IS TEMPORARY FOR TESTING PURPS
        // Will need to find a way to combine the table view and the menuStrips as well
        TableView tableView = new TableView();

        TableColumn<String, BeginningForms> dateColumn = new TableColumn<>("Date");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));


        TableColumn<String, BeginningForms> typeColumn = new TableColumn<>("Type");
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<String, BeginningForms> amountColumn = new TableColumn<>("Amount");
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));

        tableView.getColumns().addAll(dateColumn,typeColumn,amountColumn);

        /*
         This will be used for reading information from CSV file
         Code will be defined else where for reading in CSV file, but will need that format
         Date will be set in MM/DD/YYYY
         Type will be defined in set Strings
         Amount will be defined in double with 2 Decimal Places
         */
        tableView.getItems().add(new BeginningForms("05/12/98", "Car","100"));
        tableView.getItems().add(new BeginningForms("05/12/1998", "House Payment","234"));

        VBox vboxSecond = new VBox(tableView);


        // Init classes for methods
        MenuStripsMain menuStrip = new MenuStripsMain();
        HandlingMainMenuActions handleActions = new HandlingMainMenuActions();

        // Main Menu Strip
        menuStrip.mainMenuBar.getMenus().addAll(menuStrip.fileMenuMain, menuStrip.aboutMenuMain, menuStrip.helpMenuMain);

        // Sub Menu Strip
        menuStrip.fileMenuMain.getItems().addAll(menuStrip.newMenuSub, menuStrip.openMenuSub, menuStrip.closeMenuSub, menuStrip.exitMenuSub);

        // event handling for opening files

        menuStrip.openMenuSub.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        // will open file
                        handleActions.openFile(primaryStage);

                    }
                }
        );

        // Event Handling Killing the program
        menuStrip.exitMenuSub.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        System.exit(1);
                    }
                }
        );

        menuStrip.newMenuSub.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        menuStrip.helpMenuMain.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                    }
                });


        // This is for the menu
        //Scene scene = new Scene(menuStrip.mainVbox, 960, 600);

        // This is for table view
         Scene scene = new Scene(vboxSecond, 960, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
