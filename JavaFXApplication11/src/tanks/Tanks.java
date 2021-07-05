
package tanks;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

/**
 *
 * @author MDV
 */
public class Tanks extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
      //setting shepe 1
        Polygon p1 = new Polygon(
               120, 100,
               120, 400,
               200, 400,
               200, 300,
               360, 300,
               360, 200,
               200, 200,
               200, 100
       );
        
        //setting shepe 2
       Polygon p2 = new Polygon(
               900, 200,
               820, 200,
               820, 300,
               660, 300,
               660, 400,
               820, 400,
               820, 500,
               900, 500
       ); 
       Rectangle r1 = new Rectangle(680,100,70,50);//setting shape 3
       Rectangle r2 = new Rectangle(360,500,70,50);//setting shape 4
       Rectangle t1 = new Rectangle(60,60,50,50);//setting tank 1
       Rectangle t2 = new Rectangle(940,540,50,50);//setting tank 1
       

      //shapes in a list 
      Shape [] shape = new Shape[4];
      shape[0] = p1;
      shape[1] = p2;
      shape[2] = r1;
      shape[3] = r2;
       
// setting fill
       p1.setFill(Color.SLATEBLUE);
       p2.setFill(Color.SLATEBLUE);
       r1.setFill(Color.SLATEBLUE);
       r2.setFill(Color.SLATEBLUE);
       t1.setFill(Color.RED);
       t2.setFill(Color.BLUE);
       
       
        Pane root = new Pane(p1,p2,r1,r2,t1,t2);
        Scene scene = new Scene(root, 1000, 600);
        scene.setFill(Color.DIMGREY);
        primaryStage.setTitle("tanks");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
