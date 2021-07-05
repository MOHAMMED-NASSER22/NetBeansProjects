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
public class Rook extends Piece {
    public Rook(double id, int posX, int posY) throws FileNotFoundException {
        super("Rook", id, posX, posY);

    }
    
    @Override
    public void fillMovement(){
        clrMovement();
        boolean[] movable = new boolean [4]; // up down left right
        for(int i = 0; i<4; i++)
            movable[i] = true;
        
        for (int i = 1; posY-i >=0 && movable[0]; i++){
            if (Board.board[posX][posY-i] == 0)
                movement[posX][posY-i] = 1;
            else{
                movement[posX][posY-i] = (int)Board.board[posX][posY-i] != (int)ID ? 2 : 0;
                movable[0] = false;
            }
        }
            for (int i = 1; posY+i <8 && movable[1]; i++){
            if (Board.board[posX][posY+i] == 0)
                movement[posX][posY+i] = 1;
            else{
                movement[posX][posY+i] = (int)Board.board[posX][posY+i] != (int)ID ? 2 : 0;
                movable[1] = false;
            }
        }
        for (int i = 1; posX-i >=0 && movable[2]; i++){
            if (Board.board[posX-i][posY] == 0)
                movement[posX-i][posY] = 1;
            else{
                movement[posX-i][posY] = (int)Board.board[posX-i][posY] != (int)ID ? 2 : 0;
                movable[2] = false;
            }
        }
        for (int i = 1; posX+i <8 && movable[3]; i++){
            if (Board.board[posX+i][posY] == 0)
                movement[posX+i][posY] = 1;
            else{
                movement[posX+i][posY] = (int)Board.board[posX+i][posY] != (int)ID ? 2 : 0;
                movable[3] = false;
            }
        }
    }
}
