/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplebounceball;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;





    public class MultipleBounceBall extends Application{
        public static void main(String[] args) {
        // page 779
     launch(args);
    
    }
        
        public void start (Stage p){
//           ImageView ground = new ImageView(new Image("/img/ok.jpg"));
//         ground.setFitHeight(600);
//         ground.setFitWidth(1250);
         
        MultipleBallPane ballPane = new MultipleBallPane();
        ballPane.setStyle("-fx-border-color:yellow");
        
        Button btAdd = new Button("+");
        Button btSubtract = new Button("-");
        HBox hBox = new HBox(10);
        
        hBox.getChildren().addAll(btAdd,btSubtract);
        hBox.setAlignment(Pos.CENTER);
        
        btAdd.setOnAction(e->{ballPane.add();});
        btSubtract.setOnAction(e->{ballPane.subtract();});
        
        ballPane.setOnMousePressed(e -> {ballPane.pause();});
        ballPane.setOnMouseReleased(e -> {ballPane.play();});
        
        ScrollBar sbSpeed = new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());
        
        BorderPane pane = new BorderPane();
        
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);
        
        
        Scene scene = new Scene(pane ,1250,650);
        p.setTitle("MultipleBounceBall");
        p.setScene(scene);
        p.setResizable(false);
        p.show();
    }

   
  
    }
    

