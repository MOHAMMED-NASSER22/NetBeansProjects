/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuck.u.tarek;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Mohamed Nasser
 */
public class FuckUTarek extends Application {
      Circle c = new Circle(300,20,20);
    TranslateTransition t1 = new TranslateTransition(Duration.seconds(1),c);
     TranslateTransition t2 = new TranslateTransition(Duration.seconds(1),c);
     TranslateTransition t3 = new TranslateTransition(Duration.seconds(1),c);
              SequentialTransition s= new SequentialTransition(c, t2,t3);
    
   
    
    public void start(Stage primaryStage) {
        Pane root = new Pane();
          c.setFill(Color.GREEN);
       root.getChildren().add(c);
       c.setOnMouseDragged((e) -> {
           c.setCenterX(e.getX());
           c.setCenterY(e.getY());
       });
         
     PathTransition	p = new PathTransition();
     p.setNode(c);
     
           
     

        
        
         Scene scene = new Scene(root, 640, 640);
        
        
        
        moveBall();
      
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
  
    
    public static void main(String[] args) {
        launch(args);
    }

    private void moveBall() {
         System.out.println(c.getCenterY());
        t1.setFromY(c.getCenterY());
        t1.setToY(500);
        t1.play();
       t1.setOnFinished((event) -> {
           c.getCenterY();
       });System.out.println(c.getCenterY());
        System.out.println(c.getCenterY());
    }
    
}
