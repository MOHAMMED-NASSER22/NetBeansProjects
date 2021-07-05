/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Mohamed Nasser
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double [][] b = new double [8][8];
       
       for(double []i:b){
           for(double j : i)
               System.out.printf("%1.2f  ", (float)j);
           System.out.println();
       }
       System.out.println();
    }
    
}
