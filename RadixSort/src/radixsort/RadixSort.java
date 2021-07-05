/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;

import java.util.Arrays;

/**
 *
 * @author Mohamed Nasser
 */
public class RadixSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = new int [8];
        int n = arr.length;
        
        for (int i=0 ;  i < arr.length ; i++){
            arr[i]= (int) (Math.random()*100);
        }
        
        System.out.println("arr before sorting");
        print(arr, n);
        System.out.println("arr after sorting");
        radixSort(arr, n);
        print(arr, n);
    }
    
    static void print (int arr[],int n){
        
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    
    static int getMax(int arr[], int n ){
        
        int max = arr[0];
        for(int i= 1 ;  i< n ; i++)
            if(arr[i]>max)
                max=arr[i];
        
        
        return max;
    }
    
        static void radixSort(int arr[],int n){
        int m = getMax(arr,n);
        
        for(int exp = 1 ; m/exp > 0 ; exp*=10){
            countSort(arr, n, exp);
        }
    }
        
        
    static void countSort (int arr[],int n,int exp){
        
        int [] output = new int[n];
        int i ;
        int [] count  = new int[10];
        Arrays.fill(count,0);
        
        for ( i= 0 ; i < n ;i++)
            count[ (arr[i]/exp)%10 ]++ ;
        
        for(i = 1 ; i < 10 ; i++)
            count[i] += count[i-1];
        
        for(i =n-1 ; i >=0 ; i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        
        for (i = 0 ;i<n ; i++)
            arr[i]=output[i];
    }
    

    
}
