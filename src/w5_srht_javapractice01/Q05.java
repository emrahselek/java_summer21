package w5_srht_javapractice01;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		//ask user to enter 8 primitive data and print on the consle
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter byte");
		byte a = scanner.nextByte();
		System.out.println("user enter "+a);
		
		System.out.println("Please entera short");
		short b = scanner.nextShort();
		
		System.out.println("Please enter int");
		int c = scanner.nextInt();
		
		System.out.println("Please enter long");
		long d = scanner.nextLong();
		
		System.out.println("Please enter float");
		float e = scanner.nextFloat();
		
		System.out.println("Please enter double");
		double f = scanner.nextDouble();
		
		System.out.println("Please enter True or False");
		boolean g = scanner.nextBoolean();
		
		System.out.println("Please enter a char");
		char h = scanner.next().charAt(0);
		
		System.out.println( a + " " + b + " " + c + " " + d + "  " + e + " " + f + " " + g + " " + h);
		
		scanner.close();
		
	}

}
