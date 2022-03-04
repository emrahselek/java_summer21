package techpro.w6_srht_javapracticeDT;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
	 /*
	  * Ask the user for an integer less than 100
        A method that returns to the user whether
        it is in a predefined array or not. write
     
      * Array={3,5,21,32,34,45,56,57,76,87,95}
      
      * Input : 5 Output: The number you entered is in the Array
      
      * Input : 15 Output: The number you entered is not in the Array
      
      */
		
		
		int[] Array={3,5,21,32,34,45,56,57,76,87,95};
		inArray(Array);
		
	}
	
	
	public static void inArray(int array[]) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("please enter the number less than 100");
		int number=scan.nextInt();
		int flag=0;
		
		for(int i=0;i<array.length;i++) {
			
			if(number==array[i]) {
				System.out.println("you number is in the array");
				flag++;
				break;
			}
							
		}
		if(flag==0) {
			
			System.out.println("number is not in the array");
		}
		
		
	}

}
