import javafx.scene.CustomNode;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.geometry.*;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.scene.paint.*;
import javafx.application.Frame;
import javafx.application.Stage;
import javafx.scene.effect.*; 
// Java Legacy
import java.lang.Math;
import java.util.Random;
import java.lang.System;
var balls:GravityBall[];
var gravity:Number= 0.1;
var width:Number = 1200;
var height:Number= 500;
var dampFactor: Number = 0.9;
var timeline = Timeline {
    repeatCount: Timeline.INDEFINITE
    keyFrames : [
        KeyFrame {
            time : 16ms
            action: function():Void {
                for(ball in balls) {
                    ball.motion();
                }
            }
        }
    ]
}
var rnd : Random = new Random();
for( i in [1..5] ) {
    insert GravityBall {
        x : rnd.nextInt( 100 ), y :  rnd.nextInt( 300 ), radius : rnd.nextInt( 10 ) + 20
        color : Color.rgb(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255))
        , opacity : 0.9
    } into balls;
}    
var rect = Rectangle {
    x: 0, y: 500
    width: 1200, height: 10
    fill: LinearGradient {
        startX: 0.0
        startY: 0.0
        endX: 1.0
        endY: 0.0
        proportional: true
        stops: [
            Stop { offset: 0.0 color: Color.TRANSPARENT },
            Stop { offset: 1.0 color: Color.WHITESMOKE }
        ]
    }
}
Frame
{
    title: "MyApplication"
    width: 1200
    height: 732
    closeAction: function() { java.lang.System.exit( 0 ); 
    }
    visible: true
    stage: Stage {
        fill : Color.BLACK
        content: [
            balls,
            rect
        ]
    }
}
timeline.start();
public class GravityBall extends CustomNode {
    public attribute x : Number;
    public attribute y : Number;
    public attribute radius : Number;
    public attribute color : Color;
    public attribute velocity : Number;
    public function motion(): Void {
        velocity += gravity;
        x += 1;
        y += velocity;
        if(x + radius > width ) {
            x = width - radius; //for ending at the boundary
        }
        if( y + radius > height ) {
            y = height - radius;
            velocity \*= -dampFactor;
        }
    }
    public function create(): Node {
        return Circle {
            centerX : bind x, centerY : bind y, radius : bind radius
            fill: bind color
        };
    }
} 