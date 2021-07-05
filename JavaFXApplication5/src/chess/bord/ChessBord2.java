/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.bord;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nasser
 */
public class ChessBord2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
      
    
     
      Pane pane =new Pane();
     
    
      
      for(int x = 0; x <= 350; x+=100){
            for(int y = 0; y <=350; y+=100){
               Rectangle r1=new Rectangle(x,y,50,50);
                r1.setFill(Color.LIGHTGRAY);
                  pane.getChildren().addAll(r1);
            }
        }
      
      for(int x = 50; x <= 350; x+=100){
            for(int y = 50; y <=350; y+=100){
               Rectangle r1=new Rectangle(x,y,50,50);
                r1.setFill(Color.LIGHTGRAY);
                  pane.getChildren().addAll(r1);
            }
        }
     
      
        

      Scene scene=new Scene(pane,388,388);
      scene.setFill(Color.BLACK);
      primaryStage.setScene(scene);
      primaryStage.setResizable(false);
      primaryStage.setTitle("CHESS");
      primaryStage.show();
      
      
      
      
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
                
}
