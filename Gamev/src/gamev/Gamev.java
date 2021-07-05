/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamev;


import java.io.FileNotFoundException;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nasser
 */
public class Gamev extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        GridPane root = new GridPane();
        fillBoard(root);
        Scene scene = new Scene(root,680,680);
        primaryStage.setTitle("chess");
        primaryStage.setAlwaysOnTop(true);
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
    
    public void fillBoard (GridPane root) throws FileNotFoundException{
       fillSquares(root);
       fillWhite(root);
       fillBlack(root);
    }
    public void fillWhite(GridPane root) throws FileNotFoundException{
        fillBishop(root,2);
    }
    public void fillBlack(GridPane root) throws FileNotFoundException{
        fillBishop(root,1);
    }
    
    public void fillSquares(GridPane root){
        for (int i =0 ; i < 8 ; i++)
            for (int j = 0 ; j < 8 ; j++){
                Rectangle rec = new Rectangle(85,85);
                rec.setFill( (i+j)%2 == 0 ? Color.LIGHTGRAY : Color.GRAY );
                rec.setStroke(Color.BLACK);
                rec.setOnMouseClicked(e ->{
                if(rec.getFill() == Color.GREEN){
                    Board.move(root, e);
                }
                else if(rec.getFill()==Color.RED){
                        Board.attack(root, e);
                }
                Board.clr();
                });
                Board.squares[j][i]=rec;
                root.add(rec, i, j);
                        }
                
    }
    
    
    public void fillBishop(GridPane root , int x ) throws FileNotFoundException{
        Bishop b1 = new Bishop( x+0.03 , (x-1)*7 , 2);
        Bishop b2 = new Bishop(x+0.04 , (x-1)*7 , 5);
        Board.setPiece(root, b1);
        Board.setPiece(root, b2);
        root.add(b1.shape, 2 ,  (x-1)*7 );
        root.add(b2.shape, 5 ,  (x-1)*7 );
        
    }
}
