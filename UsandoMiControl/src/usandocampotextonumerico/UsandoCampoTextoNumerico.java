/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandocampotextonumerico;

import campotextonumerico.CampoTextoNumerico;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class UsandoCampoTextoNumerico extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      
        HBox hbox = new HBox();
        
        Scene scene = new Scene(hbox, 300, 250);
        
        CampoTextoNumerico campotextonumerico = new CampoTextoNumerico();
        hbox.getChildren().add(campotextonumerico);
        
        primaryStage.setTitle("Usando CampoTextoNumerico");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
