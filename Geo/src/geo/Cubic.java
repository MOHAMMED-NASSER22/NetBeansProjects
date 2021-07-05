/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geo;

/**
 *
 * @author Mohamed Nasser
 */
public class Cubic extends Shap3D{
     
    rec rec=new rec();

    public Cubic(double h) {
        super(h);
    }

    @Override
    public double getVolume() {
        return rec.getArea() * super.getH();
    }

    @Override
    public double getSideaArea() {
        return rec.getPri() *super.getH();
        }

    @Override
    public double getTotalArea() {
        return getSideaArea()+ (rec.getArea() *2);
                
       }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
   
    
}
