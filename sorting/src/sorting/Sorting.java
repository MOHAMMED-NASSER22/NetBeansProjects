/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Mohamed Nasser
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // InsertionSort
     
        int []list = new int[10000];
        
        for (int i = 0 ; i < list.length ; i++)
            list[i]=(int) (Math.random() * 100000) ;
        
         
        long startTime = System.currentTimeMillis();
        insertionSort(list);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        print(list);
        System.out.println("time take to sort(insertionSort) : "+executionTime);
    
        long startTime1 = System.currentTimeMillis();
        mergeSort(list);
        long endTime1 = System.currentTimeMillis();
        long executionTime1 = endTime1 - startTime1;
        System.out.println("time take to sort(mergeSort) : "+executionTime1);
        
        long startTime2 = System.currentTimeMillis();
        bubbleSort(list);
        long endTime2 = System.currentTimeMillis();
        long executionTime2 = endTime2 - startTime2;
        System.out.println("time take to sort(bubbleSort): "+executionTime2);
        
        long startTime3 = System.currentTimeMillis();
        quickSort(list);
        long endTime3 = System.currentTimeMillis();
        long executionTime3 = endTime3 - startTime3;
        System.out.println("time take to sort(quickSort) : "+executionTime);
    }
    
    
    
    
    public static void print(int [] list){
        
        for( int i = 0 ; i < list.length;i++){
            System.out.print(list[i]+" ");
            
        }
        System.out.println();
    }
    
    
    
    
     public static void insertionSort(int [] list){
            
        int j;
        for( int i = 1 ; i < list.length;i++){
            int currentelemnt = list[i];
            
            for( j=i-1; j>=0 && list[j] > currentelemnt ; j-- ){
                list[j+1]=list[j];
            }
            list[j+1]=currentelemnt;
        }
      }
     
     
     
    public static void bubbleSort(int [] list){{
        boolean needNextPass=true;
        
        for(int k = 1 ;k < list.length && needNextPass ; k++){
            needNextPass = false;
            for(int i = 0 ; i < list.length - k ; i++){
                if(list[i] > list[i+1]){
                    
                    int temp  = list[i];
                    list[i]= list[i+1];
                    list[i+1]=temp;
                    
                    needNextPass = true;
                }
            }
        }
    }
    
    }
    
    
    
    public static void mergeSort(int [] list){
    
    if(list.length>1){
        int [] firstHalf = new int[list.length / 2];
        System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
        mergeSort(firstHalf);
        
        int[] secondHalf = new int [list.length - list.length / 2];
        System.arraycopy(list, list.length / 2, secondHalf , 0 , list.length - list.length / 2);
        mergeSort(secondHalf);
    
        merge(firstHalf,secondHalf,list);
    }
    
    
    
    }
       public static void merge(int[] list1 , int []list2 , int[]temp){
        int current1 = 0 ;
        int current2 = 0 ;
        int current3 = 0 ;
        
        while(current1 < list1.length && current2 < list2.length){
            if(list1[current1]<list2[current2])
               temp[current3++]=list1[current1++];
            else
                temp[current3++]=list2[current2++];
            
        }
        while(current1 < list1.length)
            temp[current3++]=list1[current1++];
            
        while(current2 < list2.length)
            temp[current3++]=list2[current2++];
        
    }
       
       public static void quickSort ( int []list){
           
           quickSort(list ,0, list.length-1);
       }
       
       public static void quickSort(int[] list , int first ,int last){
           if(last > first){
               int pivotIndex = partition(list,first,last);
               quickSort(list , first , pivotIndex - 1);
               quickSort(list , pivotIndex + 1 , last);
               
           }
           

       }
         public static int partition(int[] list , int first , int last){
            int pivot = list[first];
            int low = first + 1 ;
            int high = last ;
               
            while(high > low){
                while(low <= high && list[low] <= pivot)
                    low++;
                   
                while(low <= high && list[high] > pivot)
                    high--;
                   
                if(high > low){
                    int temp = list[high];
                    list[high] = list [low];
                    list[low] = temp;
                   }
               }
              while(high > first && list[high]>= pivot)
                  high--;
              
             if(pivot > list[high]){
                list[first]= list[high];
                list[high]= pivot;
                return high;
                  
                  }
            else
                return first ;
        }
}

