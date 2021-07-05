/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanks;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

/**
 *
 * @author PC
 */
public class Bullet {
    Circle shape = new Circle(5);
    double vy, vx;
    Timeline tr;
    Tank attacker, enemy;
    double dmg = 10;
    Bullet(Pane root, Tank t1, Tank t2){
        attacker = t1;
        enemy = t2;
        shape.setFill(Color.BLUE);
        shape.setLayoutX(attacker.body.getLayoutX());
        shape.setLayoutY(attacker.body.getLayoutY());
        root.getChildren().add(shape);
        tr = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            shape.setLayoutX(shape.getLayoutX() + vx);
            shape.setLayoutY(shape.getLayoutY() + vy);
            vy += 0.1;
            if(hit()){
                root.getChildren().remove(shape);
                enemy.hit(dmg);
                tr.stop();
            }
        }));
    }
    public void shoot(double x, double y){
        vx = x;
        vy = y;
        tr.play();
        tr.setOnFinished(e->{
            tr.play();
        });
        tr.play();
        tr.setOnFinished(e->{
            tr.play();
        });
    }
    public boolean hit(){
        Path p = (Path) Shape.intersect(shape, enemy.body);
        return !p.getElements().isEmpty();
    }
}
