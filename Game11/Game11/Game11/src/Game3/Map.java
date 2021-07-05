package Game3;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;


/**
 *
 * @author PC
 */
public class Map extends Pane{
 
Shape [] shape ;
  ImageView SCOR = new ImageView(new Image("/img/SCOR.jpg"));
  
    public Map(){
         SCOR.setFitWidth(1250);
      SCOR.setFitHeight(700);
      getChildren().add(SCOR);
    }
}