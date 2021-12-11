package day27_w9_slym_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class X2_E02 {

/*
 	1)You can use multiple "catch blocks" for a single "try block"
 	2)If you use multiple "catch blocks", order the Exception Classes from child to parent, otherwise
 	  you will get Compile Time Error.
 	3)If you use multiple "catch blocks", you can get different messages for every Exception
 	4)try-block cannot be used alone
 	5)When you type code if you get red underline for Exceptions, that kind of Exceptions are called "Checked Exceptions" 
 	  If you do not get any red underline for some Exceptions, they are called "Unchecked Exceptions"
 	  FileNotFoundException and IOException are "checked exceptions"
 	6)If there is any Exception Java stops execution
 */
	
	
	public static void main(String[] args) {
		
		try {	
	
			FileInputStream fis = new FileInputStream("src/day27_w9_slym_exceptionsXX/TextFile01");
			
			int i=0;
			
				while((i=fis.read()) !=-1) {
					System.out.print((char)i);
				}
				
			fis.close();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("I think the path is wrong or files does not exist.... ");
			e.getStackTrace();
			System.out.println(e.getMessage());
		
		} catch (IOException e) {
			
			System.out.println("There are some issue to read the file...");
			
		}
		
	}

}



