package day01_w1_variables;

public class Lesson01_Variables_Data_Types_Literals_Scanner {

/**
//--------------------PROPERTIES OF VARIABLES--------------------------\\

	* All Java variables are called identifiers.And they are class names, method names, and variable names.All Identifiers';

	* Names can contain letters, digits, underscores, and dollar signs

	* Names should begin with a letter, $ and _

	* Names are case sensitive (y and Y are different variables)

	* Names cannot contain whitespace or Reserved literals(3 words:true-false-null) (Java keywords(54)- such as if or else) cannot be used as names

	* All Java pre-defined class names, method names, or interface names can be used as identifiers. But of course not recommended.
			
	
	
//----------------- A) PRIMITIVE DATA TYPES--------------------------//
 	
 	1) double --> decimals number: Range is larger
 	2) float  --> decimals number: Range is smaller than double's range

 	3) int    --> integer:Whole numbers from -2,147,483,648 to 2,147,483,647 
 	4) byte   --> Whole numbers from -128 to 127
 	5) short  --> Whole numbers from -32768 to 32767
 	6) long   --> whole numbers from -9,223,372,036,854,755,808 to 9,223,372,036,854,755,807      
            
 	7) boolean --> boolean data type is used just for "true" and "false" and default value is "false"

 	8) char    --> it stores letters,numbers of characters like: 'A'
 	 
 	 
 	* ORDER THE NUMBER DATA TYPES IN ASCENDING ORDER:
  		byte < short < int < long < float < double   
	


//--------------- B) NON-PRIMITIVE DATA TYPES--------------------------//    
 	
 	* String  --> it stores words, letter, number, whatever you want:) String s="batmanX01";
	

*/

//EXAMPLES OF DATA TYPES*************
 double salary = 2.34;	
 float weeklySalary = 1.234f;	
 int price1 = 100;	
 byte age = 45;	
 short populationOfAVillage = 25000;	
 long bigData=1112223334;	
 boolean isNew = true;		
 char initial = 'S';
 String n = "NoOne!cool man#$%/";

			
/**			
//--------------------------NOTES-------------------------------------\\

	* If a method is static, everything you used in the method must be static.
	
	* If you do not assign any value for a variable, Java uses "default values"	
	
	* ASCII --> American Standard Code for Information Interchange
	
	
	
	
//---------------------WRAPPER CLASS-------------------------------------//
		
		 PRIMITIVE		WRAPPER CLASS(NON-PRIMITIVE)
		  byte				Byte
		  short				Short
		  int				Integer  ********
		  long				Long
		  float				Float
		  double			Double
		  
		  boolean			Boolean
		  char				Character ********  	
	
* AUTOBOXING: Primitive one put another structure. This structure bigger.
				int x=12;
				Integer y=x;	
	
* UNBOXING: You are getting value outside the box.
				Integer z=23;
				int t=z;	
	
* PRIMITIVE DATA TYPE MAX AND MIN VALUE:
				int mxv=Integer.MAX_VALUE;
				int mv=Integer.MIN_VALUE;
				System.out.println(mv + " & " + mxv);
				byte bmv=Byte.MIN_VALUE;
				System.out.println(bmv);			
					
//These all are Wrapper Classes where all the primitive data are stored. u can apply to all Wrapper classes.

			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Character.MAX_VALUE);

			System.out.println(Integer.BYTES);
			System.out.println(Character.BYTES);
			
			
			
//-----------------------TYPE CASTING---------------------------------//

* If you convert a primitive data type to another primitive data type,
  it is called "Type Casting".

* AUTO WIDENING CASTING : If you assign a smaller data type to a large data type 
   		                  then java converts the data type automatically to the large one.
						  	byte age = 65;
						  	short newAge = age;
	
* EXPLICIT NARROWING CASTING: If you assign a large data type to smaller data type 
		                      then java cannot convert the data type automatically to smaller one.
		                      You have to convert manually. 
									long profit = 3258;
									int newProfi = (int)profit;	
									float pi = 3.1415f;
									short newPi = (short)pi;
									
									
//---------------------SCANNER CLASS----------------------------------//
	
 	* to get data from user we need to use "Scanner Class" in java
	* to be able to use "Scanner Class"
	* Create an object from "Scanner Class"
		ClassName -->  ObjectName  -->  "="  -->  "new"  -->  ClasName();
	* by using the object access to the methods and use them 
	*   Scanner xs = new Scanner(System.in);              //create an object from Scanner Class 
		System.out.println("hey user, enter your age.."); //give a message to the user about what to enter
		int age = xs.nextInt();     				      //get the data user entered and put it into a container
		System.out.println(age);                	      //then use the data user entered however you want
		xs.close();										  //closing the scanner obj.
	
										
									
						
					
//--------------------------LITERALS------------------------------------\\
			 
	* There are 3 ways to put the literals-constants.
			 
 	* This octal and hexaDecimal only work on integral numbers(byte-short-int-long-double-float(only without a decimal point)-char(up to 65535))
			  
		  1-) Decimal Literals(base 10)--> from 0 to 9 allowed
			  Ex: int x = 10; ---> this is base 10
			 
		  2-) Octal form --> has a prefix of 0--> (base 8)-> from 0 to 7 allowed
			  Ex: int y = 010; --> this is an octal form
			 
		  3-) HexaDecimal form --> has a prefix of 0X--> (base 16)-> from 0 to 9 and a to f. a == 10 and f == 15 allowed. Java case sensitivity is disregarded here.
			  Ex:double pp = 0XFace;--> this is hexadecimal or pp = 0x125;

		  4-) char or int or ... a = '\u0061'; --> outputs a. this is called unicode \ u means hexaDecimal and u can only go for 4 digits.char a = '\ uxxxx'; 
			 
 	***** Conclusion: So u can assign integral types and literals into Floating Data Types. However if there is a decimal point in the literal  then Java treats that literal as double number and Double number rules would apply
*/
	
		public static void main(String[] args) {

			System.out.println("-----------Literal Examples------------------------------");

			int y = 0111; 
			//int bbb = 096; --> will not work since 9 is out of range. it is greater than 7
			double z = 0123;//java sees this as octal number. cause there is no decimal point
			//double pppp = 0896;// out of range cause of 8 and 9
			System.out.println(y + "..." + z);

			int p = 0Xf0; 
			double pp = 0XFace;
			double ppp = 07863.0;
			System.out.println(p + "..." + pp + "..." + ppp);
			//	double ppp = 0XFace.0; if there is a decimal point then it is double

			int g = '\uaa19';//hexadecimal form.called unicode
			char gg = '\u0061';
			System.out.println(g + "..." + gg);

			System.out.println("-----------Variables------------------------------------");

			//u can place _ between digits ONLY to improve the readability. NOT before or after the digits or decimal points. At the RunTime those underscores will be gone.

			int fff = 12__3_5_8;
			double ffff = 1_3.5_6_6;
			//double ffff = _1_3_.5_6_6_;
			System.out.println(fff + "..."+ ffff);

			char cha ='a';
			boolean bool =true;
			System.out.println(cha + "..." + bool);

			byte ax = 10;
			final int bx = 20;
			final int zx = 10;
			byte gx = bx + zx;
			//byte cx = ax + bx;

			System.out.println("gx = " + gx);

			
			
			System.out.println("-------Important-Notes------------------------------------");
/**
	 	**Escape Characters:
			 
		* \" --> lets u put double quotes
		* \' --> lets u put single quotes
		* \n --> takes u to next line
		* \\ --> outputs  a slash \
		* \t --> put a tab
		* \k ->horizontal tab
		* \r -> carriage return
		* \b -> backspace char
		* \f -> form feed
*/
			System.out.println("this is \\ symbol");
			System.out.println("this is \n indentation symbol");

/**
		* Char can carry integer values. char can be defined as integer,hexadecimal and octal values as long as up to 65535
			
		* special character < digits < UpperCase Letters < lowerCase letters
			
		* you can put escape characters in chars too

			  char a = '\n';

			  int x = '0'; --> 48			int a = 'a'; --> 97			int A ='A';--> 65
			  int y = '1'; --> 49			int b = 'b'; --> 98			int B ='B';--> 66
				.........						..........					.........
			  int z = '9'  --> 57			int z = 'z'; -->122			int Z ='Z';--> 90


			  char a = 97;					char A = 65; 				char hey = 48 -->0
			  ......						.......						......
		  	  char z = 122;					char Z = 90;				char hey = 57 -->9
		  
		  	  char hey = 1504 --> ?         char hey = '9'--> 9			char hey = 'a' -->a
*/
			System.out.println("-----------Binary Numbers---------------------------------");
			//this is a binary number. Only 0 and 1 are allowed

			int u = 0B1111; 
			int uu = 0b1011;
			System.out.println(u + "..." + uu + "\n");

			char a = 19788;//this character is either not defined or not found in the system.outputs 
			char ch1 = 65;//A
			char ch2 = 90;//Z
			char ch3 = 97;//a
			char ch4 = 122;//z
			char aaa = '\u0019';//special symbol
			char aaaa = 0X01562;//probably not defined
			char aaaaa = 0101;//A
			int i1 = '0';//48
			int i2 = '9';//57
			char ch5 = 48;//0
			char ch6 = 57;//9

			System.out.println(a + "..." + ch1 + "..." + ch2 + ch3++ + "..." +ch4 + "..." + ch5 +"......." + ch6 + "......."+ aaa + "..." +aaaa + "..." + aaaaa + "..." + i1 + "..." + i2);
			System.out.println(ch1 + 5);
			System.out.println(++ch1);

			
			
			
			
			
			
			
/**
//-----------TYPES OF VARIABLES--------------------------------------------------------\\
//------------Division 1---------------------------------------------------------------\\
			
	* PRIMITIVE VARIABLES:
		 Ex: int x;
		 x= 10;
			  
	* Reference Variables:
		 Ex:  Student s = new Student();

//-----------Division 2----------------------------------------------------------------\\
			 
NOTE: Every variable in Java is either instance, static, or local at the same time it is primitive or reference variable
		 
*****IMPORTANT NOTE:
			1) Instance methods can access instance variables-methods directly
			2) Instance methods can also access class variables-methods directly
			3) Class methods cannot access instance variables-methods directly
			4) Class methods can access class variables-methods directly 

*****Instance Variables***** 
			 
	* Object level variables.Instance variables can change from object to object. For every object a separate copy of 
	  instance variable created in the heap area.They are declared within the class and can be accessed by all methods 
	  either directly from instance methods or indirectly from static methods by using objects.
			
	* Following modifiers are applicable.private, public, protected, default,and final.
	* u can access the instance variable from instance area directly however u must access it through objects from static areas
	* Instance variables in scope from declaration until object garbage collected
	* JVM Provides default value when it is not initialized.
			
	* Ex: 		int x; ---> if it is final then u must initialize it
		  		Student a = new Student();
		  		System.out.println(a.x); --->0 (default value)
				 
	* If it is "final instance" variable then u must initialize it in three places explained below whether u use it or not, otherwise it will be CE. 
			   
	 Rule : u must initialize it before constructor. As u know, constructor is the last one to be executed in the instance control flow that's the reason. So three options;
	 1) at the time of the declaration
	 2) inside an instance block
	 3) or inside the constructor.Otherwise u get CE
			   
			   EX: final int x;
					public void hey() {
			 		  x = 10; -------------> U CANNOT INITIALIZE IT HERE. CAUSE method execution comes after constructor, or instance block
						System.out.println(x);
							}
						
						public void hey2() {
							System.out.println(x);
								}
							
							public static void main(String ... OZKAN_AYATA) {
								Practice1 p = new Practice1();
									
									p.hey2(); ---------------------> think about it defining x in hey method is useless since u r calling on hey2() cause final instance can only be initialized in three places

*****Static Variables*****
			  
		* Static variables are Class level variables or field level.If variable value is not being changed from object to object then use static variable.like u have 600 students with their different IDs use instance variables for those however they all go to same school so use static variable for that variable.
			 
		* For every object, there  will only be a single copy created in method area however on instance variables, a copy will be created for each object. 
		* These modifiers private, public, protected,default and final are applicable.
		* Static variables can be accessed either by object reference or class name but recommended use class name. Within same class u don't need class name since there is direct access to it.
		* The static initializer runs when the class is first used
		* Class variables�in scope from declaration until program ends
		* JVM Provides default value when it is not initialized.Not required to perform initialization.But if u do the two places are available. At the time of declaration, and static blocks.
			 
		* If it is "final static" variable however then u must initialize it whether u use it or not otherwise it will be CE.
			 
		  Rule :  u must initialize "final static" variable before class loading completion. So u must initialize it at the time of declaration or inside a static block. Anywhere else it is CE
			   
		  EX: final static int x;
			public void hey() {
			  x = 10; -------------> U CANNOT INITIALIZE IT HERE. CAUSE method execution comes after 										 															
							public static void main(String ... OZKAN_AYATA) {
								
								System.out.println(x); ---> u get CE

*****Local Variables*****
		
		* Local variables are the variables in the methods, constructors or inside blocks.Also called temporary variables or stack variables. Local variables will be stored in stack area.
		* Local variables to be used only with in the blocks.
		* Only applicable modifier is final.
		* Local variables in scope from declaration to end of block
		* JVM does not  provide default value when it is not initialized.However u don't have to initialize it when u don't use it even when it is final.
				
			EX:
			class Test{
			public static void  m1(int x, int y){ ---> x,y are formal parameters can only access 														inside method can be access as final.
			x = 100;									but for this question if u
			y = 200;									declare as final then it is CE since u r 														overriding it in the method
			sout(x + ".." + y);							
			}
			main method(){
			m1(10,20); ---> 10 and 20 are actual parameters
			}
			}

			Ex: main method{
			int x;    -----> local-primitive type
			String s = "a"; ----> local-reference type
			if(args.length > 0){
				x = 10;
			 	}
			 	sysout(x); ----> CE: CAUSE THERE IS NO ELSE HERE. SO WHAT IF JVM DOESNOT GO INTO IF 		 		 										PART.X IS NOT DEFINED FOR THAT MATTER. 	
			 	}				

			*****NOTE: it is worth of looking into this******
					 		
				static int x = 10;
				static int y;
				//int x = 12;
			
				public static void hey() {
					int x = 0;
					System.out.println(x);
				}
			
				public static void main(String[] args) {
					// x = 11;
					System.out.println(x+6);
			
					for(int x = 5; x <=5 ; x++);
					  System.out.println(x);
						for(int x = 0; x < 10; x++);
							System.out.println(5);
*/

			System.out.println("-------------------static examples-----------"); 

			Lesson01_Variables_Data_Types_Literals_Scanner d1 = new Lesson01_Variables_Data_Types_Literals_Scanner();
			System.out.println(ff + "...." + d1.y);
			ff = 888;
			d1.y = 999;
			System.out.println(ff + "...." + d1.y);
			Lesson01_Variables_Data_Types_Literals_Scanner d2 = new Lesson01_Variables_Data_Types_Literals_Scanner();
			System.out.println(ff + "....."+d2.y);
			//be careful here because for instance variable a new copy will be created however static variable once it is reassigned it stays the same.			
	}
		//outside of main method
		static int ff = 10;
		int y = 20;
}