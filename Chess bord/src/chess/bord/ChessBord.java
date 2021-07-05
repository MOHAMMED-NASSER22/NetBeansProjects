/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.bord;


import javafx.application.Application;
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
public class ChessBord extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
      
    
     
      Pane pane =new Pane();
     
    
      
      for(int i = 0; i <= 300; i+=100){
            for(int j = 0; j <= 300; j+=100){
               Rectangle r1=new Rectangle(i,j,50,50);
                r1.setFill(Color.LIGHTGRAY);
                  pane.getChildren().add(r1);
            }
        }
        
        for(int i = 0; i <= 800; i+=100){
            for(int j = 50; j <= 350; j+=100){
                Rectangle r2=new Rectangle(i,j,50,50);
                 r2.setFill(Color.BLACK);
                  pane.getChildren().add(r2);
               
            }
        }
      Scene scene=new Scene(pane,800,800);
      scene.setFill(Color.WHITESMOKE);
      primaryStage.setScene(scene);
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
