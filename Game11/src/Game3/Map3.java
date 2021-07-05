package Game3;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MDV
 */
public class Map3 extends Map {
        ImageView img;
    
    public Map3() throws FileNotFoundException {
//setting shepe 1

      img = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\8.jpg")));
      img.setFitHeight(600);
      img.setFitWidth(1000);
      getChildren().add(img); 
        Polygon p1 = new Polygon(
               120, 100,
               120, 400,
               200, 400,
               200, 300,
               360, 300,
               360, 200,
               200, 200,
               200, 100
       );
        
        //setting shepe 2
       Polygon p2 = new Polygon(
               900, 200,
               820, 200,
               820, 300,
               660, 300,
               660, 400,
               820, 400,
               820, 500,
               900, 500
       ); 
       Rectangle r1 = new Rectangle(680,100,70,50);//setting shape 3
       Rectangle r2 = new Rectangle(360,500,70,50);//setting shape 4
      
       

      //shapes in a list 
       shape = new Shape[4];
      shape[0] = p1;
      shape[1] = p2;
      shape[2] = r1;
      shape[3] = r2;
      
       
// setting fill
        p1.setFill(new ImagePattern(new Image((new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\7.jpg")))));
        p2.setFill(new ImagePattern(new Image((new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\7.jpg")))));
        r1.setFill(new ImagePattern(new Image((new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\7.jpg")))));
        r2.setFill(new ImagePattern(new Image((new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\7.jpg")))));
   
   
getChildren().addAll(p1,p2,r1,r2);

}
    
}
