/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplebounceball;



import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author Mohamed Nasser
 */
public class MultipleBallPane extends Pane{
private Timeline animation;

       
    public MultipleBallPane(){
      
        
        animation = new Timeline(
        new KeyFrame(Duration.millis(50), e->{moveBall();}));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
            
    }
    
    public void add(){
        Color color = new Color(Math.random(),Math.random(), Math.random(), 0.5);
        
        getChildren().add(new Ball(40,40,Math.random()*40,color));
    
    }
    
    public void subtract(){
        if(getChildren().size()>0){
            getChildren().remove(getChildren().size()-1);
        }
    }
    
    public void play(){
        animation.play();
    }
    
      public void pause(){
        animation.pause();
    }
      
      public void increaseSpeed(){
          animation.setRate(animation.getRate()+0.1);
      }
      
       public void decreaseSpeed(){
          animation.setRate(animation.getRate() > 0 ? animation.getRate()-0.1 :0);
      }
      public DoubleProperty rateProperty(){
          return animation.rateProperty();
      }
    
    protected void moveBall(){
        for(Node node : getChildren()){
            Ball ball = (Ball)node;
            if(ball.getCenterX() < ball.getRadius() || 
                    ball.getCenterX() > getWidth()-ball.getRadius()){
                ball.dx *=-1 ;
            }
            if(ball.getCenterY() < ball.getRadius()||
                    ball.getCenterY()>getHeight()-ball.getRadius()){
                ball.dy *=-1;
            }
            
            ball.setCenterX(ball.dx + ball.getCenterX());
            ball.setCenterY(ball.dy + ball.getCenterY());
        }
    }
    
    class Ball extends Circle{
        private double dx = 1 , dy =1;
        Ball(double x , double y , double raduis , Color color){
            super(x,y,raduis);
            setFill(color);
        }
    }
}
