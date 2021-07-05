


package xpyramids;

import java.util.Scanner;
public class Xpyramids {
    
    public static void main(String[] args){
        System.out.println("enter the nubler of layer do u want");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        
        int y=m-1;
        int z=1;
        int i=0;
        for (int f=0;f<m;f++)
        {
        for(i=y;i>0;i--)
        System.out.printf(" ");
        y--;
        for(int j=0;j<z;j++)
         System.out.printf("X ");
        z++;
        
        System.out.println();
        }
        
    }
    
    
}