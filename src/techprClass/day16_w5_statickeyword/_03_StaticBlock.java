package techprClass.day16_w5_statickeyword;

public class _03_StaticBlock {
	static int age; 
	static int year = 2020;
	
	
	static  {
		// we use static block to initialize our static variable 
		// if you have more than one static block the first one will run first. it will run in order
		age=21;
		
	}
	
	static {
		System.out.println("Static 1");
		
	}
	static {
		System.out.println("Static 2");
		
	}
	static {
		System.out.println("Static 3");
		
	}
	
	public static void main(String[] args) {
		
		test1();
		System.out.println("this is my main method");
		test2();
					
}
	
	
	public static void test1 () {
		System.out.println("test1");
	}
	public static void test2 () {
		System.out.println("test2");
	}
	public static void test3 () {
		System.out.println("test3");
	}
}
