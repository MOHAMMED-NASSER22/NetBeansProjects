/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histing;

/**
 *
 * @author Mohamed Nasser
 */
public class Histing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     int a[][]= new int [4][3];
     int b[][]= new int [3][2];
     for (int i=0;i<a.length;i++){
         for (int j=0 ;j<a[0].length;j++){
             a[i][j]= getradom(5);
             
         }
        }
          for (int i=0;i<b.length;i++){
         for (int j=0 ;j<b[0].length;j++){
             b[i][j]= getradom(5);
             
         }
        }
     
     int c [][]= new int [4][2] ;
     c = multi (a , b );
     for (int i=0;i<a.length;i++){
         for (int j=0 ;j<c[0].length;j++){
             System.out.print(c[i][j] + "  ");
             
         }
         System.out.println();
                
     
     
       
    }
    }
    


public static int  getradom (int a){

return (int) (Math.random() * (a+1) );
        }




public static int[][]  multi (int [] []a , int [][] b){
    int [][] c = new int [a.length][b[0].length];
    for (int i=0 ; i<c.length;i++){
        for(int j=0 ;j<c[0].length;j++){
            for(int z=0 ; z<b.length;z++){
                c[i][j]+=a[i][z] * b[z][j];
            }
    }
         
    
       }
    return c;

}
}