/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybirds;

import java.util.ArrayList;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author PC
 */
public class Tube {
    double height1, height2;
    double width = 50;
    TranslateTransition move1 = new TranslateTransition();
    TranslateTransition move2 = new TranslateTransition();
    Rectangle t1;
    Rectangle t2;
    Tube(Pane root){
        height1 = Math.rint(Math.random()*200 + 100);
        height2 = 600-height1-120;
        t1 = new Rectangle(width, height1);
        t2 = new Rectangle(width, height2);
        root.getChildren().addAll(t1, t2);
        t1.setLayoutX(600);
        t1.setLayoutY(0);
        t2.setLayoutX(600);
        t2.setLayoutY(600-height2+20);
        move1.setDuration(Duration.seconds(5));
        move1.setInterpolator(Interpolator.LINEAR);
        move2.setInterpolator(Interpolator.LINEAR);
        move1.setNode(t1);
        move2.setNode(t2);
        move1.setByX(-750);
        move2.setDuration(Duration.seconds(5));
        move2.setByX(-750);      
    }
    

    
}
