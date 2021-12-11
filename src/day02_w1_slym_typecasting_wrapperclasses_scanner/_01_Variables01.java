package day02_w1_slym_typecasting_wrapperclasses_scanner;

public class _01_Variables01 {

	public static void main(String[] args) {
		
		/*
		  If you convert a primitive data type to another one,
		  it is called "Type Casting".
		 */
		
		// byte < short < int < long < float < double
		
		// Auto Widening Casting==> if you assign a smaller data type to a large data type 
		//                          then java converts the data type automatically to the large one.
		byte age=65;
		short newAge=age;
		System.out.println(age);
		System.out.println(newAge);
		byte m1=111;
		short m2=m1;
		System.out.println(m2);
		
		
		// Explicit Narrowing Casting ==> If you assign a large data type to smaller data type 
		//                                then java cannot convert the data type automatically to smaller one.
		//                                You have to convert manually. like-->byte num1=(byte)num2;  
		long profit=3258;
		int newProfit=(int)profit;
		System.out.println(newProfit);
		short x1=1279;
		byte x2=(byte) x1;
		System.out.println("Explicit narrowing casting: "+ x2);
		short x11=1284;
		byte x22=(byte)x11;
		System.out.println("Explicit narrowing casting: "+ x22);
		
		//Type code to convert float to short
		float pi=3.1415f;
		short newPi=(short)pi;
		System.out.println(pi);//3.1415
		System.out.println(newPi);//3 
		System.out.println("============");
		
		// If the number is not in the range of the second data type,
		// java uses "modulus operation" to put value into the range 
		short price=245;
		byte newPrice=(byte)price;
		System.out.println(price);
		System.out.println(newPrice);
		System.out.println("----------------------");
		
		
		//how to do mathematical operations with different data types
		int a=5;
		double b=4;
		int c=2;
		int d=3;
		float e=4.0f;
		// note: if data types are different, java uses 
		//the larger data type for the result
		System.out.println(a+b);//9.0
		System.out.println(a+c);//7
				
		// if you use same data type, result data type and value will be in the used data type. 
		// like (a/c)=2.5  ==>decimal part is removed and the result is 2
		System.out.println(a/c);//2
		System.out.println(a/d);//1
		
		//In double decimal you have 16 digits at most
		System.out.println(b/d); //1.3333333333333333

		//In float decimal you have 7 digits at most
		System.out.println(e/d); //1.3333334
		
		int int1=10;
		int int2=20;
		float floatx=2f;
		double doublex=5;
		System.out.println(int1/int2);
		System.out.println(int2/int1);
		System.out.println(doublex/int2);
		System.out.println(int1/floatx);
		System.out.println(int2/doublex);
		
		
		
		
		
			}

}
