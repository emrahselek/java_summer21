package techpro.day05_w2_IfelseIf_NestedIf;

import java.util.Scanner;

public class _03_Nestedif01 {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter his/her age and gender (M-->male, F-->female)
		 if the age is negative, and gender is different from M and F give error message
		 if the age is greater then 65 and gender is male print "retired" otherwise "need to work"
		 if the age is greater than 60 and gender is female print "retired' otherwise "need to work"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter you age..");
		int age=scan.nextInt();
		System.out.println("please enter your gender..(M==>Male, F==>Female)");
		char gender = scan.next().toUpperCase().charAt(0);
		
		if (age<0) {
			System.out.println("invalid age");
		}else if (!(gender=='M' || gender=='F')) {
			System.out.println("invalid age and invalid gender");
		}else if(gender=='M') {
			if(age>65) {
				System.out.println("retired");
			}else {
				System.out.println("need to work");
			}
		}else if(gender=='F') {
			if(age>60) {
				System.out.println("retired");
			}else {
				System.out.println("need to work");
			}
		}
			scan.close();
			
		}

}
