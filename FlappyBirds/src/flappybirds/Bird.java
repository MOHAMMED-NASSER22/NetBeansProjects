/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybirds;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author PC
 */
public class Bird {
    Circle b = new Circle(20);
    Timeline timeline;
    double dy = 0.1;
    double v = 0;
    boolean flap;
    
    Bird(Pane root){
        root.getChildren().add(b);
        timeline = new Timeline(new KeyFrame(Duration.millis(10), e->{
            if(flap){
                v -= 2;
                b.setLayoutY(b.getLayoutY() + v);
                flap = false;
            }else {
                v +=dy;
                b.setLayoutY(b.getLayoutY()+v);
            }
                
        }
        ));
        timeline.play();
        timeline.setOnFinished(e->{
        timeline.play();
        });
    }
    public void flap(){
        flap = true;
    }
}