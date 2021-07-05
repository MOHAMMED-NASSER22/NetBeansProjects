/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication14;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Mohamed Nasser
 */
public class JavaFXApplication14 extends Application {
    Timeline t = new Timeline();
    Timeline t1 = new Timeline();
    Timeline t2 = new Timeline();
    Timeline t3 = new Timeline();
    Timeline t4 = new Timeline();
    Timeline t5 = new Timeline();
    Timeline t6 = new Timeline();
    Timeline t7 = new Timeline();
    @Override
    public void start(Stage primaryStage) {
        Line l = new Line(0,340,300,340);
       
        Circle c = new Circle(150,20,20);
        c.setOnMouseEntered((ef) -> {
            t.stop();
             c.setOnMouseDragged((e) -> {
            c.setCenterX(e.getX());
            c.setCenterY(e.getY());
            
        });
             c.setOnMouseExited((de) -> {
                 
                 t.play();
             });
        });
       
  
    t.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
                         new KeyValue(c.translateYProperty(), 300)));
    t.setRate(2);
        
      t.setOnFinished((event) -> {
       
        t1.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
                                            new KeyValue(c.translateYProperty(), 150)));
        
          t1.play();
          t1.setOnFinished((edvent) -> {
                t2.getKeyFrames().add(new KeyFrame(Duration.millis(800),
                                            new KeyValue(c.translateYProperty(), 300)));
                
          t2.play();
             t2.setOnFinished((edvenvt) -> {
                t3.getKeyFrames().add(new KeyFrame(Duration.millis(800),
                                            new KeyValue(c.translateYProperty(), 225)));
                
          t3.play();
             t3.setOnFinished((edvenft) -> {
                t4.getKeyFrames().add(new KeyFrame(Duration.millis(600),
                                            new KeyValue(c.translateYProperty(), 300)));
          t4.play();
             t4.setOnFinished((edvdent) -> {
                t5.getKeyFrames().add(new KeyFrame(Duration.millis(650),
                                            new KeyValue(c.translateYProperty(), 270)));
          t5.play();
          t5.setOnFinished((edfvdent) -> {
                t6.getKeyFrames().add(new KeyFrame(Duration.millis(500),
                                            new KeyValue(c.translateYProperty(), 300)));
          t6.play();
          
          
          });
          
          });
          });
          });
          });
        
      });
         Pane root = new Pane(c,l);
        Scene scene = new Scene(root, 300, 360);
        
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
    
}
