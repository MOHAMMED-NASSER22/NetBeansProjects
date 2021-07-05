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
      shape = new Shape[8];
      shape[0] = p1;
      shape[1] = p2;
      shape[2] = r1;
      shape[3] = r2;
      shape[4]= new Rectangle(-1,-1,1000,1);
      shape[5]= new Rectangle(-1,-1,1,600);
      shape[6]= new Rectangle(1000,0,1,600);
      shape[7]= new Rectangle(0,600,1000,1);
      for(int i = 4; i<8; i++){
          shape[i].setFill(Color.BLACK);
          getChildren().add(shape[i]);
      }
       
// setting fill
        p1.setFill(new ImagePattern(new Image("/img/1.jpg")));
        p2.setFill(new ImagePattern(new Image("/img/1.jpg")));
        r1.setFill(new ImagePattern(new Image("/img/1.jpg")));
        r2.setFill(new ImagePattern(new Image("/img/1.jpg")));
   
   
getChildren().addAll(p1,p2,r1,r2);

}
    
}
