package techprClass.day02_w1_typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class _07_Scanner05 {

	public static void main(String[] args) {
		
		/*
		    type a program which calculates the area and the perimeter of 
		    a rectangle whose length and width are entered by user.
		    hint 1: Area of a rectangle is width x length
		    hint 2: Perimeter of a rectangle is 2 x (width + length)
		    	    
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("hey you, entered  width of the rectangle...");
		double width = scanner.nextDouble();
		
		System.out.println("hey you, entered length of the rectangle...");
		double length = scanner.nextDouble();
		
		System.out.println("Area: " + width*length);
		System.out.println("Perimeter: " +2*(width+length));
		
	}

}
