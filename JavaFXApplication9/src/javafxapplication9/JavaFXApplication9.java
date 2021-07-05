/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;

import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nasser
 */
public class JavaFXApplication9 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
   
    Pane pane = new Pane();
    Circle t = new Circle(100,100,50);
    pane.getChildren().add(t);
    t.setOnMousePressed(e->{t.requestFocus();});
    t.setOnKeyPressed(e ->{
        
    switch(e.getCode()){
        case DOWN : t.setCenterY(t.getCenterY()+10);break;
        case UP : t.setCenterY(t.getCenterY()-10);break;
        case LEFT : t.setCenterX(t.getCenterX()-10);break;
        case RIGHT : t.setCenterX(t.getCenterX()+10);break;
   
    }});
    
    
    
    
    
        Scene scene = new Scene(pane,300,200);
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
