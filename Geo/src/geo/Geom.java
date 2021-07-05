/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geo;

import java.util.Date;


public abstract class Geom {
    private double r;
    private String color;
    private boolean filled;
    private java.util.Date date;
    public Geom (){
    }
    public Geom(double r,String color,boolean filed) {
        this.color=color;
        this.date=date;
        this.r=r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract double getArea();
    public abstract double getPri();
    
    
    
}
