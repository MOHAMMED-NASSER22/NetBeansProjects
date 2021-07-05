/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

import java.util.Scanner;

/**
 *
 * @author Mohamed Nasser
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        eqation e = new eqation (a,b,c);
        
        System.out.println("root1="+e.root1());
        System.out.println("root2="+e.root2());
               
        
    }}
    

  class eqation{
     
     private double a ;
     private double b ;
     private double c ;
     eqation(double a , double b ,double c){
             this.a=a;
             this.b=b;
             this.c=c;
     }
     
     public double getA(){
       return a;
     }
     public double getB(){
       return b;
     }
     public double getC(){
      return c;
           }
       public double  getDiscrminate(){
           return ((b*b)-4*a*c);
       }
       public double  root1(){
           return ((-1*b+Math.sqrt(getDiscrminate()))/2*a);
       }
       public double  root2(){
           return ((-1*b-Math.sqrt(getDiscrminate()))/2*a);
       }  
     
    }
     
     
     
     
 