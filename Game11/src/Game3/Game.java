/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game3;

import java.io.FileNotFoundException;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Mohamed Nasser
 */      
public class Game extends Application {
            Map m ; 
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        m=new Map1(); // change Maps , Map1,Map2,Map3 
        BTank tankB = new BTank(50,50, m);
        RTank tankR = new RTank(50,50, m);
      
            
      
            
        
        
      
       Pane root = new Pane(m);
       m.getChildren().addAll(tankR.img,tankB.img);
        Scene scene = new Scene(root, 1000, 600);
        
   
    scene.setOnKeyPressed(e ->{
     
    switch(e.getCode()){
        case SPACE:
             Bullet b = new Bullet(tankB.degree,tankB.img.getX()+25,tankB.img.getY(),m,tankR);
             root.getChildren().add(b);

            break;
              case F:
             Bullet r = new Bullet(tankR.degree,tankR.img.getX(),tankR.img.getY(),m,tankB);
             root.getChildren().add(r);
            
            break;
        case DOWN :  
                     tankB.degree=90;
                     tankB.img.setRotate(0);
                     tankB.img.setRotate(90);
                     tankB.r.setRotate(0);
                     tankB.r.setRotate(90);
                     tankB.y = 3;
                     break;
        case UP   : 
                     tankB.degree=-90;
                     tankB.img.setRotate(0);
                     tankB.img.setRotate(-90);
                     tankB.r.setRotate(0);
                     tankB.r.setRotate(-90);
                     tankB.y = -3;
                     break;
        case LEFT : 
                    tankB.degree=180;
                     tankB.img.setRotate(0);
                     tankB.img.setRotate(180);
                     tankB.r.setRotate(0);
                     tankB.r.setRotate(180);
                     tankB.x = -3;
                      
                     break;
        case RIGHT : 
                     tankB.degree=0;
                     tankB.img.setRotate(0);
                     tankB.r.setRotate(0);
                     tankB.x = 3;
                     break;
        case S : 
                tankR.degree=90;
                tankR.img.setRotate(0);
                tankR.img.setRotate(-90);
                tankR.r.setRotate(0);
                tankR.r.setRotate(-90);
                tankR.y = 3;
                break;
        case W : 
                 tankR.degree=-90;
                 tankR.img.setRotate(0);
                 tankR.img.setRotate(90);
                 tankR.r.setRotate(0);
                 tankR.r.setRotate(90);
                 tankR.y = -3;
                 break;
        case A : 
                 tankR.degree=180;
                 tankR.img.setRotate(0);
                 tankR.r.setRotate(0);
                 tankR.x = -3;
                 break;
        case D : 
                 tankR.degree=0;
                 tankR.img.setRotate(0);
                 tankR.img.setRotate(180);
                 tankR.r.setRotate(0);
                 tankR.r.setRotate(180);
                 tankR.x = 3;
                 break;
    }});
    scene.setOnKeyReleased(e ->{
     
    switch(e.getCode()){
        case DOWN :
            tankB.y = 0;
            break;
        case UP   :
            tankB.y = 0;
            break;
        case LEFT : 
            tankB.x = 0;
            break;
        case RIGHT : 
            tankB.x = 0;
            break;
        case S : 
            tankR.y = 0;
            break;
        case A : 
            tankR.x = 0;
            break;
        case W : 
            tankR.y = 0;
            break;

        case D : 
            tankR.x = 0;
            break;
    
    
    }});
    
    
    

    
       scene.setFill(Color.WHITESMOKE);
       
       
       // primaryStage.setResizable(false);
        primaryStage.setTitle("Tanks War");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
