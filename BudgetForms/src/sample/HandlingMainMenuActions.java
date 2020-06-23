package sample;

/*
    Decription: This class will handle any event handling
    // current giving function to menu buttons
 */


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HandlingMainMenuActions {

   MenuStripsMain menuStrip;


   public void openFile(Stage primaryStage) {
      FileChooser fileChooser = new FileChooser();
      File file = fileChooser.showOpenDialog(primaryStage);

      fileChooser.showOpenDialog(primaryStage);
      // Set extension filter
      FileChooser.ExtensionFilter extFilter =
              new FileChooser.ExtensionFilter("EXCEL (*.xlsx)", "*.xlsx");
      fileChooser.getExtensionFilters().add(extFilter);
   }

   public void isOpenFile(String fileName ){
      if(fileName == null){

      }
   }

}
