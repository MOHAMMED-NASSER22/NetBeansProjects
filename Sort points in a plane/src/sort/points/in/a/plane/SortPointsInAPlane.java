/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.points.in.a.plane;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author Mohamed Nasser
 */
public class SortPointsInAPlane {

    /**
     * @param args the command line arguments
     */
    
    // PROGRAMMING EXERCISES *20.4  page 815
    public static void main(String[] args) {
        
        Point[] points = new Point[100];
        for(int i= 0 ; i < points.length;i++){
            points[i]= new Point( (double)(Math.random() * 100),
                    (double)(Math.random() * 100));
        }
        
        Arrays.sort(points);
        System.out.println("Points increasing order of their x-coordinates:");
       for(int i= 0 ; i < points.length;i++){
            System.out.println(points[i]);
        }
       
      // System.out.println();
       Arrays.sort(points, new CompareY());
       System.out.println("Points in increasing order of their y-coordinates:");
       for(int i= 0 ; i < points.length;i++){
            System.out.println(points[i]);
        }
       
       // System.out.println();
       
    }
    
}
