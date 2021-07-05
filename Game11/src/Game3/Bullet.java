
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

/**
 *
 * @author MDV
 */
public class Bullet extends Pane {
    Rectangle c1;
    Timeline animate;
    

    public Bullet(int degree , double x , double y ,Map m,Tanks t){
        
       Glow glow = new Glow();
       glow.setLevel(1000);
       Lighting lighting = new Lighting(); 
       MotionBlur motionBlur = new MotionBlur();
       motionBlur.setRadius(4);
       motionBlur.setAngle(180);
       c1 = new Rectangle(x,y,5,5);
       
       c1.setArcWidth(15);
       c1.setArcHeight(25);
       c1.setFill(Color.TURQUOISE);
       c1.setEffect(glow);
       c1.setEffect(lighting);
       c1.setEffect(motionBlur);
       
       animate= new Timeline(new KeyFrame(Duration.millis(10),e->{
       switch(degree){
           case 0: c1.setLayoutX(c1.getLayoutX()+1); break;
           case 90 : c1.setLayoutY(c1.getLayoutY()+1); break;
           case 180 : c1.setLayoutX(c1.getLayoutX()-1); break;
           case -90 :  c1.setLayoutY(c1.getLayoutY()-1); break;
       }
       
       }));
       animate.play();
       animate.setOnFinished(e -> {
       animate.play();
       hitWall(m);
       hitTank(t);
       });
       getChildren().add(c1);
}
    

    public void removeBullet(){
    getChildren().remove(c1);
        }
    
     public  void hitWall(Map m){
            for (Shape s : m.shape){
           Path p = (Path) Shape.intersect(s, c1 );
           if(!p.getElements().isEmpty())
         removeBullet();
               
       }    
   
     } 
     public  void hitTank(Tanks t){
            
           Path p = (Path) Shape.intersect(t.r, c1 );
           if(!p.getElements().isEmpty()){
           removeBullet();
           t.hit();    
     
           }
     }      
    
        
 }
    
    
