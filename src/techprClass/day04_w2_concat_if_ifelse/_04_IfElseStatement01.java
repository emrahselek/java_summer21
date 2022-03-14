package techprClass.day04_w2_concat_if_ifelse;

import java.util.Scanner;

public class _04_IfElseStatement01 {
	
	public static void main(String[] args) {
		/*
		   Get the length and the height of a rectangle from user, if they equal to each other
		   print "Square" on the console, otherwise print "Rectangle" on the console.
	    */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a side1 of the Rectangle ");
		double side1 = scan.nextDouble();
		System.out.println("enter  side 2 of the Rectangle ");
		double side2 = scan.nextDouble();
		
		if(side1 == side2) {
			System.out.println("Square");
		}else {
			System.out.println("Rectangle");
		}
		
			
	}
}