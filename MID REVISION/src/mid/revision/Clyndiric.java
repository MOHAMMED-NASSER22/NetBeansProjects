/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.revision;

/**
 *
 * @author Mohamed Nasser
 */
public class Clyndiric extends Circle {
    private double h;
        Clyndiric(double r,double h){
            super(r);
            this.h=h;
        }
        public String ToString(){
            return super.ToString()+"  hight:"+h;
        }
       public double V(){
            return Area()*h;
        }
       public double hopa(){
           h=5;
           return h;
       }
    
}
