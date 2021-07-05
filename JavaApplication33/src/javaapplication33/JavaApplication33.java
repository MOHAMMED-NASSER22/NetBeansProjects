/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author Mohamed Nasser
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int []list = {2,9,5,4,8,1,6};
        for( int i = 0 ; i < list.length ; i++){
            int currentMin= list[i];
            int currentMinIndix= i;
            
            for(int j=i+1 ; j<list.length ; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndix = j ;
                    
                }
            }
            
            if(currentMin !=i){
                list[currentMinIndix]=list[i];
                list[i]= currentMin ;
            }
            
            
        }
        
        
    }
    
}
