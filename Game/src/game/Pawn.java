/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.FileNotFoundException;
/**
 *
 * @author PC
 */
public class Pawn extends Piece {
    int initX, initY;    
    public Pawn(double id, int posX, int posY) throws FileNotFoundException {
        super("Pawn", id, posX, posY);
        initX = posX;
        initY = posY;
    }
    
    @Override
    public void fillMovement(){
        clrMovement();
        int x = (int)ID == 1 ? posX+1:posX-1;
        int x2 = (int)ID == 1 ? x+1:x-1;
        int a1 = posY+1;
        int a2 = posY-1;
        if (a1<8 && (int)Board.board[x][a1] != (int)ID )
            movement[x][a1] = (int)Board.board[x][a1] != 0 ? 2:0;
        if (a2>=0 && (int)Board.board[x][a2] != (int)ID)
            movement[x][a2] = Board.board[x][a2] != 0 ? 2:0;
        if (Board.board[x][posY] == 0){
            if (posX == initX && posY == initY && Board.board[x2][posY] == 0){
                movement[x][posY] = 1 ;
                movement[x2][posY] = 1;
            }else{
                movement[x][posY] = 1;
            }
        }
    }
}
