package techprClass.day02_w1_typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class _06_Scanner04 {

	public static void main(String[] args) {
		
		/*
		 	type a program which calculates the area and perimeter of a square
		 	whose side length is entered by user.
		 		a==> Area:a*a
		 		a==> Perimeter:4*a
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side length of the square: ");
		double side = scanner.nextDouble();
		
		System.out.println("Area: " + side*side);
		System.out.println("Perimeter: " + 4*side);
		
		
	}

}
