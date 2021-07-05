/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.ArrayList;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;

/**
 *
 * @author Mohamed Nasser
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ArrayList <Integer> lst  = new ArrayList<>();
       lst.add(1);
       lst.add(2);
       lst.add(3);
       lst.add(4);
       System.out.println(lst);
       shuffle(lst);
       System.out.println(lst);
    }
    
    public static void shuffle(ArrayList <Integer> lst){
        
     for(int i = 0 ; i < lst.size();i++){
         
         int r = (int) (Math.random()*lst.size());
         
         int temp = lst.get(r);
         
         lst.set(r,lst.get(i));
         lst.set(i, temp);
         PathTransition p = new PathTransition();
        p.setDuration(Duration.INDEFINITE);
        p.setCycleCount(Timeline.INDEFINITE);
     }
        
    }
    
    
}
