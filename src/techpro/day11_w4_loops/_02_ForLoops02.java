package techpro.day11_w4_loops;

import java.util.Scanner;

public class _02_ForLoops02 {
	
	public static void main(String[] args) {
		
		/*
		 Typing code to find the multiplication of the numbers from 1 to 4
		 */
		
		int product = 1;
		for(int i=1; i<5 ; i++) {
			product = product*i;
			//System.out.println("each loop: " +product);
		}
		System.out.println(product);
		
		
		System.out.println("=============");
		
		/*
		 ask user to enter a number to find its factorial .
		 like..--> 5! = 5*4*3*2*1
		
		 */
		
		// after 17! we can not valid results beacuse of data type size limit (16!=2,004,189,184)
		// like--> int`s whole numbers from -2,147,483,648 to 2,147,483,647 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
		int num = scan.nextInt();
		
		int a = 1;
		
		if(num<0) {
			System.err.println("Invalid value for factorial");
			//System.out.println("Invalid value for factorial");
		}else {
			for(int i = num; i>0; i--) {
				a = a*i;
		}
		System.out.println( num+ "!  =" + a);
		}
		
		
	}
}