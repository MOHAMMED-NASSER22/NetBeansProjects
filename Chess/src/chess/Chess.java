/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Mohamed Nasser
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class Board{
    float[][] board = new float[8][8];
}
abstract class Piece{
    float id; //final
    private int posX;
    private int posY;
    //final shape ??
    private int[][] movement = new int[8][8];
    private boolean alive = true;
    
    public void setPos(int x,int y){
        this.posX = x;
        this.posY = y;
    }
    public int[] getPos(){
        int[] ret = new int[2];
        ret[0] = this.posX;
        ret[1] = this.posY;
        return ret;
    }
    public boolean getAlive(){
        return this.alive;
    }
    public void setAlive(boolean state){
        this.alive = state;
    }
    public abstract void goTo(int x, int y);
}
class Knight extends Piece{
        
}
