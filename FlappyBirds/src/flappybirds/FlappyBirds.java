/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybirds;

import java.awt.Font;
import java.util.ArrayList;
import javafx.animation.KeyFrame;
import javafx.animation.ParallelTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import static javafx.util.Duration.seconds;

/**
 *
 * @author PC
 */
public class FlappyBirds extends Application {
    Bird b;
    Tube t[] = new Tube[3];
    Tube tempT[] = new Tube[3];
    int score = 0;
    int c = 0;
    int time = 0;
    boolean gameOver = false;
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        b = new Bird(root);
        Label lbl, lblScore;
        lblScore = new Label("Your Score is "+score);
        lbl = new Label("You Lost");
        lbl.setAlignment(Pos.CENTER);
        lbl.setMinSize(600, 150);
        lblScore.setAlignment(Pos.CENTER);
        lblScore.setMinSize(600, 150);
        Scene lost = new Scene(new VBox(lbl, lblScore), 600, 600);
        root.setOnMouseClicked(e -> {
        if(!gameOver){
            b.flap();
        }
        });
        b.b.setLayoutX(100);
        //b.b.setLayoutY(100);
        Scene scene = new Scene(root, 600, 600);
        ParallelTransition move = new ParallelTransition();
        Timeline timeline = new Timeline(
        new KeyFrame(Duration.millis(50), e -> {
            if (time % 25 == 0){
                move.stop();
                Tube temp = new Tube(root);
                if(c<3){
                    t[c] = temp;
                    c++;
                    move.getChildren().addAll(temp.move1, temp.move2);
                }
                else{
                    tempT = t;
                    System.arraycopy(tempT, 1, t, 0, 2);
                    t[2] = temp;
                    move.getChildren().addAll(temp.move1, temp.move2);
            }                
            }
        move.play();
        Shape.intersect(b.b, t[0].t1).setFill(Color.RED);
        Shape.intersect(b.b, t[0].t2).setFill(Color.RED);
        Path p1 = (Path) Shape.intersect(b.b, t[0].t1);
        Path p2 = (Path) Shape.intersect(b.b, t[0].t2);
        if(!p1.getElements().isEmpty() || !p2.getElements().isEmpty()) gameOver = true;
        time++;
        }), new KeyFrame(Duration.millis(10), e -> {
            if(t[0] != null && t[0].t1.getTranslateX()< -550){
                t[0] = t[1];
                score += 100;
            }
            //Comment this (if) to stop the advanced AI
            //if (t[0] != null && b.b.getCenterY()+b.b.getLayoutY()>t[0].height1+ 50 && b.v > 0)
                b.flap();
            }
            )
        );
        timeline.play();
        timeline.setOnFinished(e -> {
            if(!gameOver){
                timeline.play();}
            else{
                lblScore.setText("Your Score is "+ score);
                primaryStage.setScene(lost);
            }});
        primaryStage.setTitle("Flappy Bird");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
            