package techpro.day02_w1_typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class _05_Scanner03 {

	public static void main(String[] args) {
		
		// Type a program which calculates the cube of a number
		// which is entered by user.  a==> Cube: a*a*a
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("hey user, enter a number to calculate its cube..");
		double number = scanner.nextDouble();
		System.out.println(number*number*number);

	}

}
