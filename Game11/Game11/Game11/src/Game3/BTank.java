
package Game3;

import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author PC
 */
public class BTank extends Tanks{
    

    public BTank(double w, double h, Map m, Health x) throws FileNotFoundException {
        super(m, w, h, x);
        img = new ImageView(new Image("/img/BTank.png"));
        img.setFitHeight(h);
        img.setFitWidth(w);
        getChildren().addAll(img,r);
    }
    @Override
    public void hit() {
        health.blueHealth -= 100;
        health.lblB.setText(""+health.blueHealth);
        if (health.blueHealth <= 0)
            health.winner("red");
    }
}