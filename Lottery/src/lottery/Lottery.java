/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;


import java.util.Scanner;

public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       while(true){
        int lottery =(int)(Math.random()*2);
        
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();
        
        int lotteryDigit1 = lottery / 10 ;
        int lotteryDigit2 = lottery % 10 ;
        
        int guessDigit1 = guess / 10 ;
        int guessDigit2 = guess % 10 ;
        
        System.out.println("The lottery number is " + lottery);
        
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2==lotteryDigit1
              && guessDigit1==lotteryDigit2)
        System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1==lotteryDigit1
              || guessDigit1==lotteryDigit2
              || guessDigit2==lotteryDigit1
              || guessDigit2==lotteryDigit2        
                        )
            System.out.println("Match one digit: you win $1,000");
        
        else
            System.out.println("Sorry, no match");
                }           
    }
    
}
