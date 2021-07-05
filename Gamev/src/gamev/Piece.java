/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamev;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Mohamed Nasser
 */
public abstract class Piece extends Board {
    final double ID; 
    public ImageView shape;
    protected int posX;
    protected int posY;
    protected int [][] movement = new int[8][8];
     String SRC = "file:./../pieces/";
     String name;
      String W;
      String B;
     FileInputStream src;
     GridPane root = new GridPane();
     Scene scene = new Scene(root,680,680);
     
     public Piece(String name , double ID , int posX , int posY) throws FileNotFoundException{
         this.ID=ID;
         this.posX=posX;
         this.posY=posY;
         this.name=name;
         W=SRC +"White"+name+".png";
         B=SRC +"Black"+name+".png";
         src = new FileInputStream((int) ID == 1 ? B:W);
         this.shape = new ImageView(new Image(src));
         double h = root.getHeight()/8;
         double w = root.getWidth()/8;
         shape.setFitHeight(h);
        shape.setFitWidth(w);
         Board.set(posX, posY, ID, this);
         
         
     }
    public void setPos(int x , int y){
        this.posX=x;
        this.posY=y;
    }
    public int[] getPos(int x ,int y){
      int []ret = new int[2];
      ret[0]=this.posX;
      ret[1]=this.posY;
      return ret;
    }
    public boolean canGoTo(int x , int y){
        return movement[x][y]==1;
    }
    public boolean canAttack(int x , int y){
        return movement[x][y]==2;
    }
    
    public void clrMovement(){
        for(int i = 0 ; i<8 ;i++)
            for(int j=0;j<8;j++)
                movement[i][j]=0;
    }
    
    public void goTo(int x ,int y){
        if(canGoTo(x,y)||canAttack(x,y)){
            posX=x;
            posY=y;
        }
    }
    
    public boolean isAttacked(){
        if(Board.checkAttacked(posX, posY, ID))
            return true;
        return false;
    }
    
    public abstract void fillMovement();
}
