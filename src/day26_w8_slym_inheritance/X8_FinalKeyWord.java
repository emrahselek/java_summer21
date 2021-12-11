package day26_w8_slym_inheritance;

public class X8_FinalKeyWord {

/*
 	"final" keyword can be used for 
	 	a)Variables: It means you have to initialize the variable
	 	             It means you cannot update the value after initializing
	    b)Methods: It means you cannot change the body of the method
	    c)Class  : Cannot have child classes, it means you cannot "extends" to final classes
	             Note: final classes can be child class but cannot be parent class
	             i)All wrapper classes are final classes
	             ii)All immutable classes are final classes, so String Class is a final class
    
*/

public final String name = "Ali Can";


public static void main(String[] args) {
	
	X8_FinalKeyWord obj = new X8_FinalKeyWord();
	

}

}
