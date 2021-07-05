

import java.util.Scanner;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;
public class TestQuestion2019Fx extends Application {

public void start(Stage primaryStage) {

// process 1 : create rectangles and a label

Scanner in = new Scanner(System.in);

Pane root = new Pane();

Rectangle r1 = new Rectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());

r1.setFill(Color.WHITE);

r1.setStroke(Color.BLACK);

Rectangle r2 = new Rectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());

r2.setFill(Color.WHITE);

r2.setStroke(Color.BLACK);

Label t = new Label();

    root.getChildren().addAll(r1, r2, t);

// end of process 1

// process 2 : check

if(overlaps(r1, r2)){

if(contains(r1, r2) || contains(r2, r1)){

t.setText("contain");
}
else

t.setText("overlap");
}
else

t.setText("not overlap");

// end of process 2

//process 3 : javafx bluh bluh bluh

Scene scene = new Scene(root, 300, 250);

primaryStage.setScene(scene);

primaryStage.show();

}

// returns true if they touch each other

public boolean overlaps(Rectangle r1, Rectangle r2){

Path p = (Path)Shape.intersect(r1, r2);

return !p.getElements().isEmpty();

}

//returns true if one contains another

public boolean contains(Rectangle r1, Rectangle r2){

boolean containsFirstCorner = r1.contains(r2.getX(), r2.getY());

boolean containsOppositeCorner = r1.contains(r2.getX()+r2.getWidth(), r2.getY()+r2.getHeight());

return containsFirstCorner && containsOppositeCorner;

}

public static void main (String[]arg){
    launch();
}
}