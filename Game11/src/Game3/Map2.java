package Game3;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author PC
 */
public class Map2 extends Map{
    
    int n;
    double width, height;

    public Map2() {
        width = 100;
        height = 200;
        shape = new Shape[9];
        for(int i = 0; i < 4; i++){
            shape[i] = new Rectangle(width, height);
            getChildren().add(shape[i]);
        }
        shape[0].setLayoutX(100);
        shape[0].setLayoutY(0);
        shape[1].setLayoutX(100);
        shape[1].setLayoutY(600 - height);
        shape[2].setLayoutX(1000 - width -100);
        shape[2].setLayoutY(0);
        shape[3].setLayoutX(1000 - width -100);
        shape[3].setLayoutY(600-height);
        shape[4] = new Polygon(450, 150,
                               550, 150,
                               550, 250,
                               650, 250,
                               650, 350,
                               550, 350,
                               550, 450,
                               450, 450,
                               450, 350,
                               350, 350,
                               350, 250,
                               450, 250
        );
               shape[5]= new Rectangle(-1,-1,1000,1);
               shape[6]= new Rectangle(-1,-1,1,600);
               shape[7]= new Rectangle(1000,0,1,600);
               shape[8]= new Rectangle(0,600,1000,1);
              for( int i =5 ; i < 9; i++){
            shape[i].setFill(Color.BLACK);
            getChildren().add(shape[i]);
                 }
        getChildren().add(shape[4]); 
    }
    
}
