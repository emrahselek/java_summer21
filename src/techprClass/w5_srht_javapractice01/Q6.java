package techprClass.w5_srht_javapractice01;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		
		/*
		  ask user to enter a integer number
          find the sum of digitnumber
          example 345=12
		 */
		
       Scanner scan = new Scanner(System.in);
	   System.out.println("Please enter a integer..");
	   	int number = scan.nextInt();
		
	   	int a = 0;
		
		int sum = 0;
		
		while(number>0) {
			
			a=number%10;
			
			sum = sum + a;
			
			number=number/10;
						
		}
		System.out.println("sum of digit " + sum);
		scan.close();
		
	
	
	
	}
	
	
	   
}


