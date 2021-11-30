/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import campotextoboton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class APPUsoTextoBotonViewController implements Initializable {

    @FXML
    private Label labelTexto;
    @FXML
    private CampoTextoBoton campoSup;
    @FXML
    private CampoTextoBoton campoInf;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        campoSup.setTextoBoton("Grabar");
        campoInf.setTextoBoton("Grabar");
    }    

    @FXML
    private void onActionSup(ActionEvent event) {
        labelTexto.setText("Texto del campo superior: " + campoSup.getText());
    }

    @FXML
    private void onActionInf(ActionEvent event) {
        labelTexto.setText("Texto del campo inferior: " + campoInf.getText());
    }
}
