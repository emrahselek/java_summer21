package techprClass.day12_w4_loops;

import java.util.Scanner;

public class _04_WhileLoops04 {

	public static void main(String[] args) {
		
		/*
		Type java code by using while loop,
        Write a program to count the factors of an integer which is entered by user.
        Factors of 12 = 1, 2, 3, 4, 6, 12
        Factors of 8  = 1, 2, 4, 8
        Factors of 15 = 1, 3, 5, 15
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number...");
		int num=Math.abs(scan.nextInt());
				
		//Factors of 12 = (i=1) 1, 2, 3, 4, 6, 12
		//for example user type=12
				
		int i=1;
		int count = 0;//flag
		while(i<=num) {    // (i<12)     i<12... true  
			if(num%i==0) { //(12%i==0)   12%2==0.. true
				count++;
				System.out.print(i + "  "); // if true and print it
			  }
		   i++; // i=1 and now i++ mean i will change number and new i is 2 and repeat loop
		}
		System.out.println();
		System.out.println("the number of positive factors " + count );
		
		
	}

}
