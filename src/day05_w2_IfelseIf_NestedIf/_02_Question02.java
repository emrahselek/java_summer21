package day05_w2_IfelseIf_NestedIf;

import java.util.Scanner;

public class _02_Question02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a 4 digit integer, then print the sum of the first
		 and the last digits of the number on the console.
		 For example: if user enters 1234 you will and 1 and 4, then print on the console 5
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a 4-digit number");
		int num=scan.nextInt();
		
		num=Math.abs(num);
				
		if(num>999 && num<10000) {
			
			int fDigit = num/1000; // 1234/1000 = 1.234 --> int-->1
			int lDigit = num%10;  // 1234 -->4
			
			System.out.println("the sum is " + (fDigit+lDigit));
				
		}else {
			System.out.println("do you know 4 digit numbers.. Please provide a 4 digit number");
			
		}
		

	}

}
