/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game2;

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
public class Maze extends Application {
    
    Rectangle [] t = new Rectangle[2]; //Taks
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
            BTank tankB = new BTank(50,50);
            RTank tankR = new RTank(50,50);
//            md1  md1 = new md1();
//            md2 md2 = new md2();    

            
      Map m = new Map1(); // change Maps , Map1,Maps2,Maps3 
            
        
        
      
//       Bullet b = new Bullet();
       Pane r = new Pane(m/*,b.c1*/);
       m.getChildren().addAll(tankR.img,tankB.img);
        Scene scene = new Scene(r, 1000, 600);
        
        
   
    scene.setOnKeyPressed(e ->{
     
    switch(e.getCode()){
        case SPACE:
            Bullet bb = new Bullet();
            bb.c1.setLayoutX(tankB.getLayoutX());
            bb.c1.setLayoutY(tankB.getLayoutY());
            
      bb.animate = new Timeline(new KeyFrame(Duration.millis(100),ev->{
       bb.c1.setLayoutX(bb.c1.getLayoutX()+1);
       bb.c1.setLayoutY(bb.c1.getLayoutY()+1);
       }));
       
       bb.animate.play();
            
            break;
        case DOWN :  
                     
                     tankB.img.setRotate(0);
                     tankB.img.setRotate(90);
                     tankB.r.setRotate(0);
                     tankB.r.setRotate(90);
                     tankB.r.setY(tankB.img.getY()+3);
                     if(!isHit(m,tankB)){
                     tankB.img.setY(tankB.img.getY()+3);
                     
                                    }
                     else{
                      tankB.r.setY(tankB.img.getY()-3);
                     }

       
                     break;
        case UP   : 
                    
                     tankB.img.setRotate(0);
                     tankB.img.setRotate(-90);
                     tankB.r.setY(tankB.img.getY()-3);
                     tankB.r.setRotate(0);
                     tankB.r.setRotate(-90);
                      if(!isHit(m,tankB)){
                          tankB.img.setY(tankB.img.getY()-3);
                                              }
                      else{
                          tankB.r.setY(tankB.img.getY()+3);
                      }
           
                     break;
        case LEFT : 
                   
                     tankB.img.setRotate(0);
                     tankB.img.setRotate(180);
                     tankB.r.setX(tankB.img.getX()-3);
                     tankB.r.setRotate(0);
                     tankB.r.setRotate(180);
                      if(!isHit(m,tankB)){
                           tankB.img.setX(tankB.img.getX()-3);
                  }
                      else
                      {
                          tankB.r.setX(tankB.img.getX()+3);
                      }
                     break;
        case RIGHT : 
                  
                     tankB.img.setRotate(0);
                     tankB.r.setX(tankB.img.getX()+3);
                     tankB.r.setRotate(0);
                     if(!isHit(m,tankB)){ 
                         tankB.img.setX(tankB.img.getX()+3);
                    }
                     else
                     {
                       tankB.r.setX(tankB.img.getX()-3);
                     }
                     break;
        case S : 
                 tankR.img.setRotate(0);
                 tankR.img.setRotate(-90);
                 tankR.r.setY(tankR.img.getY()+3);
                 tankR.r.setRotate(0);
                 tankR.r.setRotate(-90);
                 if(!isHit(m,tankR)){
                     tankR.img.setY(tankR.img.getY()+3);
                 }
                 else
                 {
                 tankR.r.setY(tankR.img.getY()-3);
                 }

            
                 break;
        case W : 
                 tankR.img.setRotate(0);
                 tankR.img.setRotate(90);
                 tankR.r.setY(tankR.img.getY()-3);
                 tankR.r.setRotate(0);
                 tankR.r.setRotate(90);
                 if(!isHit(m,tankR)){
                     tankR.img.setY(tankR.img.getY()-3);
                 }
                 else
                    tankR.r.setY(tankR.img.getY()+3); 
                 break;
        case A : 
                 tankR.img.setRotate(0);
                 tankR.r.setX(tankR.img.getX()-3);
                 tankR.r.setRotate(0);
                 if(!isHit(m,tankR)){
                    tankR.img.setX(tankR.img.getX()-3); 
                 }
                 else
                   tankR.r.setX(tankR.img.getX()+3);  
                 break;
        case D : 
                 tankR.img.setRotate(0);
                 tankR.img.setRotate(180);
                 tankR.r.setX(tankR.img.getX()+3);
                 tankR.r.setRotate(0);
                 tankR.r.setRotate(180);
                 if(!isHit(m,tankR)){
                     tankR.img.setX(tankR.img.getX()+3);
                 }
                 else
                    tankR.r.setX(tankR.img.getX()-3); 
                 break;
   
    }});
    
    
    
    

    
       scene.setFill(Color.WHITESMOKE);
       
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
   public boolean isHit(Map m, Tanks t){
       
       for (Shape s : m.shape){
    
    
    Path p = (Path) Shape.intersect(s, t.r );
    
    
    if(!p.getElements().isEmpty())
        return true; 
        
}
return false;

     
      
 } 
   
//   class md1 extends Thread{
//       public void Run() throws FileNotFoundException{
//                       BTank tankB = new BTank(50,50);
//                        Map1 m = new Map1();
//           
//                                tankB.img.setRotate(0);
//                     tankB.img.setRotate(90);
//                     tankB.r.setRotate(0);
//                     tankB.r.setRotate(90);
//                     tankB.r.setY(tankB.img.getY()+3);
//                     if(!isHit(m,tankB)){
//                     tankB.img.setY(tankB.img.getY()+3);
//                     
//                                    }
//                     else{
//                      tankB.r.setY(tankB.img.getY()-3);
//                     }
//       }
//   }
//          class md2 extends Thread{
//       public void Run() throws FileNotFoundException{
//                       RTank tankR = new RTank(50,50);
//                        Map1 m = new Map1();
//                        
//                           tankR.img.setRotate(0);
//                 tankR.img.setRotate(-90);
//                 tankR.r.setY(tankR.img.getY()+3);
//                 tankR.r.setRotate(0);
//                 tankR.r.setRotate(-90);
//                 if(!isHit(m,tankR)){
//                     tankR.img.setY(tankR.img.getY()+3);
//                 }
//                 else
//                 {
//                 tankR.r.setY(tankR.img.getY()-3);
//                 }
//           
//       }
//       
//    
//
//}
//   private EventHandler<KeyEvent> keyReleased = new EventHandler<KeyEvent>() {
//
//        @Override
//        public void handle(KeyEvent event) {
//            // set movement to 0, if the released key was responsible for the paddle
//            switch (event.getCode()) {
//                case W:
//                case S:
//                    leftPaddleDY = 0;
//                    break;
//                case UP:
//                case DOWN:
//                    rightPaddleDY = 0;
//                    break;
//            }
//        }
//
//    };
//
//    private EventHandler<KeyEvent> keyPressed = new EventHandler<KeyEvent>() {
//
//        @Override
//        public void handle(KeyEvent event) {
//            // start movement according to key pressed
//            switch (event.getCode()) {
//                case W:
//                    leftPaddleDY = -6;
//                    break;
//                case S:
//                    leftPaddleDY = 6;
//                    break;
//                case UP:
//                    rightPaddleDY = -6;
//                    break;
//                case DOWN:
//                    rightPaddleDY = 6;
//                    break;
//            }
//
//        }
//    };
}
