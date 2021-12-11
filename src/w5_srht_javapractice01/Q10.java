package w5_srht_javapractice01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		/*
		Write a program in Java to input 5 numbers from keyboard and find their sum and average.
		EXAMPLE:
		       INPUT     : 
		Input the 5 numbers :                                                           
		1                                                                               
		2                                                                               
		3                                                                               
		4                                                                               
		5             
		    OUTPUT :
		The sum of 5 no is : 15                                                         
		The Average is : 3.0
		*/
		
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("input 5 numbers");
		 
		 System.out.println("1.no: ");
		 double a=scan.nextDouble();
		 System.out.println("2.no: ");
		 double b=scan.nextDouble();
		 System.out.println("3.no: ");
		 double c=scan.nextDouble();
		 System.out.println("4.no: ");
		 double d=scan.nextDouble();
		 System.out.println("(last one dude.)==> 5.no: ");
		 double e=scan.nextDouble();
		 
		 System.out.println("sum of digit: " + (a+b+c+d+e));
		 System.out.println("average of digit: " + ((a+b+c+d+e)/5));
		 
		 // double sum=a+b+c+d+e;
		 // double ave=sum/5;
		 //System.out.println("sum of digit: " + sum);
		 //System.out.println("sum of digit: " + ave);
		 

		
		
	}

}
