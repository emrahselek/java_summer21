package techprClass.day12_w4_loops;

import java.util.Scanner;

public class _03_WhileLoops03 {

	public static void main(String[] args) {
		
		/*
		     Type java code by using while loop,
	         Write a program that prompts the user to input an integer.
	         It should then find sum of the digits of that number.
	         	123 ==> 1+2+3 = 6
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to find sum of the digits.");
		int num=Math.abs(scan.nextInt());// if user type (-) minus number like -123. it make positive number.
		
		int sum=0;
		while(num!=0) { 
			// 1) num will not be zero mean while codition is true and loop continue,
			// 2) if num is be zero mean while condition is false and loop is broke.
			
			sum = sum + num%10;
			num = num/10;	
		}
		System.out.println("the sum of digits: " + sum);
		
		/*
		 Explain: sum=sum+num%10;
		 		  num=num/10;
		 		  
		 		  123%10=3;
		 		  123/10=12.3 ==> int(123/10)=12;
		 		  
		 		  12%10=2;
		 		  12/10=1.2 ==> int(12/10)=1;
		 		  
		 		  1%10=1;
		 		  int(1/10)=0;
		*/
	
	
	}

}
