/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanks;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
/**
 *
 * @author PC
 */
public class Control {
    VBox weapons = new VBox(15);
    Button bullet = new Button("Bullet");
    Button fire = new Button("FIRE");
    Slider power = new Slider(0, 10, 0);
    Slider angle = new Slider(0, 90, 0);
    Label lblPower = new Label("Power = 0");
    Label lblAngle = new Label("Angle = 0");
    int player = 1;

    public Control(Pane root, Tank t1, Tank t2, Pane pane){
        weapons.setLayoutY(100);
        weapons.setAlignment(Pos.CENTER);
        power.setLayoutX(100);
        power.setLayoutY(50);
        lblPower.setLayoutX(100);
        lblPower.setLayoutY(20);
        angle.setLayoutX(1000);
        angle.setLayoutY(50);
        lblAngle.setLayoutX(1000);
        lblAngle.setLayoutY(20);
        fire.setLayoutX(450);
        fire.setLayoutY(20);
        weapons.getChildren().add(bullet);
        root.getChildren().addAll(power, angle, fire, lblPower, lblAngle, weapons);
        power.setOnMouseDragged(e->{
        lblPower.setText("Power = "+power.getValue());
    });
        angle.setOnMouseDragged(e->{
        lblAngle.setText("Angle = "+angle.getValue());
    });
        power.setOnMousePressed(e->{
        lblPower.setText("Power = "+power.getValue());
    });
        angle.setOnMousePressed(e->{
        lblAngle.setText("Angle = "+angle.getValue());
    });
        fire.setOnMouseClicked(e->{
            double p, a;
            p = power.getValue();
            a = Math.toRadians(angle.getValue());
            Bullet b = new Bullet(pane,player == 1?t1:t2, player == 1?t2:t1);
            b.shoot(p*Math.abs(Math.cos(a)) * (player == 1? 1:-1), -p*Math.abs(Math.sin(a)));
            player = player == 1? 2:1;
        });
    }
    
}
