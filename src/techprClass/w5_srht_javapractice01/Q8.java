package techprClass.w5_srht_javapractice01;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		/*
		 ask to user how many cups of tea you drink daily and how many spoons of sugar
         one spoon sugar is 1.7 gr
         print on the console amount of sugar used annually
		*/
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("how many cups of tea you drink daily?..");
	   	int cups = scan.nextInt();
	   	System.out.println("how many spoons of sugar");
	   	double s=scan.nextDouble();
	    
	   	System.out.println("Amount of sugar used annually "+ (cups*s*1.7*365/1000) +" kg");
	   	
	   	scan.close();
	   	
	   	
	   	
	   	
	   	

	
	
	}

}
