package day05_w2_IfelseIf_NestedIf;

import java.util.Scanner;

public class _04_Nestedif02 {

	public static void main(String[] args) {
		
		/*
		 *Ask user to enter an integer.
		 *If the integer is less than zero check if it less than -9. If it is less than -9 print "too small" otherwise print "small".
		 *If the integer is greater than zero check if it is greater than 9. If it is greater than 9 print "too big" otherwise print "big".
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter an integer");
		int num = scan.nextInt();
		
		if(num<0) {
			if(num<-9) {
				System.out.println("too small");
			}else {
				System.out.println("small");
			}
		}else if(num>0) {
			if(num>9) {
				System.out.println("too big");
			}else {
				System.out.println("big");
			}
		}else {
			System.out.println("you smart .. please enter + or - number");
		}
		scan.close();
	}

}
