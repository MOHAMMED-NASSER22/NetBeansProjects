/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game2;


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
    ImageView img;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    
   public Map1() throws FileNotFoundException{
      img = new ImageView(new Image(new FileInputStream("file:./../Game11/New folder/1.jpg")));
      img.setFitHeight(600);
      img.setFitWidth(1000);
      getChildren().add(img); 
      img1 = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\2.jpg")));
      img2 = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\2.jpg")));
      img3 = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\2.jpg")));
      img4 = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\2.jpg")));
      img5 = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\2.jpg")));

      
      img1.setX(400);
      img1.setY(0);
      img1.setFitWidth(200);
      img1.setFitHeight(200);
      img1.setRotate(-90);

      img2.setX(400);
      img2.setY(400);
      img2.setFitWidth(200);
      img2.setFitHeight(200);
      img2.setRotate(90);

      img3.setX(800);
      img3.setY(200);
      img3.setFitWidth(200);
      img3.setFitHeight(200);
      

      img4.setX(475);
      img4.setY(275);
      img4.setFitWidth(50);
      img4.setFitHeight(50);
      img4.setRotate(-90);      
      
      img5.setX(0);
      img5.setY(200);
      img5.setFitWidth(200);
      img5.setFitHeight(200);
      img5.setRotate(-180);
      

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
        getChildren().addAll(img1,img2,img3,img4,img5);
    
   }

   
    
    

     

}
