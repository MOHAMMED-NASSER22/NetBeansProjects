
package Game3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author PC
 */
public class BTank extends Tanks{
    double w , h ;

    public BTank(double w, double h, Map m) throws FileNotFoundException {
        super(m);
        img = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Downloads\\BTank.png")));
        img.setFitHeight(h);
        img.setFitWidth(w);
        r = new Rectangle(w,h);
        r.setFill(Color.BLACK);
        getChildren().addAll(img,r);
        
    }
}