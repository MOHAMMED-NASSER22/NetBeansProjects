/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.points.in.a.plane;

import java.util.Comparator;

/**
 *
 * @author Mohamed Nasser
 */
public class CompareY implements Comparator<Point> {
    
    public int compare(Point p1 , Point p2){
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        
        if( y1 == y2 ){
            
            if(x1 > x2)
                return 1 ;
            else if ( x1 < x2)
                return -1 ;
            else
                return 0 ;
        }
        
        else if ( y1 > y2)
            return 1 ;
        else
            return -1 ;
    }
    
}
