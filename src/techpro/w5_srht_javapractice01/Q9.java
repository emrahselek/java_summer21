package techpro.w5_srht_javapractice01;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		/*
		* ask the user for an edge and height of an equilateral triangle
        * find the area and perimeter of the triangle
        * print on the console
		*/
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter an edge of an equilateral triangle..");
		 double e = scan.nextDouble();
		 System.out.println("Please enter a height of an equilateral triangle..");
		 double h = scan.nextDouble();
		 
		 System.out.println("area: " + (e*h/2));
		 System.out.println("perimeter: "+ (3*e));
		 
		
		
		
	}

}
