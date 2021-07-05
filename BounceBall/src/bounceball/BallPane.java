/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceball;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


public class BallPane extends Pane {
   public final double r = 20;
   private double x = r , y = r ;
   private double dx = 1 ,dy=1;
   private Circle c = new Circle(x,y,r);
   private Timeline animation;
   
   public BallPane(){
      c.setFill(Color.GREEN);
      getChildren().add(c);
       animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
       animation.setCycleCount(Timeline.INDEFINITE);
       animation.play();
      
      
   }
    public void play(){
       animation.play();
    }
    public void pause(){
       animation.pause();
    }
     public void increaseSpeed(){
         animation.setRate(animation.getRate()+.1);
     }
     public void decreaseSpeed(){
         animation.setRate(animation.getRate() > 0 ? animation.getRate()-0.1 : 0);
     }
     
     protected void moveBall(){
         if(x<r||x>getWidth()-r-1)
             dx*=-1;
         if(y<r || y>getHeight()-r-1)
             dy*=-1;
         
         x+=dx;
         y+=dy;
         c.setCenterX(x);
         c.setCenterY(y);
     }
     
    
    
}
