package day05_w2_IfelseIf_NestedIf;

import java.util.Scanner;

public class _01_Question01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter year type java code by using if -  else if() statement.
		 write a program to check if a year is leap year or not.
		 if the year is divisible by 100 then it must be divisible by 400.
		 if a year is not divisible by 100 then it must be divisible 4.
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a yaer to check if it is a leap year or not");
		int year=scan.nextInt();
		
		/*
		 1- & and && have similar functionally
		 2- & java will check all conditions (kodlarda sakin tek  & kullanma, sadece ne ise yaradigini bilmek yeter)
		 3- && java will not check all conditions if the first one is false.
		 */
		if(year%100==0 && year%400==0) {
			System.out.println(year + " is a leap year");
		}else if(year%100 !=0 && year%4 ==0) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not leap year");
		}

	}

}
