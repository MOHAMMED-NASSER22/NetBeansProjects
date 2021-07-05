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
public abstract class  Circle {
   private double r;
        Circle(double r){
        this.r=r;
    }
        public String ToString(){
            return "raduis:"+r;
        }
        public double getr(){
            return r;
        }
    public double Area(){
        return r*r;
    }
       public abstract double hopa();
}
