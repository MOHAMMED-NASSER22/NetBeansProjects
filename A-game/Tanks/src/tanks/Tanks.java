/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanks;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Tanks extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Pane cPane = new Pane();
        Tank t1 = new Tank(pane, 100, 500, 1);
        Tank t2 = new Tank(pane, 1000, 500, 2);
        Control c = new Control(cPane, t1, t2, pane);
        cPane.setLayoutX(0);
        cPane.setLayoutY(500);
        Ground g = new Ground(pane);
        Scene scene = new Scene(new Pane(pane, cPane), 1250, 700);
        
        primaryStage.setTitle("Space tanks");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
