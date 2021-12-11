package w3_ergn_practiceClass;

import java.util.Scanner;

public class RepeatedLetters {

	public static void main(String[] args) {
		
		/*
		 Ask user for a string and print a new string made of 3 copies 
		 of the last 2 letters
		The strings length will be at least 2.
		ForExample:
   				INPUT      : Mustafa
   				OUTPUT     : fafafa
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String name = scan.next();
		String str=name.substring(name.length()-2);
		for (int i = 1; i<4; i++) {
			System.out.print(str);
		
	//https://zoom.us/j/96822954062?pwd=REFqbDc2YUQwMEp6WFFIT2xDZ0FlUT09
	//https://zoom.us/j/96822954062?pwd=REFqbDc2YUQwMEp6WFFIT2xDZ0FlUT09
		
		}
		
	}

}
