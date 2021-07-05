/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.Scanner;

/**
 *
 * @author Mohamed Nasser
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
        int h = input.nextInt();
        
        int x = h ;
        int y = 1;
                ;
        for ( int j = 0 ; j < h ; j++){
      
        for ( int m = 0 ; m < x ; m++){
            System.out.print(".");
            
        }
         for ( int i = 0 ; i < y ; i++){
            System.out.print("#");
         
        }
           System.out.println();
           x--;
           y++;
    }
     
    }
    
}
