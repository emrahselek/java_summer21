package techprClass.day27_w9_exceptions;

public class X3_E03 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 3;
		
		try {
			
			System.out.println(a / b);
			
		}catch(ArithmeticException e) {
			System.out.println("Do not use zero as divisor...");
		}
		
	}

}


/*

double a = 0.0;
double b = 0.0;
System.out.println(a / b);

System.out.println(2.0 % 0);
System.out.println(0.0 / 0);
System.out.println(Math.sqrt(-1));


*/