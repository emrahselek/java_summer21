package _QuestinAndSolutions_InTheClass;

public class _DAY01toDAY07___Solutions_InTheClasses {

public static void main(String[] args) {
		
/*
    
===day02================>      
1) Short c=30014;
    System.out.println(c.MAX_VALUE);//32767
	System.out.println(c.MIN_VALUE);//-32768
	
	//Extra..	
	int xmax=Integer.MAX_VALUE;
	int xmin=Integer.MIN_VALUE;
	System.out.println(xmin + " & " + xmax);
			
	byte bmin=Byte.MIN_VALUE;
	System.out.println(bmin);
	long lmax=Long.MAX_VALUE;
	System.out.println(lmax);
	
	
	
2)  Scanner scanner = new Scanner(System.in);
	System.out.println("hey user, enter a number to calculate its cube..");
	double number = scanner.nextDouble();
	System.out.println(number*number*number);
	
	
	
3) 		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side length of the suqare...");
		double side = scanner.nextDouble();
		
		System.out.println("Area: " + side*side);
		System.out.println("Perimeter: " + 4*side);
		
		
		
4) 		Scanner scanner = new Scanner(System.in);
		System.out.println("hey you, entered  width of the rectangle...");
		double width = scanner.nextDouble();
		
		System.out.println("hey you, entered length of the rectangle...");
		double length = scanner.nextDouble();
		
		System.out.println("Area: " + width*length);
		System.out.println("Perimeter: " +2*(width+length));
		
		
		
5) 		Scanner scanner = new Scanner(System.in);
		System.out.println("entered the width, lenght, and height...");
		double w = scanner.nextDouble();
		double l = scanner.nextDouble();
		double h = scanner.nextDouble();
	
		System.out.println("volume: "+ w*l*h);
		
		
		
6) 		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the mile to convert km ....");
		double mile = scanner.nextDouble();
		System.out.println(mile*1.6 + " km");
		
		
		
7)      Scanner scanner = new Scanner(System.in);
		System.out.println("enter the hours Value..." );
		double h = scanner.nextDouble();
		System.out.println("second: "+ (h*60*60));
	
	
===day03===================>		
8)      //1.way
		int a = 12;
		int b = 5;
		int temp = 0;
		System.out.println("Before the swap a is " + a);
		System.out.println("Before the swap b is " + b);
		
		//assign b to temp
		temp = b;
		//assign a to b
		b = a;
		//assign temp to a
		a = temp;
		System.out.println("After the swap a is " + a);
		System.out.println("After the swap b is " + b);
		System.out.println("=================");
		
		//2.way==> Do not use 3rd container
		int c = 20; // c=15
		int d = 15; // d=20
		System.out.println("before the swap c is " + c);
		System.out.println("before the swap d is " + d);
		
		c=c+d; 
		d=c-d;
		c=c-d;
		System.out.println("after the swap c is " + c);
		System.out.println("after the swap d is " + d);
		
		
		
9)      Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.. ");
		int num = scan.nextInt();
		
		
		int lastDigit=num%10;
		System.out.println("the last digit of the number is "+ lastDigit); //or ("the last digit of the number is "+ num%10);
		System.out.println("===============");
		
		
		
10)     Scanner scanx = new Scanner(System.in);
		System.out.println("Please enter a 3-digit number ");
		int number = scanx.nextInt();
		
		int lastxDigit = 0;
		int midxDigit = 0;
		int firstxDigit = 0;
		int middle = 0;
		
		lastxDigit = number%10;
		firstxDigit = number/100; //256/100=2.56
		middle = number/10;//25.6 ~25
		midxDigit = middle%10;//5
		
		System.out.println(firstxDigit+midxDigit+lastxDigit);
	
		
		
===day04=========================>		
11)     Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("the number is even" );
		}
		if(num % 2 != 0 ) {
			System.out.println("the number is odd");
		}
		
		
		
12)     Scanner scan = new Scanner(System.in);
		System.out.println("Enter another number");
		int num2=scan.nextInt();
		
		if(num2 > 0) {
			System.out.println("the number is +");
		}
		if(num2 < 0) {
			System.out.println("the number is -");
		}
	
		
		
13)     Scanner scan = new Scanner(System.in);
	    System.out.println("enter side of the Rectangle");
	    double side1=scan.nextDouble();
		System.out.println("enter side 2 of the Rectangle");
		double side2=scan.nextDouble();
		
		if(side1<0 || side2<0) {
		      System.err.println("negative values can not represent a legth");
		} 
		if(side1==side2) {
		     System.out.println("Square");
		}
		if(side1!=side2) {
		     System.out.println("Rectangle");
		}
			
				
14)		Scanner scan = new Scanner(System.in);
		System.out.println("enter a side1 of the Rectangle ");
		double side1 = scan.nextDouble();
		System.out.println("enter  side 2 of the Rectangle ");
		double side2 = scan.nextDouble();
		
		if(side1 == side2) {
			System.out.println("Square");
		}else {
			System.out.println("Rectangle");
		}
		

15) 	Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name");
		String day=scan.next(); // OR "String day=scan.next().toLowerCase();"
				
		if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			System.out.println("weekend");	
		}else {
			System.out.println("Weekday");
			}
				
	
				
===day05==============================>					
16) 	Scanner scan=new Scanner(System.in);
		System.out.println("enter a yaer to check if it is a leap year or not");
		int year=scan.nextInt();
						
		if(year%100==0 && year%400==0) {
			System.out.println(year + " is a leap year");
		
		}else if(year%100 !=0 & year%4 ==0) {
			System.out.println(year + " is a leap year");
			
		}else {
			System.out.println(year + " is not leap year");
			
		}
		
	
		
17) 	Scanner scan=new Scanner(System.in);
		System.out.println("enter a 4-digit number");
		int num=scan.nextInt();
		
		num=Math.abs(num);
				
		if(num>999 && num<10000) {
			
			int fDigit = num/1000; // 1234/1000 = 1.234 --> int-->1
			int lDigit = num%10;  // 1234 -->4
			
			System.out.println("the sum is " + (fDigit+lDigit));
				
		}else {
			System.out.println("do you know 4 digit numbers.. Please provide a 4 digit number");
			
		}
				
		

18) 	Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number");
		int num = scan.nextInt();
		
		if(num<0) {
			System.out.println(num + " is negative");
		}
		else if(num>0) {
			System.out.println(num + " is positive");
     	}
		else if(num == 0) {
     		System.out.println(num + " is neutr");
     	}
   
		
		
19) 	Scanner scan = new Scanner(System.in);
		System.out.println("please enter a day name");
		String day = scan.nextLine().toLowerCase();
		
		if(day.equals("sunday") || day.equals("saturday")) {
			System.out.println("weekend");
		}else if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || 
				day.equals("thursday") || day.equals("friday")) {
			System.out.println("week day");
		}else {
			System.out.println("please enter a DAY NAME");
		}

20)		Scanner scan = new Scanner(System.in);
		System.out.println("enter a mark");
		int mark = scan.nextInt();
		
		if(mark<0){  // if(mark<0 || mark>0)
			System.out.println("not valid mark");
		}else if(mark<50) {
			System.out.println("D");
		}else if(mark<60) {
			System.out.println("C");
		}else if(mark<80) {
			System.out.println("B");
		}else if(mark<101) {
			System.out.println("A");
		
		}else{
			System.out.println("Please enter number at most 100");
		}		
		
		
		
21)		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter you age..");
		int age=scan.nextInt();
		System.out.println("please enter your gender..(M==>Male, F==>Female)");
		char gender = scan.next().toUpperCase().charAt(0);
		
		if (age<0) {
			System.out.println("invalid age");
		}else if (!(gender=='M' || gender=='F')) {
			System.out.println("invalid age and invalid gender");
		}else if(gender=='M') {
			if(age>65) {
				System.out.println("retired");
			}else {
				System.out.println("need to work");
			}
		}else if(gender=='F') {
			if(age>60) {
				System.out.println("retired");
			}else {
				System.out.println("need to work");
			}
		}
				scan.close();
				

22) 	Scanner scan = new Scanner(System.in);
		System.out.println("please enter an integer");
		int num = scan.nextInt();
		
		if(num<0) {
			if(num<-9) {
				System.out.println("too small");
			}else {
				System.out.println("small");
			}
		}else if(num>0) {
			if(num>9) {
				System.out.println("too big");
			}else {
				System.out.println("big");
			}
		}else {
			System.out.println("you smart .. please enter + or - number");
		}
		scan.close();
			
			
===day06========================>
23) Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a year...");
	int year = scanner.nextInt();
	
	if(year<0) {
		System.out.println("Year must be positive...");
	}else if(year%100==0) {
		if(year%400==0) {
			System.out.println(year + " is leap year");
		}else {
			System.out.println(year + " is not leap year");
		}
	}else {
		if(year%4==0) {
			System.out.println(year + " is leap year");
		}else {
			System.out.println(year + " is not leap year");
		}
	}
	
	

24) 	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password...");
		char initial = scanner.next().charAt(0);
		
		if(initial>='A' && initial<='Z') {	
			if(initial=='A') {			
				System.out.println("Valid Password");				
			}else {			
				System.out.println("Invalid Password");			
			}			
		}else if(initial>='a' && initial<='z'){			
			if(initial=='z') {			
				System.out.println("Valid Password");			
			}else {			
				System.out.println("Invalid Password");			
			}			
		}else {			
			System.out.println("Use just uppercase or lowercase letters as initial....");	
		}
	
	
25) 	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the month...");
		String m = scanner.next().toLowerCase();
		
			switch(m) {
			case "january":
				System.out.println("1. month");
				break;
			case "february":
				System.out.println("2. month");
				break;
			case "march":
				System.out.println("3. month");
				break;
			case "april":
				System.out.println("4. month");
				break;
			case "may":
				System.out.println("5. month");
				break;
			case "june":
				System.out.println("6. month");
				break;
			case "july":
				System.out.println("7. month");
				break;
			case "august":
				System.out.println("8. month");
				break;
			case "september":
				System.out.println("9. month");
				break;
			case "october":
				System.out.println("10. month");
				break;
			case "november":
				System.out.println("11. month");
				break;
			case "december":
				System.out.println("12. month");
				break;
			default:
				System.out.println("I told you to enter month names, check what did you enter ....");
		}
	

26)		//1.Way: Use if else
		if(a<b) {
			System.out.println("The minimum: " + a);
		}else {
			System.out.println("The minimum: " + b);
		}
		
		//2.Way: Use ternary
		int result = a<b ? a : b;
		System.out.println("The minimum: " + result);
	
		
27)		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
		
		                //Condition     ?     code1                                 :              code2						 ;
		String result = s.length()==2   ?   "It is valid for state abbreviations"   :   "It is not valid for state abbreviations";
		System.out.println(result);
	

28) 	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int a = scanner.nextInt();
		int b = Math.abs(a);

		String result = b>99 && b<1000 ? a + " has 3 digits" : a + " has no 3 digits";
		System.out.println(result);
	
	
	
29)		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		double a = scanner.nextDouble();
		
		String result = a>=0 && a<10 ? "Cube: " + Math.pow(a, 3) : "Square: " + Math.pow(a, 2);
		System.out.println(result);
	
	
30)		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year...");
		int year = scanner.nextInt();

		//String result = (year%100==0 ? (year%400==0 ? "Leap year" : "Not leap year") : (year%4==0 ? "Leap year" : "Not leap year"));
		  String result =  year%100==0 ?  year%400==0 ? "Leap year" : "Not leap year"  : year%4==0  ? "Leap year" : "Not leap year"  ;
		
		System.out.println(result);		
	

31)		 Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age = scanner.nextInt();
		System.out.println("Enter your gender...(M/F)");
		char gender = scanner.next().toUpperCase().charAt(0);
		
		String result = gender == 'M' ? (age>65 ? "Retired" : "Need to work"):(age>60 ? "Retired" : "Need to work");
		System.out.println(result);
	
	
	
==day07==========================>	
32)		Scanner ask =new Scanner(System.in);
		System.out.println("Enter the name of month");
		String month=ask.next().toLowerCase();
		
		switch(month) {
		case "january"  :
		case "february" :
		case "march"    :
			System.out.println("First Quarter");
			break;
		case "april"  :
		case "may"    :
		case "june"   :
			System.out.println("Second Quarter");
			break;
		case "july"      :
		case "augost"    :
		case "september" :
			System.out.println("Third Quarter");
			break;
		case "october" :
		case "november" :
		case "december":
			System.out.println("Fourth Quarter");
			break;
			
			default:
				System.out.println("invalid quarter");
		
		}
	
	
	
33) 	Scanner ask=new Scanner(System.in);
        System.out.println("enter a String ");
        String str7 = ask.nextLine().toLowerCase();
        
        System.out.println(str7.charAt(str7.length()-1));
	
		
		
		
	
*/	
			
	}

}
