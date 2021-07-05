/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game3;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.*;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

  
public abstract class Tanks extends Pane {
    int degree=0;
    Rectangle r;
    Timeline move;
    Timeline heal;
    double x = 0, y = 0;
    ImageView img;
    double w , h ;
    Health health;
    public Tanks(Map m, double w, double h, Health health) {
        this.health = health;
        this.h = h;
        this.w = w;
        r = new Rectangle(w, h);
        r.setFill(Color.TRANSPARENT);
        move = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            // rotation handling
            if (y!=0) {
                if(y>0){
                    degree=90;
                    img.setRotate(0);
                    img.setRotate(90);
                    r.setRotate(0);
                    r.setRotate(90);
                } else {
                    degree=-90;
                    img.setRotate(0);
                    img.setRotate(-90);
                    r.setRotate(0);
                    r.setRotate(-90);
                }
                //movement
                r.setY(r.getY()+y);
                if (!isHit(m))
                    img.setY(r.getY());
                else
                    r.setY(r.getY() - y);
        
            } else if(x!=0) {
                if(x<0){
                    degree=180;
                    img.setRotate(0);
                    img.setRotate(180);
                    r.setRotate(0);
                    r.setRotate(180);
                } else {
                    degree=0;
                    img.setRotate(0);
                    r.setRotate(0);
                }
                r.setX(r.getX()+x);
                if(!isHit(m))
                    img.setX(r.getX());
                else
                    r.setX(r.getX()-x);
            }
        }));
        Timeline heal = new Timeline(new KeyFrame(Duration.seconds(3), e-> {
            health.blueHealth += 1;
            health.redHealth  += 1;
            health.lblB.setText("" + health.blueHealth);
            health.lblR.setText("" + health.redHealth);
           
        }));
        move.play();
        move.setOnFinished(e -> {move.play();});
        heal.play();
        heal.setOnFinished(e -> { heal.play(); });
    }
    
    public boolean isHit(Map m){
       for (Shape s : m.shape){
           Path p = (Path) Shape.intersect(s, r );
           if(!p.getElements().isEmpty())
               return true; 
       }
       return false;
    }
    public void setPos( double x, double y){
        r.setX(x);
        img.setX(x);
        r.setY(y);
        img.setY(y);
    }
    public abstract void hit();
}
