/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Game1 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Image img = new Image(new FileInputStream(""));
        ImageView imageView = new ImageView(img);
      imageView.setX(50); 
      imageView.setY(25); 
      
      imageView.setFitHeight(85); 
      imageView.setFitWidth(85); 
        GridPane root = new GridPane();
        for(int i =0 ; i<8; i++)
            for(int j=0; j<8; j++){
                Rectangle rec = new Rectangle(85, 85);
                rec.setId(""+i+j);
                rec.setFill((i+j)%2 == 0? Color.LIGHTGREY:Color.GREY);
                root.add(rec, i, j);
            }
        root.add(imageView, 1, 1);
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
      Rectangle rec = new Rectangle(85, 85);
      rec.setFill(Color.GREEN);
      root.add(rec, 1, 2);
      Rectangle rec1 = new Rectangle(85, 85);
      rec1.setFill(Color.GREEN);
      root.add(rec1, 1, 3);
   } 
};   
        imageView.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        Scene scene = new Scene(root, 670, 670);
        
        primaryStage.setTitle("Game");
        primaryStage.setResizable(false);
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
