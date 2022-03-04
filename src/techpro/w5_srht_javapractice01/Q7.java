package techpro.w5_srht_javapractice01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Please enter a side of the square..");
		   	int side = scan.nextInt();
		   	  	
		   	System.out.println("area= " + (side*side));
		   	System.out.println("perimeter= " + (side*4));
		   	
		   	//2.way
		    double area = Math.pow(side, 2);
	        double perimeter = side*4;
	        
	        System.out.println("The area= " + area);
	        System.out.println("The perimeter= " + perimeter);
	        
	        scan.close();
	        
	}

}
