package day04_w2_ahmt_concat_if_ifelse;

import java.util.Scanner;

public class X5_IfElseStatement02 {

	public static void main(String[] args) {
	
        //Get the day name from user, then tell to the user if it is week day or weekend day	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name");
		String day=scan.next().toLowerCase(); //scan.next().toLowerCase();
		
		// == -->check the value and addresses if both are same it true otherwise,false
		// equal() -->check just the value by not ignoring cases
		// equalsIgnoreCase() --> check the value by ignoring case or use "scan.next().toLowerCase();"
				
		if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			System.out.println("weekend");	
		}else {
			System.out.println("Weekday");
			}
	}

}
