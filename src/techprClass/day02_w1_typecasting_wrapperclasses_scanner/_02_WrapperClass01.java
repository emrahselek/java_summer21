package techprClass.day02_w1_typecasting_wrapperclasses_scanner;

public class _02_WrapperClass01 {

	public static void main(String[] args) {
		
		/*
		 Primitive		Wrapper Class(Non-Primitive)
		  byte				Byte
		  short				Short
		  int				Integer  ********
		  long				Long
		  float				Float
		  double			Double
		  
		  boolean			Boolean
		  char				Character ********  
		*/
		
		int a=11;
		Integer b=12;
		System.out.println(b.MAX_VALUE);//2147483647
		System.out.println(b.MIN_VALUE);//-2147483648
		System.out.println(b.min(141, 32)); //23
		System.out.println(b.compare(25, 55));//-1 because the first is smaller
		System.out.println(b.compare(55, 25));//1  because the second is smaller
		System.out.println(b.compare(55, 55));//0  because they arae equal.
		System.out.println("==============");
		
		//Create a Short Wrapper Class variable
		//a)print the max and min values of short data type on the console
		//b)use any method and try to understand the logic of the method
		
		Short c=30014;
		Short d=112;
		Short e=112;
		System.out.println(c.MAX_VALUE);//32767
		System.out.println(c.MIN_VALUE);//-32768
		System.out.println(c.SIZE);// 16 ==>means c is used 16 bits in the memory
		System.out.println(c.hashCode());//30014  ==> It returns the address of the
											//         non-primitive data		
		System.out.println(c.equals(d));//false
		System.out.println(d.equals(e));//true
				
		//Autoboxing: Primitive one put another structure. This structure bigger.

		int x=12;
		Integer y=x;
		System.out.println(x);
		System.out.println(y);
		System.out.println("========");
		
		//Unboxing: You are getting value outside the box.
		Integer z=23;
		int t=z;
		System.out.println(z);
		System.out.println(t);
		
		
		//primitive data type max and min value:
				int mxv=Integer.MAX_VALUE;
				int mv=Integer.MIN_VALUE;
				System.out.println(mv + " & " + mxv);
				
				byte bmv=Byte.MIN_VALUE;
				System.out.println(bmv);
				
				long lmxv=Long.MAX_VALUE;
				System.out.println(lmxv);
				System.out.println("==============");
		
	}

}
