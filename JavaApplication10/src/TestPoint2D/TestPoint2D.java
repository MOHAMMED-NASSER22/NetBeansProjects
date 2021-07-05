/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPoint2D;

import java.util.Scanner;
import javafx.geometry.Point2D;
 
/* UML for Point2D in page 359 in referance 
.
same sequence
FIGURE 9.12 A Point2D object represents a point with x- and y-coordinates.
Constructs a Point2D object with the specified x- and y-coordinates.
Returns the distance between this point and the specified point (x, y).
Returns the distance between this point and the specified point p.
Returns the x-coordinate from this point.
Returns the y-coordinate from this point.
Returns a string representation for the point.
+Point2D(x: double, y: double)
+distance(x: double, y: double): double
+distance(p: Point2D): double
+getX(): double
+getY(): double
+toString(): Strin

*/
 public class TestPoint2D {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.print("Enter point1's x-, y-coordinates: ");
 double x1 = input.nextDouble();
 double y1 = input.nextDouble();
 System.out.print("Enter point2's x-, y-coordinates: ");
 double x2 = input.nextDouble();
 double y2 = input.nextDouble();

 Point2D p1 = new Point2D(x1, y1);
 Point2D p2 = new Point2D(x2, y2);
 System.out.println("p1 is " + p1.toString());
 System.out.println("p2 is " + p2.toString());
 System.out.println("The distance between p1 and p2 is " +
 p1.distance(p2));
 }
 }