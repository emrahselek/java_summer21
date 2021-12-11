package day07_w3_ahmt_stringmanipulations;

import java.util.Scanner;

public class X2_String01 {

      public static void main(String[] args) {
        
        // 1- equals() ==> Compare the Strings with cases and it returns boolean 
        // 2- equalsIgnoreCase() ==> Compare the Strings without cases and it returns boolean
        // 3- length() ==> the counts(size) of characters in a String and it returns int
        
        String str1 = "";
        System.out.println(str1.length()); //0 ==> for empty Strings the length() returns 0
        String str2 = " ";
        System.out.println(str2.length()); // 1  ==> in the string there is A SPACE and it is like a character
        String str3 = null; 
        //System.out.println(str3.length()); // NullPointerException ==> Do not use length() for null Strings
        
        
        // 4- toUpperCase ==> Converts all the Characters to Uppercase and it returns String
        String str4 = "java";
        System.out.println(str4.toUpperCase()); // JAVA
        // 5- toLowerCase ==> Converts all the Characters to lowercase and it returns String
        String str5 = "JavA";
        System.out.println(str5.toLowerCase()); // java
        System.out.println("===================");
        
        // 6- contains() ==> Checks if any specific characters exist in the STRING or not and it returns boolean
        System.out.println(str5.contains("v"));
        System.out.println(str5.contains("V"));
        
        String str6="java is not boring";
        System.out.println(str6.contains(str5));
        System.out.println(str6.contains(str5.toLowerCase()));
        
        // 7- charAt() ==> used to get a specific character from String and it returns character
        System.out.println(str6.charAt(5));
        System.out.println(str6.charAt(9));
        //System.out.println(str6.charAt(25));// StringIndexOutOfBoundsException ==> if you use an index greater than the last index you will get that Exception
        
        /*
         Ask user to enter a String.
         type code to return everytime the last character of the String
         */
        Scanner ask=new Scanner(System.in);
        System.out.println("enter a String ");
        String str7 = ask.nextLine().toLowerCase();
        
        // length()-1 ==> is used to get last index.
        System.out.println(str7.charAt(str7.length()-1));
        
        
		
	}

}
