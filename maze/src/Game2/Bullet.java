/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game2;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.MotionBlur;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author MDV
 */
public class Bullet  {
    Rectangle c1;
    Timeline animate;

    public Bullet(){
        
    Glow glow = new Glow();
       glow.setLevel(1000);
       Lighting lighting = new Lighting(); 
       MotionBlur motionBlur = new MotionBlur();
       motionBlur.setRadius(4);
       motionBlur.setAngle(180);
       c1 = new Rectangle(500,300,10,5);
       c1.setArcWidth(15);
       c1.setArcHeight(25);
       c1.setFill(Color.TURQUOISE);
       c1.setEffect(glow);
       c1.setEffect(lighting);
       c1.setEffect(motionBlur);

       
 
}
    
    
    
}