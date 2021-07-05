/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect.square;

import java.util.Scanner;

/**
 *
 * @author Mohamed Nasser
 */
public class PerfectSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // **11.17 (Algebra: perfect square) page 448
        
        System.out.print("Enter an integer : ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
             int n =1;
        while(true){
           if(Check(m*n)){
               System.out.println(
                "The smallest number n for m * n to be a perfect square is " +n);
               System.out.println("m * n is "+m*n);
           break;
           }
           else
           {
           n++;
           }
           
        }
        
        
    }
    // Check Perfect Squares
    public static boolean Check (double x ){
        
        double sq = Math.sqrt(x);
        
        return((sq-Math.floor(sq)==0));
    }
    
}
