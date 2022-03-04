package techpro.w3_ergn_practiceClass;

import java.util.Scanner;

public class DivisibleFiveNumber {

	public static void main(String[] args) {

		
		/*Write a program to print a number entered by user,
		 * which are not divisible by 5 and divisible by 5.
		 */
		
		Scanner xscan=new Scanner(System.in);
		System.out.println("entered a number please");
		int number=xscan.nextInt();
		
		String s=number %5 ==0 ? "number is divisible by 5" :"number is NOT divisible by 5";
		System.out.println(s);
		
		//OR
		
		//System.out.println(number %5 ==0 ? "number is divisible by 5" :"number is NOT divisible by 5");
		
		//OR
		
//		if(number%5==0) {
//			System.out.println("number is divisible by 5 = " + number);
//		}else
//			System.out.println("number is not divisible by 5 = " + number);
//		
		
		
	}

}
