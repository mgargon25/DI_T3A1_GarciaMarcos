/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;

import java.io.IOException;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ObjectPropertyBase;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 *
 * @author usuario
 */
public class Temporizador extends AnchorPane{
    
    @FXML
    private Label labelTiempo;
    private IntegerProperty iProperty;
    
    public Temporizador(){
        iProperty = new SimpleIntegerProperty(0);
    FXMLLoader fxmlLoader = new FXMLLoader(
            getClass().getResource("TemporizadorView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    public void setTime(Integer numero){
        labelTiempo.setText(numero.toString());
        iProperty.set(numero);
    }
    
    public Integer getTime(){
        return iProperty.get();
    }
    
    public void iniciarContador(){
        Timeline timeline;
        
        AnimationTimer timer;
        
        timeline = new Timeline();
        timeline.setCycleCount(1);
        timeline.setAutoReverse(false);
        
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                labelTiempo.textProperty().bind(iProperty.asString());
            }
        };
        
        //create a keyValue with factory: scaling the circle 2times
        KeyValue keyValueX = new KeyValue(iProperty, 0);
 
        //create a keyFrame, the keyValue is reached at time 2s
        Duration duration = Duration.seconds(iProperty.get());
        //one can add a specific action when the keyframe is reached
        EventHandler onFinished = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                 //reset counter
                 fireEvent(t);
            }
        };
        
        KeyFrame keyFrame = new KeyFrame(duration, onFinished, keyValueX);
 
        //add the keyframe to the timeline
        timeline.getKeyFrames().add(keyFrame);
 
        timeline.play();
        timer.start();
        
    }
    
    public final ObjectProperty<EventHandler<ActionEvent>> onActionProperty() {
        return onAction;
    }
    
    public final void setOnAction(EventHandler<ActionEvent> value) {
        onActionProperty().set(value);
    }
    
    public final EventHandler<ActionEvent> getOnAction() {
        return onActionProperty().get();
    }
    
     private ObjectProperty<EventHandler<ActionEvent>> onAction = new
        ObjectPropertyBase<EventHandler<ActionEvent>>() {
            @Override
            protected void invalidated() {
                setEventHandler(ActionEvent.ACTION, get());
            }
            
            @Override
            public Object getBean() {
            return Temporizador.this;
            }
            
            @Override
            public String getName() {
            return "onAction";
            }
        };
    
}
