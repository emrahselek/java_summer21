package techprClass.day04_w2_concat_if_ifelse;

public class _01_OperatorSigns {
	public static void main(String[] args) {
		
		// =   --> Assignment Operator in java.(= means assignment/return.. not mean equal) 
		int num = 20;
		System.out.println("before" + num);
		num = 25;
		System.out.println("after" + num);
		
		
		// 	==   --> Equal Sign or comparison operator in java
		boolean isTrue = 5+2 ==7;
		boolean isFalse = 5+2 ==8;
		System.out.println(5==5);//true
		System.out.println(5!=6);//true
		System.out.println(isTrue == isFalse);//false
		System.out.println("-------");


		
		// 	!=   --> Not equal sign in java
		boolean isTrue1= 5+2 !=8;
		boolean noteq= 5+2 !=25;
		
		//	">", ">=", "<", "<=" --> All returns boolean
		
		//	&& --> and operator ... if you have at least one false result false
		//	|| --> Or operation ....if you have just one true the result will be true
		
		System.out.println(5>8);//false
		System.out.println(8>11-5);//true 
		 
		boolean b1=5>2;//true
		boolean b2=5==2+3;//true
		boolean b3=5==2;//false
		boolean b4=5<2;//false
		
		// to get true from &&, everything must be true
		System.out.println(b1&&b2);//true
		System.out.println(b1&&b3);//false
		System.out.println(b3&&b4);//false
		
		//to get false from || (or), everything must be false
		System.out.println(b3||b4);//false
		System.out.println(b1||b2||b3||b4);//true
		System.out.println(b2||b4);//true
	}

}
