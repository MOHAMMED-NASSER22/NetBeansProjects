/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition.quiz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mohamed Nasser
 */
public class AdditionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // **11.16 (Addition quiz) page 448
        
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        ArrayList<Integer> answers = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");

        int answer = input.nextInt();
        
        
        while( number1 + number2 != answer ){
            if(answers.contains(answer))
                System.out.println("You already entered " + answer);
                 
            
            System.out.print("Wrong answer. Try again. What is " 
                    + number1 + " + "+ number2 + "? ");
            
        answers.add(answer);
        
        answer = input.nextInt();
    }
    
    System.out.println("You got it!");
    
     }
}
