/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geo;


public abstract class Shap3D extends Geom {

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    private double h;

    public Shap3D(double h) {
        this.h = h;
    }

    public Shap3D(double h, double r, String color, boolean filed) {
        super(r, color, filed);
        this.h = h;
    }
    public abstract double getVolume();
    public abstract double getSideaArea();
    public abstract double getTotalArea();
    
}
