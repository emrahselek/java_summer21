package techpro.day03_w2_increment_decrement_operations;

import java.util.Scanner;

public class _05_ModulusOperator01 {

	public static void main(String[] args) {
		
		/*
		 Modulus Operator (%) is used to find remainder when divide a number
		 20/5 =5
		 20%5 =0(remainder-Kalan:))
		 */
		System.out.println(21%5); // 1
		
		
		//Get a number from user and print last digit of that number on the console
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.. ");
		int num = scan.nextInt();
		
		
		int lastDigit=num%10;
		System.out.println("the last digit of the number is "+ lastDigit); //or ("the last digit of the number is "+ num%10);
		System.out.println("===============");
		
		
		
		//Get a 3-digit integer from user and return the sum of its digit
		Scanner scanx = new Scanner(System.in);
		System.out.println("Please enter a 3-digit number ");
		int number = scanx.nextInt();
		
		int lastxDigit = 0;
		int midxDigit = 0;
		int firstxDigit = 0;
		int middle = 0;
		
		lastxDigit = number%10;
		firstxDigit = number/100; //256/100=2.56
		middle = number/10;//25.6 ~25
		midxDigit = middle%10;//5
		
		System.out.println(firstxDigit+midxDigit+lastxDigit);
		
	}

}
