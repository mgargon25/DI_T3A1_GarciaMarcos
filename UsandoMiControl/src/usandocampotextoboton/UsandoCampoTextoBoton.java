/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandocampotextoboton;

import campotextoboton.CampoTextoBoton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class UsandoCampoTextoBoton extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        CampoTextoBoton campotextoboton = new CampoTextoBoton();
        
        StackPane root = new StackPane();
        root.getChildren().add(campotextoboton);
        
        Scene scene = new Scene(root, 300, 200);
        
        primaryStage.setTitle("Usando CampoTextoBoton");
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
