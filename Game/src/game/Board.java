/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author PC
 */
public class Board {
    static double[][] board = new double[8][8];// holds pices id
    static int wAttack[][] = new int[8][8];
    static int bAttack[][] = new int[8][8];
    static Rectangle[][] squares = new Rectangle[8][8]; // boards squares
    static Piece[][] pieces = new Piece[8][8];//refernces for pieces
    final static int P1 = 1, P2 = 2; //Palyers >> 2 white, 1 black
    static int Player = 2;
    static int[] cell = {0,0};
    static Piece selectPiece;
    static double selectId ;  
    
    public static void set(int posX, int posY, double id, Piece p){
            board[posX][posY] = id;
            pieces[posX][posY] = p;
    }
    public static void changePlayer(){
        Player = Player == 1? 2:1;
    }

            
    public static void printB(){
        for(double[] i : board){
            for(double j : i)
                System.out.printf("%1.2f ", (float)j);
                System.out.println();
        }
         System.out.println();
    }
    public static void printWA(){
        for(int[] i : wAttack){
            for(int j : i)
                System.out.print(j+ " ");
          System.out.println();}
         System.out.println();
    }
    public static void printBA(){
        for(int[] i : bAttack){
            for(int j : i)
                System.out.print(j+ " ");
          System.out.println();}
         System.out.println();
    }
    public static void printP(){
        for(Piece[] i : pieces){
            for(Piece j : i)
                if(j == null)
                    System.out.printf("0.00 ");
                else
                    System.out.printf("%1.2f ", (float)j.ID);
          System.out.println();}
         System.out.println();
    }
      
    public static void select(){
        selectPiece = pieces[cell[1]][cell[0]];
        selectId = board[cell[1]][cell[0]];
    }
    public static void moveSelect(GridPane root){
        board[cell[1]][cell[0]] = selectId;
        root.getChildren().remove(selectPiece.shape);
        selectPiece.goTo(cell[1], cell[0]);
        root.add(selectPiece.shape, cell[0], cell[1]);
        pieces[cell[1]][cell[0]] = selectPiece;
        System.out.print(selectPiece.isAttacked());
        /*printB();
        printP();
        if((int)selectId == 1)
            printBA();
        else
            printWA();*/
        changePlayer();
    }
    
    public static void attackSelect(GridPane root){
        board[cell[1]][cell[0]] = selectId;
        root.getChildren().remove(selectPiece.shape);
        root.getChildren().remove(pieces[cell[1]][cell[0]].shape);
        selectPiece.goTo(cell[1], cell[0]);
        root.add(selectPiece.shape, cell[0], cell[1]);
        pieces[cell[1]][cell[0]] = selectPiece;
        //printB();
        //printP();
        changePlayer();
    }
    public static void setEvent(MouseEvent event ,Piece p){
        if((int)p.ID == Board.Player){
            fillWhiteAttack();
            fillBlackAttack();
            p.fillMovement();
            light(p);
            getCell(event);
            select();
            if((int)selectId == 1)
                fillBlackAttack();
            else
                 fillWhiteAttack(); 
        }
    }
    public static void getCell(MouseEvent e){ // Gets x, y of the cell
        cell[0] = (int)e.getSceneX()/85;
        cell[1] = (int)e.getSceneY()/85;
    }
    public static void light(Piece p){
        for(int i = 0; i<8; i++)
            for (int j = 0; j<8; j++){
                Board.squares[i][j].setFill((i+j)%2 == 0? Color.LIGHTGREY:Color.GREY);
                if(p.canGoTo(i, j))
                    Board.squares[i][j].setFill(Color.GREEN);
                else if(p.canAttack(i, j))
                    Board.squares[i][j].setFill(Color.RED);
            }
    }
    public static void setPiece(GridPane root, Piece p){
        p.shape.setOnMouseClicked(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    Board.setEvent(event, p);
                }
                });
    }
    public static void clr(){ // clears the color of squares
         for(int i = 0; i<8; i++)
             for (int j = 0; j<8; j++)
                 squares[i][j].setFill((i+j)%2 == 0? Color.LIGHTGREY:Color.GREY);
     }
    public static void move(GridPane root, MouseEvent event){
        board[Board.cell[1]][Board.cell[0]] = 0.0;
        pieces[Board.cell[1]][Board.cell[0]] = null;
        getCell(event);
        moveSelect(root);
    }
    public static void attack(GridPane root, MouseEvent event){
        board[Board.cell[1]][Board.cell[0]] = 0.0;
        pieces[Board.cell[1]][Board.cell[0]] = null;
        getCell(event);
        attackSelect(root);
    }
    public static void fillWhiteAttack(){
        wAttack = new int[8][8];
        for(Piece[] i : pieces){
            for(Piece j : i)
                if(j != null && (int)j.ID == 2){  
                    j.fillMovement();
                    for(int x = 0; x<8; x++)
                        for(int y=0; y<8; y++)
                            if (j.movement[x][y] == 1)
                                wAttack[x][y] = 1;
                }
        }
    }
    
    public static void fillBlackAttack(){
        bAttack = new int[8][8];
        for(Piece[] i : pieces){
            for(Piece j : i)
                if(j != null && (int)j.ID == 1){  
                    j.fillMovement();
                    for(int x = 0; x<8; x++)
                        for(int y=0; y<8; y++)
                            if (j.movement[x][y] == 1)
                                bAttack[x][y] = 1;
                }
        }
    }
    
    public static boolean checkAttacked(int x, int y, double id){
        int[][] attacked = (int)id == 2 ? bAttack:wAttack;
        return attacked[x][y] == 1;
    }
}
