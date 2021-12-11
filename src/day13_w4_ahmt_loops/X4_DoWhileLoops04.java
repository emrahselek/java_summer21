package day13_w4_ahmt_loops;

import java.util.Scanner;

public class X4_DoWhileLoops04 {

	public static void main(String[] args) {
		
		/*
		 	 Ask user to enter password.
			 If the password has more than 6 characters print "Password is valid..."
			 Otherwise, print "Make the password longer than 6 characters" and ask user to enter a new password
		 */
		
		Scanner scan =new Scanner(System.in);
		
		String passw="";
		do {
			System.out.println("enter a password");
			passw=scan.nextLine();
			if(passw.length()<=6) {
				System.out.println("this is not i want..invalid password. it should be more than 6 ch");
			}
		}while(passw.length()<=6);
		System.out.println("valid password, thnx");
		
		
	}

}
