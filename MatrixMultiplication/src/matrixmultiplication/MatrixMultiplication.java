/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplication;

/**
 *
 * @author Mohamed Nasser
 */
public class MatrixMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int m1[][] = { {1, 1, 1, 1}, 
                         {2, 2, 2, 2}, 
                         {3, 3, 3, 3}, 
                         {4, 4, 4, 4}}; 
  
          int m2[][] = { {1, 1, 1, 1}, 
                         {2, 2, 2, 2}, 
                         {3, 3, 3, 3}, 
                         {4, 4, 4, 4}}; 
          
          int res[][]=new int[m1[0].length][m2.length];
          multiply(m1, m2, res);
          System.out.println("Result matrix is");

          for(int i = 0 ; i < m1.length ; i++){
              for(int j = 0 ; j < m1[0].length;j++)
                System.out.print(res[i][j]+" ");
              
              System.out.println();
                  
          }
          
    }
    
    static void multiply(int [][]m1 ,int [][]m2,int [][]res ){
        
        if(m1[0].length != m2.length){
            System.out.println("m1 colums & m2 raws didn't match ");
        }
        else{
            int i , j , k ;
            for (i =0 ; i < m1.length ; i++){

                for ( j = 0 ; j < m2[0].length ; j++){
                    res[i][j]=0;
                    for(k = 0 ; k < m1.length ; k++)
                        res[i][j] += m1[i][k]*m2[k][j];
                }
            }
            }
        
    }     
    
}
