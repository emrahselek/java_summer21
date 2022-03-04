package techpro.day13_w4_loops;

import java.util.Scanner;

public class _06_ContinueAndBreake {
	
    public static void main(String[] args) {
        
        /*
         Continue : if I want to skip any values
                    it takes you to increment or decrement when executed. 
         
         Break    : is used to break the loop.
         
       */
            	
        for(int i=1 ; i<6; i++) {
            if(i==3 || i==5) {
                continue;
            }
            System.out.println(i+ " ");
        }
        
        /*
          Ask user to enter an integer and print them until 10
        */
        
        Scanner scan = new Scanner(System.in);
                
        do {
            System.out.println("Enter an Integer");
            int num = scan.nextInt();
            if(num==10) {
                break;
            }else {
                System.out.println(num +" ");
            }
        }while(true);
        System.out.println("you stopped the loop by BREAK");
        
    }
}

