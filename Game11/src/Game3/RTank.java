
package Game3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author PC
 */
public class RTank extends Tanks{
    double w, h ;
    public RTank(double w, double h, Map m) throws FileNotFoundException {
        super(m);
        img = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Downloads\\RTank.png")));
        img.setFitHeight(h);
        img.setFitWidth(w);
        r = new Rectangle(w, h);
        getChildren().add(img);
        
    }
}