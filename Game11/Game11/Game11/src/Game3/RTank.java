
package Game3;

import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author PC
 */
public class RTank extends Tanks{
    
    
    public RTank(double w, double h, Map m, Health x) throws FileNotFoundException {
        super(m, w, h, x);
        img = new ImageView(new Image("/img/RTank.png"));
        img.setFitHeight(h);
        img.setFitWidth(w);
        getChildren().addAll(img,r);   
    }
    @Override
    public void hit() {
        health.redHealth -= 100;
        health.lblR.setText(""+health.redHealth);
        if (health.redHealth <= 0)
            health.winner("blue");
    }
    
}