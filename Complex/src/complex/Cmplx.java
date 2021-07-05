/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author Mohamed Nasser
 */
public class Cmplx {
    private double real;
    private double img;

    public Cmplx(double real, double img) {
        this.real = real;
        this.img = img;
    }
    
    public Cmplx conj(){
        return new Cmplx(real, img*-1);
    }
    
    public Cmplx mult(Cmplx c){
        return new Cmplx((real*c.real -img*c.img),(real*c.img +img*c.real));
    }
    
    public Cmplx div(Cmplx c){
        Cmplx con = c.conj();
        Cmplx x = c.mult(con);
        Cmplx y = mult(con);
        return new Cmplx(y.real/x.real, y.img/x.real);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    @Override
    public String toString() {
        if(img>0)
            return ""+real+"+"+img+"i";
        else if (img==0)
            return ""+real;
        else 
            return ""+real+img+"i";
    }
    
    
}
