/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanks;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;

/**
 *
 * @author PC
 */
public class Ground {
    Polyline shape = new Polyline(0, 500, 1500, 500);

    public Ground(Pane root) {
        root.getChildren().add(shape);
    }
    
}
