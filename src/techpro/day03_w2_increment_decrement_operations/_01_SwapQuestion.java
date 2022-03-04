package techpro.day03_w2_increment_decrement_operations;

public class _01_SwapQuestion {

	public static void main(String[] args) {
		
		/*
		 Swap the value of two integer:
		 a=12;  b=5;  ==>  a=5; b=12;
		 */

		//1.way
		int a = 12;
		int b = 5;
		int temp = 0;
		System.out.println("Before the swap a is " + a);
		System.out.println("Before the swap b is " + b);
		
		//assign b to temp
		temp = b;
		//assign a to b
		b = a;
		//assign temp to a
		a = temp;
		System.out.println("After the swap a is " + a);
		System.out.println("After the swap b is " + b);
		System.out.println("=================");
		
		
		//2.way==> Do not use 3rd container
		int c = 20; // c=15
		int d = 15; // d=20
		System.out.println("before the swap c is " + c);
		System.out.println("before the swap d is " + d);
		
		c=c+d; 
		d=c-d;
		c=c-d;
		System.out.println("after the swap c is " + c);
		System.out.println("after the swap d is " + d);		
		
	}

}
