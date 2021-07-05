/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combine.two.lists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mohamed Nasser
 */
public class CombineTwoLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //11.14 (Combine two lists) page 447
        
        Scanner input = new Scanner(System.in);
       
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        System.out.print("enter list1 (5 numbers): ");
        for (int  i = 0 ; i < 5 ; i++){
           list1.add(input.nextInt());
        }
        
        System.out.print("enter list2 (5 numbers): ");
        for (int  i = 0 ; i < 5 ; i++){
           list2.add(input.nextInt());
        }
        
        list3 = union(list1,list2);
        
        System.out.println(list3);
    }
    
    public static ArrayList<Integer> union( ArrayList<Integer> list1 , ArrayList<Integer> list2){
        
        ArrayList<Integer> list3 = new ArrayList<>();

         for (int  i = 0 ; i < 5 ; i++){
           list3.add(list1.get(i));
        }
           for (int  i = 0 ; i < 5 ; i++){
           list3.add(list2.get(i));
        }
    
           return list3;
    }
}
