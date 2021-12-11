package _QuestinAndSolutions_InTheClass;

public class _DAY08toDAY13___Solutions_InTheClasses {

	public static void main(String[] args) {
		
/*
  
  
===day08===============> 
1)		Scanner ask=new Scanner(System.in);
        System.out.println("enter a String ");
        String str7 = ask.nextLine().toLowerCase();
        
        // length()-1 ==> is used to get last index.
        System.out.println(str7.charAt(str7.length()-1));
 
 
 
===day09===============>
2) 		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s2 = scanner.nextLine();
		
		String first = s2.substring(0, 1);
		String last = s2.substring(s2.length()-1, s2.length());
		System.out.println(first + last);
 
 

3) 		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your SSN");
		String ssn = scanner.next();
		
		String Convertedssn = "*****" + ssn.substring(5); //6789
		
		System.out.println(ssn);//123456789
		System.out.println(ConvertedSsn);//*****6789
 

===day10===============>
4)	//for(Starting ; Condition; Increment or Decrement){ }
		
	for(int i=1 ; i<=10 ; i++) {
		System.out.println("Hello world!");	
	}

 
5)	for(int i = 13; i<16; i++) {
		System.out.print(i + " ");
 	}
 
 
 
6) for(int i = 16; i > 13; i--) {			
			System.out.print(i + " ");
		}
 
 
7)  	//1.Way:
		for(int i = 15; i < 101; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}			
		}
		System.out.println();
		
		//2.Way:
		for(int i=16; i<101; i=i+2) {
			System.out.print(i + " ");
		}
		System.out.println();
  
 
8) for(int i=120; i>64; i--) {
			
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//2.Way:
		// i=i-2 and i-=2 are same
		for(int i=119; i>64; i-=2) {
			System.out.print(i + " ");
		}
  
  
  
9)  	//1.Way:
		for(int i=13; i<131; i++) {
			
			if(i%4==0 && i%6==0) {
				System.out.print(i + " ");//24 36 48 60 72 84 96 108 120
			}
		}
		System.out.println();
		
		//2.Way: 
		for(int i=24; i<131; i+=12) {
			System.out.print(i + " ");
		}
		System.out.println();
		
  
10) 	String name = "United States of America - Xweshe";
		for(int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i) + " ");
		}
  
  
  
11)  	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine(); 	


		//1.Way:
		for(int i=0; i<s.length(); i++) {			
			if(i%2==0) {
				System.out.print(s.charAt(i) + " ");
			}			
		}
		System.out.println();
		
		//2.Way:
		for(int i=0; i < s.length();i+=2) {
			System.out.print(s.charAt(i) + " ");
		}
  
  
12) 	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
						
		for(int i=0; i<s.length(); i++) {
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				System.out.print(s.charAt(i));	
			}		
		}
  
  
13) 	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
		
		for(int i=0; i<s.length(); i++) {
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				System.out.print(s.charAt(i));	
			}		
		}
  
  
14) 	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
		
		String reversed = "";
		
		//Reverse String s

		for(int i=s.length()-1; i>=0;i--) {
			reversed = reversed + s.charAt(i);			
		}
		if(s.equalsIgnoreCase(reversed)) {
			System.out.println(s + " is palindrome");
		}else {
			System.out.println(s + " is not palindrome");
		}


==day11==============>  
15)  		int sum = 0;
	        for(int i = 1 ; i<5 ; i++) {
	             sum = sum +i;
	        System.out.println("the sum is " + sum); // gives you the sum for every loop
	        }
	        System.out.println("the sum is finally: " + sum); // gives the final sum
  
  
16)  			Scanner scan = new Scanner(System.in);
	            System.out.println("Enter a start value");
	            int x = scan.nextInt();
	            System.out.println("Enter an End value ");
	            int y = scan.nextInt();
	            
	            int s = 0;
	            if(x>y) {
	                System.out.println("Invalid Start value...");
	            }else {
	                for(int i = x;  i<=y ; i++ ) {
	                    s = s+i;
	                    System.out.println("each loop: "+s);
	            }
	                System.out.println("the sum is " +s);
	            }       
	          
  
17)  	int product = 1;
		for(int i=1; i<4 ; i++) {
			product = product*i;
			//System.out.println("each loop: " +product);
		}
		System.out.println(product);
  
  
18)	 	Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
		int num = scan.nextInt();
		
		int a = 1;
		
		if(num<0) {
			System.err.println("Invalid value for factorial");
			//System.out.println("Invalid value for factorial");
		}else {
			for(int i = num; i>0; i--) {
				a = a*i;
		}
		System.out.println( num+ "!  =" + a);
		} 
  
  
  
19)		Scanner scan = new Scanner(System.in);
        System.out.println("enter the # of rows");
        int row = scan.nextInt();
        System.out.println("enter the # of columns");
        int col = scan.nextInt();
        
        for(int i = 1; i<row+1; i++) { // or (i<=row)
            for(int j = 1; j<=col; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
  
  
20)     Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the perpendicular side");
        int side = scan.nextInt();
        
        for(int i = 1 ; i< side+1; i++) {
            for(int j = 1; j<i+1; j++) {
                System.out.print("* ");  // this line uses print(), not println()
            }
            System.out.println();
        } 
  
  
==day12==============>  
21) 	Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		
		int i=1;
		while(i<11) {
			System.out.println(num + "x" + i + "=" + num*i);
			i++;
		}
 
 
22)		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to find sum of the digits.");
		int num=Math.abs(scan.nextInt());// if user type (-) minus number like -123. it make positive number.
		
		int sum=0;
		while(num!=0) { 
			// 1) num will not be zero mean while codition is true and loop continue,
			// 2) if num is be zero mean while condition is false and loop is broke.
			
			    sum = sum + num%10;
			num = num/10;	
		}
		System.out.println("the sum of digits: " + sum);
		
		/*
		 Explain: sum=sum+num%10;
		 		  num=num/10;
		 		  
		 		  123%10=3;
		 		  123/10=12.3 ==> int(123/10)=12;
		 		  
		 		  12%10=2;
		 		  12/10=1.2 ==> int(12/10)=1;
		 		  
		 		  1%10=1;
		 		  int(1/10)=0;
	 
 
23)		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number...");
		int num=Math.abs(scan.nextInt());
				
		//Factors of 12 = (i=1) 1, 2, 3, 4, 6, 12
		//for exmample user type=12   
				
		int i=1;
		int count = 0;//flag
		while(i<=num) {    // (i<12)     i<12... true  
			if(num%i==0) { //(12%i==0)   12%2==0.. true
				count++;
				System.out.print(i + "  "); // if true and print it
			  }
		   i++; // i=1 and now i++ mean i will change number and new i is 2 and repeat loop
		}
		System.out.println();
		System.out.println("the number of positive factors " + count );
  


24) 	Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		do {
			System.out.println("Enter an integer...");
			n = scanner.nextInt();
			  if(n<100) {
				  System.out.println("Won!");
			}
		}while(n<100);
		
		System.out.println("Lost!...");
 
 
 
==day13==============> 
25) 	String str = "1234_?!abcdef";
        
        int digitCount = 0;
        int letterCount = 0;
        int otherCount = 0;
        
        int i = 0; 
        do {
            if(str.charAt(i)>='a'   &&   str.charAt(i)<='z') {
                letterCount++;
            }else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                digitCount++;
            }else {
                otherCount++;
            }
            i++;
        }while(i<str.length());
        
        System.out.println("The # of letter is  "+letterCount);
        System.out.println("The # of digits is " + digitCount);
        System.out.println("The # of other is " +otherCount);
 
 

26) 	Scanner scan = new Scanner(System.in);
        
        int num = 0;
        do{
            System.out.println("Enter a number to play my game");
            num = scan.nextInt();
        }while(num%2!=0);
        System.out.println("You Won :)");
        
        scan.close();
 
 
27) 	Scanner scan = new Scanner(System.in);
        
        char initial = '*';
        do {
            System.out.println("Enter your First name please");
            initial = scan.next().charAt(0);
            if(initial>='a' && initial <= 'z') {
                System.out.println("Make the initial upper case");
            }
        }while(initial>='a' && initial <= 'z');
        System.out.println("Finally!!! You did it right :) ");
        
 
28)		Scanner scan =new Scanner(System.in);
		
		String passw="";
		do {
			System.out.println("enter a password");
			passw=scan.nextLine();
			if(passw.length()<=6) {
				System.out.println("this is not i want..invalid password. it should be more than 6 ch");
			}
		}while(passw.length()<=6);
		System.out.println("valid password, thnx");
 
 
29) 	Scanner scan = new Scanner(System.in);
        
        int num= 0;
        do {
            System.out.println("Enter an integer");
             num = scan.nextInt();
            if(num%5==0) {
                System.out.println("YAYYY You WON");
            }else {
                System.out.println("You LOST!!! :(");
            }
            System.out.println("To end the game pres NO (N) to continue press any key");
            char answer = scan.next().toUpperCase().charAt(0);
            if(answer=='N') {
                break;
            }
        }while(true);
        System.out.println("Thank you");


30) 	Scanner scan = new Scanner(System.in);
                
        do {
            System.out.println("Enter an Integer");
            int num = scan.nextInt();
            if(num==10) {
                break;
            }else {
                System.out.println(num +" ");
            }
        }while(true);
        System.out.println("you stopped the loop by BREAK");


 
 */
		
		
	}

}
