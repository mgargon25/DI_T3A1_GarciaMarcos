/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandotemporizador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class UsandoTemporizador extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("UsandoTemporizadorView.fxml"));
        
        Scene scene = new Scene(root, 600, 400);
        
        primaryStage.setTitle("Temporizador");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
     public static void main(String[] args) {
        launch(args);
    }
    
}
