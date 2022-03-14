package techprClass.w5_srht_javapractice01;

import java.util.Scanner;

public class Q04 {
	
	public static void main(String[] args) {
	/*
	0)Ask user to enter two integers
    1)Swap the integers
    2)EXAMPLE:
     INPUT: a= 3
            b= 5
     OUTPUT: a= 5
             b= 3
	*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first integer..");
		int a=scan.nextInt();
		System.out.println("enter second integer");
		int b=scan.nextInt();
		int c=0;
		System.out.println("input: " + a +" "+ b);
		
		c=b;
		b=a;
		a=c;
			
		System.out.println("output: " + a +" "+ b);
		
		
		
	}

}
