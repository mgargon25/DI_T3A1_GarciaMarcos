
package appusoselector;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;


public class APPUsoSelectorController implements Initializable{
    
    @FXML
    private SelectorDeslizamiento deslizamientosup;
    @FXML
    private SelectorDeslizamiento deslizamientoinf;
    @FXML
    private Label labelIndicacion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<String> lista =  new ArrayList<String>();
    
    lista.add("Uno");
    lista.add("Dos");
    lista.add("Tres");
    lista.add("Cuatro");
    lista.add("Cinco");
    lista.add("Seis");
    lista.add("Siete");
    lista.add("Ocho");
    lista.add("Nueve");
    lista.add("Diez");
    lista.add("Once");
    lista.add("Doce");
    lista.add("Trece");
    lista.add("Catorce");
    lista.add("Quince");
    lista.add("Dieciseis");
    lista.add("Diecisiete");
    lista.add("Dieciocho");
    lista.add("Diecinueve");
    lista.add("Veinte");
    
    
    deslizamientosup.setItems(lista);
    deslizamientoinf.setItems(lista);
        
    }

    @FXML
    private void onActionSelector1(ActionEvent event) {
        labelIndicacion.setText("Pulsado el selector de arriba");
    }

    @FXML
    private void onActionSelector2(ActionEvent event) {
        labelIndicacion.setText("Pulsado el selector de abajo");
    }
    
}
