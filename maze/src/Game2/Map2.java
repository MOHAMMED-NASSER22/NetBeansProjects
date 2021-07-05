package Game2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
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
        ImageView img;

    public Map2() throws FileNotFoundException {
      img = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\6.jpg")));
      img.setFitHeight(600);
      img.setFitWidth(1000);
      getChildren().add(img); 
        n = 5;
        width = 100;
        height = 200;
        shape = new Shape[n];
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
         shape[4].setFill(new ImagePattern(new Image((new FileInputStream("C:\\Users\\Mohamed Nasser\\Documents\\NetBeansProjects\\maze\\New folder\\7.jpg")))));
        getChildren().add(shape[4]); 
    }
    
}
