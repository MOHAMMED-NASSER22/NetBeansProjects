/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import java.util.Scanner;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
/**
 *
 * @author Mohamed Nasser
 */
public class Final extends Application{
    
    public void start (Stage stage){
        Pane pane = new Pane();
        Scene scene = new Scene(pane , 500 , 300);
       
        Scanner input = new Scanner (System.in);
        double [] polyganPoints = new double[8];
        double [] point = new double[2];
        
        for ( int i = 0 ; i < 8 ; i++){
            polyganPoints[i]= input.nextDouble();
        }
        point[0]=input.nextDouble();
        point[1]=input.nextDouble();
     
        Polygon p = new Polygon(polyganPoints);
        
        p.setFill(Color.TRANSPARENT);
        p.setStroke(Color.BLACK);
        
        Circle c = new Circle(point[0],point[1],10);
        
        Text t = new Text();
        t.setX(10);
        t.setY(10);
        
        if(p.contains(point[0],point[1]))
            t.setText("dsfsdf");
        else
            t.setText("dfsdf");
        
        
        
        
        pane.getChildren().addAll(p,c,t);
        
        stage.setTitle("hello");
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[]args){
    
         launch();
  
        
    }
    
    public static boolean contains (Rectangle r1 , Rectangle r2){
        
        if(r1.getWidth() < r2.getWidth() && r1.getHeight() < r2.getHeight())
            return false;
        
        if(     r2.getX()>r1.getX() && 
                r2.getX()<= r1.getX()+r1.getWidth()-r2.getWidth()&&
                r2.getY() > r1.getY()&&
                r2.getY() <= r1.getY()+r1.getHeight()-r2.getWidth()
                )
            return true;
        else
            return false;
    }
    
    public static boolean overLaps (Rectangle r1 , Rectangle r2){
        if(!contains(r1,r2) &&
                r2.getX() > r1.getX() && 
                r2.getX() < r1.getWidth() + r1.getX() &&
                r2.getY() > r1.getY() &&
                r2.getY() < r1.getHeight() + r1.getY()
                )
            return true ;
        else
            return false;
        
    }
   
}

