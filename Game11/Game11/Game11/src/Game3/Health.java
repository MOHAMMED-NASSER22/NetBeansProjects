/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game3;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class Health extends Pane{
    int blueHealth = 1000;
    int redHealth = 1000;
    Label lblB, lblR, winner;
    Stage stage;

    public Health(Stage s) {
        stage = s;
        setLayoutX(1010);
      
        lblB = new Label(""+blueHealth);
        lblR = new Label(""+redHealth);
        
        lblB.setLayoutX(85);
        lblB.setLayoutY(70);
        
        lblB.setFont(Font.font(30));
        lblR.setFont(Font.font(30));
        
        lblR.setTextFill(Color.RED);
        lblB.setTextFill(Color.BLUE);
        
        lblR.setLayoutX(85);
        lblR.setLayoutY(320);
        
        winner = new Label();
     
        getChildren().addAll(lblB, lblR);
    }
    public void winner(String s){
        switch (s) {
            case "blue":
                winner.setGraphic(new ImageView(new Image("/img/BLUE WIN.jpg")));
                break;
            case "red":
                winner.setGraphic(new ImageView(new Image("/img/RED WIN.png")));
                break;
        }
        Pane win = new Pane(winner);
        stage.setScene(new Scene(win, 1250, 700));
    }
}
