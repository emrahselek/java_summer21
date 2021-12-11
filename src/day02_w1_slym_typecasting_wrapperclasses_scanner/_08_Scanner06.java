package day02_w1_slym_typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class _08_Scanner06 {

	public static void main(String[] args) {
		
		/*
		 	type a program which calculates the volume of a rectangular prism
		 	whole length, width, and height are entered by user.
		 	hint 1: volume of a rectangular prism is width x lenght x height
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entered the width, lenght, and height...");
		double w = scanner.nextDouble();
		double l = scanner.nextDouble();
		double h = scanner.nextDouble();
	
		System.out.println("volume: "+ w*l*h);
		
		
		

	}

}
