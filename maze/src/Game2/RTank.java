
package Game2;
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
    ImageView img;
    double w, h ;
    double degree=0;
    public RTank(double w, double h) throws FileNotFoundException {
        img = new ImageView(new Image(new FileInputStream("C:\\Users\\Mohamed Nasser\\Downloads\\RTank.png")));
        img.setFitHeight(h);
        img.setFitWidth(w);
        r = new Rectangle(w, h);
        getChildren().add(img);
        
    }
}