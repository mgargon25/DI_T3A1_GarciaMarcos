/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campotextonumerico;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class CampoTextoNumerico extends TextField{
    
    public CampoTextoNumerico(){
        super();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoNumerico.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);  
        
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
        @Override
        public void replaceText(int start, int end, String text) {
            if (text.matches("[0-9]")) {
                super.replaceText(start, end, text);   
            }
        }
        @Override
        public void replaceSelection(String text) {
            if (text.matches("[0-9]")) {
                super.replaceSelection(text);
            }
        }

        
}
