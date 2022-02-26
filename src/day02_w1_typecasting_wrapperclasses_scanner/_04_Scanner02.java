package day02_w1_typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class _04_Scanner02 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); 				  //create Scanner Object
		
		System.out.println("hey dude, enter your firstname..."); //give message to user
 		String firstname = scanner.nextLine(); 					//create a container to store data coming from user
		
		System.out.println("hey dude, enter your lastname...");
		String lastname = scanner.nextLine(); 
		String last=scanner.next();          
				
		System.out.println("hey dude, enter your addressname...");
		String address = scanner.nextLine();
		
		System.out.println("You are retired. true or false?");
		boolean isRetired = scanner.nextBoolean();
		
		
		// note: to get String data from user, you have " nextLine() " and " next() " methods.
		// nextLine() takes all String, but next() takes just first word.
		System.out.println("dude, enter your name...");
		String name = scanner.nextLine();
		
		System.out.println("dude, enter your xname...");
		String xname = scanner.next();
		
				
		//print the name on the console
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(address);
		System.out.println(isRetired);
		System.out.println(name);
		System.out.println(xname);

		scanner.close();
		
	}

}
