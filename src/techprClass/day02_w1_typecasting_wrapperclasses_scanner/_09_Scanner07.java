package techprClass.day02_w1_typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class _09_Scanner07 {

	public static void main(String[] args) {
		
		/*
		 	type  a program which converts the mile to kilometer.
		 	mile value will be entered by user. (use double)
		 	hint 1: km = mile * 1.6
		 	hint 2: to get double, use nextdouble()
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the mile to convert km ....");
		double mile = scanner.nextDouble();
		System.out.println(mile*1.6 + " km");
				
	}

}
