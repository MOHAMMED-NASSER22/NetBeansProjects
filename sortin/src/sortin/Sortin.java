/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortin;

/**
 *
 * @author Mohamed Nasser
 */
public class Sortin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y []=new int  [10];
        int m []=new int  [10];
        
  
            for (int i =0 ; i < 10 ; i++){ 
                m[i] = (int)  (( Math.random() * 250)+ 100) ;
                System.out.print(m[i]+"  ");
        }
            System.out.println();
        
        
       y =swap(y,m);
        
        for (int z=0 ; z<10 ;z++)
           System.out.println(y[z]);
           
      
     
          
      }
          
    
    
public static int[] swap (int z[],int x[]){

  for (int i =0 ; i < 10 ; i++){
        for( int j=i+1 ; j<10 ; j++){
            if   (x[j]>x[i]) {
                       int temp=x[i];
                        x[i]=x[j];
                        x[j]=temp;          
       }
       
        }
       
        }
            return x;
 }

}
