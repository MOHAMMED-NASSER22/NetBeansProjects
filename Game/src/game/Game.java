/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Game extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        GridPane root = new GridPane();
        fillBoard(root);//fills the board with ALL the objects
        Scene scene = new Scene(root, 680, 680);
        primaryStage.setTitle("Chess");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    //

    public void fillBoard(GridPane root) throws FileNotFoundException{
        fillSquares(root); //fills the square of the board
        fillWhite(root);  //fills the white pieces
        fillBlack(root); //fills the black pieces
    }
    public void fillWhite(GridPane root) throws FileNotFoundException{
        fillKing(root, 2);
        fillPawn(root, 2);
        fillRook(root, 2);
        fillBishop(root, 2);
        fillKnight(root, 2);
        fillQueen(root, 2);
    }
    public void fillBlack(GridPane root) throws FileNotFoundException{
        fillKing(root, 1);
        fillPawn(root, 1);
        fillRook(root, 1);
        fillBishop(root, 1);
        fillKnight(root, 1);
        fillQueen(root, 1);
    }
    public void fillSquares(GridPane root){
        for(int i =0 ; i<8; i++)
            for(int j=0; j<8; j++){
                Rectangle rec = new Rectangle(85,85);
                //rec.heightProperty().bind(root.heightProperty().divide(8));
                //rec.widthProperty().bind(root.widthProperty().divide(8));
                rec.setFill((i+j)%2 == 0? Color.LIGHTGREY:Color.GREY);
                rec.setStroke(Color.BLACK);
                rec.setOnMouseClicked(new EventHandler<MouseEvent>(){
                    @Override
                    public void handle(MouseEvent event) {
                        if (rec.getFill() == Color.GREEN){
                            Board.move(root, event);
                        }
                        else if (rec.getFill() == Color.RED){
                            Board.attack(root, event);
                        }
                        Board.clr();
                    }
                });
                Board.squares[j][i] = rec;
                root.add(rec, i, j);
            }
    }
    
    public void fillKing(GridPane root, int x) throws FileNotFoundException{
                King k = new King(x+0.08, (x-1)*7, 3);
                Board.setPiece(root, k);
                root.add(k.shape, 3, (x-1)*7);
    }
    
    public void fillQueen(GridPane root, int x) throws FileNotFoundException{
                Queen q = new Queen(x+0.07, (x-1)*7, 4);
                Board.setPiece(root, q);
                root.add(q.shape, 4, (x-1)*7);
    }
    
    public void fillKnight(GridPane root, int x) throws FileNotFoundException{
        Knight k1 = new Knight(x+0.05, (x-1)*7, 1);
        Knight k2 = new Knight(x+0.06, (x-1)*7, 6);
        Board.setPiece(root, k1);
        Board.setPiece(root, k2);
        root.add(k1.shape, 1, (x-1)*7);
        root.add(k2.shape, 6, (x-1)*7);
    }
    
    public void fillPawn(GridPane root, int x) throws FileNotFoundException{
        for(int i = 0; i<8; i++){
            double id = x+(i/10.00);
            int posX = ((int)(x-1)*5)+1;
            int posY = i;
            Pawn p = new Pawn(id, posX, i);
            Board.setPiece(root, p);
            root.add(p.shape, i, posX);
        }
    }
    public void fillRook(GridPane root, int x) throws FileNotFoundException{
        Rook r1 = new Rook(x+0.01, (x-1)*7, 0);
        Rook r2 = new Rook(x+0.02, (x-1)*7, 7);
        Board.setPiece(root, r1);
        Board.setPiece(root, r2);
        root.add(r1.shape, 0, (x-1)*7);
        root.add(r2.shape, 7, (x-1)*7);
    }
    public void fillBishop(GridPane root, int x) throws FileNotFoundException{
        Bishop b1 = new Bishop(x+0.03 , (x-1)*7 , 2);
        Bishop b2 = new Bishop(x+0.04 , (x-1)*7 , 5);
        Board.setPiece(root, b1);
        Board.setPiece(root, b2);
        root.add(b1.shape, 2, (x-1)*7);
        root.add(b2.shape, 5, (x-1)*7);
    }
}
