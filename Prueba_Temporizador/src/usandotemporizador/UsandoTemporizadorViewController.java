/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandotemporizador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import temporizador.Temporizador;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class UsandoTemporizadorViewController implements Initializable {

    @FXML
    private Temporizador temporizador;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        temporizador.setTime(30);
        temporizador.iniciarContador();
    }    

    @FXML
    private void onFinished(ActionEvent event) {
        System.out.println("Ha finalizado el contador");
    }
    
}
