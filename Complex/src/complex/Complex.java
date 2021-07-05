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
public class Complex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cmplx c1 = new Cmplx(1,2);
        Cmplx c2 = new Cmplx(2, 3);
        Cmplx res = c1.div(c2);
        System.out.println(res);
        System.out.printf("%1.1f + %1.1f i",res.getReal(), res.getImg());
        
        System.out.println();

    }
    
}
