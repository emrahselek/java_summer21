package day12_w4_ahmt_loops;


public class X5_DoWhileLoop01 {

	public static void main(String[] args) {
		
		/*
		  Difference between "while loop" and "do-while loop"
		  Answer: In  "do-while loop" loop body is executed at least once
		          But in "while loop" loop body execution depends on the condition. If the condition is false
		          while loop body is not executed even once...
		*/
				
		//While Loops:
		int i = 1;
		while(i>1) {// condition is false and while loop is not execute it. 			
			System.out.println("While Loop!...");			
			i++;
		}
				
		System.out.println("======================");
		
		//Do While Loops:
		int j = 1;
		do {			
			System.out.println("Do-While Loop!...");			
			j--;			
		}while(j>1);// condition is false but system do it work and print it one time.

	}

}