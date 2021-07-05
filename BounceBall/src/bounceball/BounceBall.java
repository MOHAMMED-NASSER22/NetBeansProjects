/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceball;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nasser
 */
public class BounceBall extends Application {

    
  

    @Override
    public void start(Stage primaryStage) throws Exception {
       BallPane b = new BallPane();
       b.setOnMousePressed(e->{b.pause();});
       b.setOnMouseReleased(e->{b.play();});
       b.setOnKeyPressed(e->{
      if(e.getCode()==KeyCode.UP)
          b.increaseSpeed();
      else if(e.getCode()==KeyCode.DOWN)
          b.decreaseSpeed();
       });
       
       Scene scene = new Scene(b,250,150);
       primaryStage.setTitle("BounceBall For Taroka");
       primaryStage.setScene(scene);
       primaryStage.show();
       b.requestFocus();
       
        
    }
    
    
      public static void main(String[] args) {
      Application.launch(args);
      }
    
}
