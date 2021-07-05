/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game2;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

  
public class Tanks extends Pane {
    Rectangle r;
    Timeline Move = new Timeline (); 
        double x = 0, y = 0;
        ImageView img;
    public Tanks(){
        
        
    }
    
}
