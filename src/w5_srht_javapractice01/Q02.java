package w5_srht_javapractice01;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		/*
		    Ask user to enter a character and print the ASCII value 
			of that character
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character..");
		char ch=scan.next().charAt(0);
		int asc=ch;
		System.out.println("ascii: " +asc);
		
		

		
		
	}

}
