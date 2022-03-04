package techpro.day02_w1_typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class _03_Scanner01 {

	public static void main(String[] args) {
		
		/*
		  1)to get data from user we need to use "Scanner Class" in java
		  2)to be able to use "Scanner Class"
		  		a)Create an object from "Scanner Class"
		  			   ClassName      -->      ObjectName   -->    "="    -->     "new"      -->     ClassName();
		  		b)by using the object access to the methods and use them 
		 */
		
		Scanner xs = new Scanner(System.in);          //create an object from Scanner Class 
				
		System.out.println("hey user, enter your age.."); //give a message to the user about what to enter
				
		int age = xs.nextInt();     				//get the data user entered and put it into a container
				
		System.out.println(age);                	  //then use the data user entered however you want

		xs.close();
		
		 
	}

}
