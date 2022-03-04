package techpro.day11_w4_loops;

import java.util.Scanner;

public class _01_ForLoops01 {

	public static void main(String[] args) {
		 
	        /*
	         Type a program to find the sum of the integers from 1 to 5
	         */  
	            
	        int sum = 0;
	        
	        for(int i = 1 ; i<5 ; i++) {
	             sum = sum +i;
	        System.out.println("the sum is " + sum); // gives you the sum for every loop
	        }
	        
	        System.out.println("the sum is finally: " + sum); // gives the final sum
	        
	        System.out.println("=======================");
	        
	        /*
	         Ask user to enter Starting and Ending value, 
	         then find the sum of all integers from the starting to the ending value
	        */
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Enter a start value");
	            int x = scan.nextInt();
	            System.out.println("Enter an End value ");
	            int y = scan.nextInt();
	            
	            int s = 0;
	            if(x>y) {
	                System.out.println("Invalid Start value...");
	            }else {
	                for(int i = x;  i<=y ; i++ ) {
	                    s = s+i;
	                    System.out.println("each loop: "+s);
	            }
	                System.out.println("the sum is " +s);
	            }       
	        
	    }
	    

	}

