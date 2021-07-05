/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game3;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 *
 * @author Mohamed Nasser
 */
public class Map1 extends Map {
    
   public Map1() throws FileNotFoundException{
      shape = new Rectangle[9]; // blocks
     
            //Frame
               shape[5]= new Rectangle(-1,-1,1000,1);
               shape[6]= new Rectangle(-1,-1,1,600);
               shape[7]= new Rectangle(1000,0,1,600);
               shape[8]= new Rectangle(0,600,1000,1);
              for( int i =5 ; i < 9; i++){
            shape[i].setFill(Color.BLACK);
            getChildren().add(shape[i]);
                 }
              
              
         
           
            
            
          //Blocks
     
        shape [0] = new Rectangle(400,0,200,200);
        shape[1] = new Rectangle(400,400,200,200);
        shape [2] = new Rectangle(0,200,200,200);
        shape [3] = new Rectangle(800,200,200,200);
        shape[4]= new Rectangle(475,275,50,50);
        for( int i =0 ; i < 5; i++){
            shape[i].setFill(Color.GRAY);
        }
        
        for( int i = 0 ; i < 5; i++){
            getChildren().addAll(shape[i]);
            
        }    
   }

   
    
    

     

}
