/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author Mohamed Nasser
 */
public class SortingArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 11.11 (Sort ArrayList) page 447
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 numbers "  );
        Scanner input = new Scanner(System.in);
        for (int  i = 0 ; i < 5 ; i++){
           list.add(input.nextInt());
        }
        System.out.println("Befor sorting "+list);
        sort(list);
        System.out.println("After sorting "+list);

        
        
        
        }
        public static void sort(ArrayList<Integer> list){
         
            Collections.sort(list);
        }

    
    
}
