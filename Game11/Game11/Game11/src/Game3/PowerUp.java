/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game3;

import javafx.animation.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author PC
 */
public class PowerUp extends Pane{
    double x, y;
    ImageView image;
    Circle timer;
    FillTransition animateTimer;
    
    public PowerUp(double x, double y) {
        image = new ImageView(new Image("/img/heart.png"));
        image.setFitHeight(50);
        image.setFitWidth(50);
        setLayoutX(x);
        setLayoutY(y);
        timer = new Circle(5);
        timer.relocate(18, -7);
        animateTimer = new FillTransition();
        animateTimer.setShape(timer);
        animateTimer.setDuration(Duration.seconds(5));
        animateTimer.setFromValue(Color.BLUE);
        animateTimer.setToValue(Color.RED);
        getChildren().addAll(image, timer);
        animateTimer.play();
        animateTimer.setOnFinished(e->{getChildren().clear();});
    }
}
