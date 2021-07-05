package tanks;


import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Tank {
    double width = 60;
    double height = 20;
    ProgressBar life = new ProgressBar(1);
    Rectangle body = new Rectangle(width, height);
    Tank(Pane root, double posX, double posY, int player){
        body.setLayoutX(posX);
        life.setLayoutX(posX);
        body.setLayoutY(posY-height);
        life.setLayoutY(posY-height-30);
        root.getChildren().addAll(body, life);
    }
    public void hit(double dmg){
        life.setProgress(life.getProgress()-(dmg/100));
        if(life.getProgress()<=0)
            System.out.println("GAMEOVER");
    }
}
