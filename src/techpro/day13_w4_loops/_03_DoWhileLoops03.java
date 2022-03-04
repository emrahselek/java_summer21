package techpro.day13_w4_loops;

import java.util.Scanner;

public class _03_DoWhileLoops03 {

    public static void main(String[] args) {
        /*
          	 Ask user to enter his/her first name
             If the initial is lower case print a message like "Make the initial upper case"
             If the initial is upper case print a message like "You did it right"
         */
        
        Scanner scan = new Scanner(System.in);
        
        char initial = '*';
        do {
            System.out.println("Enter your First name please");
            initial = scan.next().charAt(0);
            if(initial>='a' && initial <= 'z') {
                System.out.println("Make the initial upper case");
            }
        }while(initial>='a' && initial <= 'z');
        System.out.println("Finally!!! You did it right :) ");
        
    }
}