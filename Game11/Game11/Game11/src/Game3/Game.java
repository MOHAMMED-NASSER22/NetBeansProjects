package Game3;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application {
    Map m ;
    Pane root;

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        //
       ImageView background = new ImageView(new Image("/img/background.jpg"));
     
       ImageView map1 = new ImageView(new Image("/img/map1.png"));
       ImageView map2 = new ImageView(new Image("/img/map2.png"));
       ImageView map3 = new ImageView(new Image("/img/map3.png"));
       map1.setFitHeight(114);
       map1.setFitWidth(190);
      
       
       map2.setFitHeight(114);
       map2.setFitWidth(190);
      
       
       map3.setFitHeight(114);
       map3.setFitWidth(190);
      
      
        Button m1 = new Button();
        m1.setOnMouseClicked(e->{try {
            m = new Map1();
            initMap(primaryStage);
            } catch (FileNotFoundException ex) {}
        });
        Button m2 = new Button();
        m2.setOnMouseClicked(e->{ try {
            m = new Map2();
            initMap(primaryStage);
            } catch (FileNotFoundException ex) {}
        });
        Button m3 = new Button();
        m3.setOnMouseClicked(e->{try {
            m = new Map3();
            initMap(primaryStage);
            } catch (FileNotFoundException ex) {}
        });
        Pane startPane = new Pane(background,m1,m2,m3);
        m1.setGraphic(map1);
        m1.setLayoutX(281);
        m1.setLayoutY(468);
        
        m2.setGraphic(map2);
        m2.setLayoutX(530);
        m2.setLayoutY(468);
        
        m3.setGraphic(map3);
        m3.setLayoutX(781);
        m3.setLayoutY(468);
     
        Scene start = new Scene(startPane, 1250, 700);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Tanks War");
        primaryStage.setScene(start);
        primaryStage.show();
        
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public void initMap (Stage stage) throws FileNotFoundException{
        
        Health h = new Health(stage);
        BTank tankB = new BTank(50,50, m, h);
        RTank tankR = new RTank(50,50, m, h);
        tankR.setPos(950, 550);
        tankR.r.setRotate(180);
        tankR.img.setRotate(180);
        root = new Pane(m);
        m.getChildren().addAll(tankR.img,tankB.img, h);
        Scene scene = new Scene(root, 1250, 700);
        scene.setOnKeyPressed(e ->{
            switch(e.getCode()){
                case SPACE:
                    root.getChildren().add(new Bullet(tankB,m,tankR));
                    break;
                case F:
                    root.getChildren().add(new Bullet(tankR,m,tankB));
                    break;
                case DOWN :  
                    tankB.y = 5;
                    break;
                case UP   : 
                    tankB.y = -5;
                    break;
                case LEFT : 
                    tankB.x = -5;
                    break;
                case RIGHT : 
                    tankB.x = 5;
                    break;
                case S : 
                    tankR.y = 5;
                    break;
                case W :
                    tankR.y = -5;
                    break;
                case A :
                    tankR.x = -5;
                    break;
                case D :
                    tankR.x = 5;
                    break;
            }});
        scene.setOnKeyReleased(e ->{
            switch(e.getCode()){
                case DOWN :
                    tankB.y = 0;
                    break;
                case UP   :
                    tankB.y = 0;
                    break;
                case LEFT : 
                    tankB.x = 0;
                    break;
                case RIGHT : 
                    tankB.x = 0;
                    break;
                case S : 
                    tankR.y = 0;
                    break;
                case A : 
                    tankR.x = 0;
                    break;
                case W : 
                    tankR.y = 0;
                    break;
                case D : 
                    tankR.x = 0;
                    break;
            }});
        scene.setFill(Color.WHITESMOKE);
        stage.setScene(scene);
    }
}
