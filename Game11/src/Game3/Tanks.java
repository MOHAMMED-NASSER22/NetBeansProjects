/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game3;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Path;
import javafx.scene.shape.*;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

  
public class Tanks extends Pane {
    int degree=0;
    Rectangle r;
    Timeline move;
    double x = 0, y = 0;
    ImageView img;
    public Tanks(Map m) {
        move = new Timeline(new KeyFrame(Duration.millis(10), e -> {
            
            r.setY(r.getY()+y);
            
            if(!isHit(m,r))
                img.setY(r.getY());
            else
                r.setY(r.getY()-y);
            
            
            r.setX(r.getX()+x);
            
            if(!isHit(m,r))
                img.setX(r.getX());
            else
                r.setX(r.getX()-x);
            
        }));
        move.play();
        move.setOnFinished(e -> { move.play(); });
    }
    public boolean isHit(Map m, Rectangle r){
       for (Shape s : m.shape){
           Path p = (Path) Shape.intersect(s, r );
           if(!p.getElements().isEmpty())
               return true; 
       }
       return false;
   } 
    
     public void hit(){
        
     }
     
}
