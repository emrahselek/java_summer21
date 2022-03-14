package techprClass.day01_w1_variables;

public class _01_Variable {

	/**
	  1) Project ==> Package ==> Class ==> Variables + Methods

	  2) How to crpusheate "Variables"
	     a)Typing "Data Type"
	     b)Typing a name for variable
	     c)"="
	     d)Value and ";"

	  
	  3) Data Types:
	     a) "int" ==> integer: Whole numbers like 2, 454 , -47, 0 
	     b) "double" ==> decimals: Range is larger
         c) "float"  ==> decimals: Range is smaller than double's range
		   NOTE: If you create a variable inside a method, you should initialize it.
	         "int price1;" means you creates a variable
	         "=100" means you initialized the variable
           Note: If you want to see "default values" create the variables 
              outside the methods
	       NOTE: if a method is static, everything you used in the method must be static.
	       Note: If you do not assign any value for a variable, Java uses "default values"
              for them. Default values for: 
              a)int ==> 0
                			note: int`s whole numbers from -2,147,483,648 to 2,147,483,647 
              b)double ==> 0.0
              c)float==> 0.0
                			note: When you assign a value for a float variable use �f� or �F� at the end. float x=23.3f:
              d)char==> nothing or '\u0000'
              e)byte==> 0 
                			note: byte`s are whole numbers from -128 to 127
              f)short==> 0     
                			note: Short is whole numbers from -32768 to 32767
              g)long==> long`s whole numbers from -9,223,372,036,854,755,808 to 9,223,372,036,854,755,807 
              h)boolean==>false (default value) 
                     		note: boolean data type is used just for "true" and "false" values  
                     		  
           NOTE: Order the number data types in ascending order
                 byte < short < int < long < float < double          
	   
	 */
		     
	
	static int prc=10;
	static int price2;
	
	static double minSalary;
	static float hourlySalary;
	static char single;
	static boolean isOld;
	int pppr=11;

	
	public static void main(String[] args) { // Main Method
		
		//If you create a variable inside a static method Java makes it static automatically
		
		int price1 = 100;
		double salary = 2.34;
		float weeklySalary = 1.234f;
		char initial = 'S';
		byte age = 45;
        short populationOfAVillage = 25000;
        boolean isNew = true;
        boolean isRetired = false;
        String name = "Emrah";
        String names = "12344";
        String namef = "Emrah Selekk   !cool   man??/";
        long bigData=1112223334; 
        int  bigs   =1112223334;
        boolean b=5<9;
        System.out.println(b);
        System.out.println("========");
        
      
		System.out.println(price1);
		System.out.println(salary);
		System.out.println(price1 * salary);
		System.out.println(price2);
		System.out.println(minSalary);
		System.out.println(hourlySalary);
		System.out.println(weeklySalary);
		System.out.println(initial);
		System.out.println(single);
		System.out.println(age);
		System.out.println(populationOfAVillage);
		System.out.println(isOld);
		System.out.println(name);
		System.out.println(names);
		System.out.println(namef);
		System.out.println(isRetired);
		System.out.println(isNew);
		
		
		

	}
	
}
		
				
