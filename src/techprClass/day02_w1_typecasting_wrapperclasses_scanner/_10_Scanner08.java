package techprClass.day02_w1_typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class _10_Scanner08 {

	public static void main(String[] args) {
		
		
		/*
		  	type a program which convert the hours to seconds.
		  	hours value will be entered by user.
		  	hint 1: second=hour*60*60
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the hours Value..." );
		double h = scanner.nextDouble();
		System.out.println("second: "+ (h*60*60));
		
	}

}
