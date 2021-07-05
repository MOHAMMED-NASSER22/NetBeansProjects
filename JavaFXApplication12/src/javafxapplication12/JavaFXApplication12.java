/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication12;


import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Mohamed Nasser
 */
public class JavaFXApplication12 extends Application {
          double r = 20;
     double x = r ,y=r;
     Circle c = new Circle(x,y,r);
    
           double A=y;
       double  B=600;
          double  C=300;
TranslateTransition t1 = new TranslateTransition(Duration.seconds(1),c);
     TranslateTransition t2 = new TranslateTransition(Duration.seconds(1),c);
     TranslateTransition t3 = new TranslateTransition(Duration.seconds(1),c);
              SequentialTransition s= new SequentialTransition(c, t2,t3);



    @Override
    public void start(Stage primaryStage) {
  
    Pane pane = new Pane();
        c.setFill(Color.GREEN);
       pane.getChildren().add(c);
       

     
  moveBall();
        
        Scene scene = new Scene(pane, 600, 640);
        
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
      public  void moveBall(){
          c.setOnMouseDragged((event) -> {
              c.setCenterX(event.getSceneX());
              c.setCenterY(event.getSceneY());
               s.play();
          });
         ///first 
       t1.setFromY(c.getCenterX());
       t1.setToY(B);
       t1.play();
       t1.setOnFinished((event) -> {
          
       });
      ////
      
       t2.setFromY(B);
       t2.setToY(C);
       
       t3.setFromY(C);
       t3.setToY(B);
      
       s.play();
   
     c.setCenterX(t3.getToX());
       
       s.setOnFinished((event) -> {
   int i=1;
      double D =((B-C)/2);
        D=(C+D)/i;
      i++;
      t2.setFromY(B);
       t2.setToY(D);
       
       t3.setFromY(D);
       t3.setToY(B);
       
       s.play();
       if(D>600)
           s.stop();
     
       });
          
        
    }
    
}
