package techprClass.day28_w9_exceptions;

public class X2_E02 {
	
	/*
 	1)If you use for example length() method for "null" String object, you will get 
 	  "NullPointerException"
 	2)"NullPointerException" is an "unchecked exception"
 	3)If there is no parent-child relationship between Exception Classes, the order of catch-blocks
 	  is not important
 	4)try-block cannot be used alone, it can be used like the followings;
 		a)try + catch
 		b)try + multiple catch
 		c)try + catch or multiple catch + finally
 		d)try + finally
 		
   *we can use finally to close our file or database. It will be executed in any condition
	if we do not close our database;
	1-It can cause some security problems 
	2-Data leakage
	3-It means you will pay a lot to the cloud company

 		
 		
 		
 */

public static void main(String[] args) {
	
	String s1 = "";
	System.out.println(s1.length());//0
	
	String s2 = null;
	
	try {
		
		System.out.println(12 / 0);
		
		System.out.println(s2.length());//NullPointerException
			
		
	}catch(ArithmeticException e) {
		
		System.out.println("Do not divide by zero... " + e.getMessage());
		
	}catch(NullPointerException e) {
		
		System.out.println("Do not use length() for null. " + e.getMessage());
		
	}finally {
		
		System.out.println("finally part will be executed under every condition");
		
	}
	
	System.out.println("Will that code be executed?");

}

}