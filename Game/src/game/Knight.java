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
public class Knight extends Piece {
    public Knight(double id, int posX, int posY) throws FileNotFoundException {
        super("Knight", id, posX, posY);

    }
    public void set(int x, int y){
        if(x <8 && y<8 && x>=0 && y>=0)
            if (Board.board[x][y] == 0)
                movement[x][y] = 1;
            else
                movement[x][y] = (int)Board.board[x][y] != (int)ID ? 2 : 0;
    }
    @Override
    public void fillMovement(){
        clrMovement();
        int x1 = posX+2;
        int x2 = posX-2;
        int y1 = posY+1;
        int y2 = posY-1;
        int x3 = posX+1;
        int x4 = posX-1;
        int y3 = posY+2;
        int y4 = posY-2;
        set(x1, y1);
        set(x1, y2);
        set(x2, y1);
        set(x2, y2);
        set(x3, y3);
        set(x3, y4);
        set(x4, y3);
        set(x4, y4);
    }

}