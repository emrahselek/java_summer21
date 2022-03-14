package techprClass.day13_w4_loops;

import java.util.Scanner;

public class _05_DoWhileLoops05 {
	
    public static void main(String[] args) {
        
        /*
             Ask user to enter an integer. 
             If the integer is divisible by 5, tell user to "Won"
             Otherwise tell user "Lost" and ask user if she/he wants to play again.
             if yes ask a new number to enter, if no say Thanks.
       */
        
        Scanner scan = new Scanner(System.in);
        
        int num= 0;
        do {
            System.out.println("Enter an integer");
             num = scan.nextInt();
            if(num%5==0) {
                System.out.println("YAYYY You WON");
            }else {
                System.out.println("You LOST!!! :(");
            }
            System.out.println("To end the game pres NO (N) to continue press any key");
            char answer = scan.next().toUpperCase().charAt(0);
            if(answer=='N') {
                break;
            }
        }while(true);
        System.out.println("Thank you");
         
    }
}