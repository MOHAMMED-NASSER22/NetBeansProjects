
package Game2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 *
 * @author PC
 */
public class BTank extends Tanks{
    ImageView img;
    double w, h ;
    double degree=0;
    
    public BTank(double w, double h) throws FileNotFoundException {
        img = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Downloads\\BTank.png")));
        img.setFitHeight(h);
        img.setFitWidth(w);
        r = new Rectangle(w,h);
        r.setFill(Color.BLACK);
        getChildren().addAll(img,r);
       
        
    }
    
    public void m(){
             Move.getKeyFrames().add(new KeyFrame(Duration.millis(1000), 
                            new KeyValue(r.translateYProperty(), 100)));
             Move.getKeyFrames().add(new KeyFrame(Duration.millis(1000), 
                            new KeyValue(img.translateYProperty(), 100)));
           img.setRotate(0);
           img.setRotate(90);
           r.setRotate(0);
           r.setRotate(90);
           Move.play();
           Move.setOnFinished((event) -> {

           });
    
    }
   
}