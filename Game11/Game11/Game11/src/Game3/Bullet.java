
package Game3;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.MotionBlur;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class Bullet extends Pane {
    Rectangle c1;
    Timeline animate;
    int p = 2;
    

    public Bullet(Tanks t1,Map m, Tanks t2){
        Glow glow = new Glow();
        glow.setLevel(1000);
        Lighting lighting = new Lighting(); 
        MotionBlur motionBlur = new MotionBlur();
        motionBlur.setRadius(4);
        motionBlur.setAngle(180);
        int degree = t1.degree;
        double x = 0, y = 0;
        switch(degree){
            case 0:
                x = t1.img.getX()+t1.w;
                y = t1.img.getY()+t1.h/2;
                break;
            case 90 :
                x = t1.img.getX()+t1.w/2;
                y = t1.img.getY()+t1.h;
                break;
            case 180 :
                x = t1.img.getX();
                y = t1.img.getY()+t1.h/2;
                break;
            case -90 :
                x = t1.img.getX()+t1.w/2;
                y = t1.img.getY();
                break;
        }
        c1 = new Rectangle(x, y, 5, 5);
        c1.setArcWidth(15);
        c1.setArcHeight(25);
        c1.setFill(Color.TURQUOISE);
        c1.setEffect(glow);
        c1.setEffect(lighting);
        c1.setEffect(motionBlur);
        animate= new Timeline(new KeyFrame(Duration.millis(10),e->{
        switch(degree){
            case 0   : c1.setLayoutX(c1.getLayoutX()+p);  break;
            case 90  : c1.setLayoutY(c1.getLayoutY()+p);  break;
            case 180 : c1.setLayoutX(c1.getLayoutX()-p);  break;
            case -90 : c1.setLayoutY(c1.getLayoutY()-p);  break;
        }
        p+=2;
        
        }));
        animate.play();
        animate.setOnFinished(e -> {
            if(!hitWall(m) && !hitTank(t2))
                animate.play();
        
        });
        getChildren().add(c1);
} 
    

    public void removeBullet(){
        getChildren().remove(c1);
    }
    
    public boolean hitWall(Map m){
        for (Shape s : m.shape){
          Path p = (Path) Shape.intersect(s, c1 );
          if(!p.getElements().isEmpty()){
              removeBullet();
              return true;
          }
        }
          return false;
   
    }
    public boolean hitTank(Tanks t){
        Path p = (Path) Shape.intersect(t.r, c1 );
        if(!p.getElements().isEmpty()){
            removeBullet();
            t.hit();
            return true;
        }
        return false;
    }
}
    
    
