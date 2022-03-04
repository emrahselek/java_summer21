package techpro.day01_w1_variables;

public class Lesson02_Operators {
	public static void main(String[]args) {	

/**
		
//-------------------------(SWAPPING a AND b)-----------------------------------\\
				
IMPORTANT SKILL : 	
int a = 5, b = 10;

a = a + b;			//or			int temp = a;
b = a - b;							a = b;
a = a - b;							b = temp;



//---------------------------Order Of Operations-----------------------------------\\
		 1- ()
		 2- Exponents
		 3- do multipilication and division from left to right
		 4- do addition and subtsrcation from left to right
*/		
			System.out.println(8+2*(14-6/2)-12);
		
/**

//-----------------------------Increment Operators-------------------------------------\\

* ++ is only available on primitive data types except boolean.
* u cannot add ++ or -- signs on constants  or on final variables such as 
int x = ++ (++x); or final x = ++x; or int y = ++10;

x++;--> This is a post increment
y--;--> Post decrement 
--a;--> Pre decrement
++b;--> Pre increment

*****NOTE: x++ and x += 1 are different than x = x + 1.  x++ and x +=1  (type of x)(x + 1) so they are implicitly type-casting but the other one likely to be int type. 

*****NOTE: 	int x = 4;    ---> this is a special case where u reassign with 							post decrement/increment value wont change
x = x++;
System.out.println(x); -- >OUTPUTS 4

//------------------------------Arithmetic Operators-----------------------------------\\

* When u use any of arithmetic operator like +,-,%,*,/  

EX:	byte x = 10
byte y = 20

byte c = x + y -->this will be equal to int type why?? 

Because max(int,type of x, type of y) or u would have to do EXPLICIT TYPE CASTING WHICH COULD CAUSE LOSS OF INFO. Like byte z = (byte) (x+c);

* don't forget max(int, type of x, type of y). Valid for +,-,%,*,/

* byte + long  = long				* short + short = int
* byte + byte  = int				* int + float   = float
* byte + short = int				* long + double = double
* float + long = float				* char + char   = int
* double + char = double			* double + float = double

//---------------------------Shorthand(Compound) Operators-----------------------------\\

* x+=5 --> x = x + 5 				* x-=5 --> x = x - 5
* x*=5 --> x = x * 5				* x/=5 --> x = x / 5
* x%=5 --> x = x % 5				* x&=5 --> x = x & 5
* x|=5 --> x = x | 5				* x^=5 --> x = x ^ 5


* x>>=5 --> x = x >> 5 (right shift)
* x<<=5 --> x = x << 5  (left shift)
* >>> -----> unsigned right shift ---fills with zero
* >> ----> signed right shift ---> fills with sign bit
* << ----> signed left shift ---> fills with sign bit

* Order of Operators : ++ or -- then ! then *,/,%,+,- then >,<,>=,<= ...

//--------------------------Comparison Operators---------------------------------------\\

* =  --> Assign
* == --> equal to --->applicable on every type of primitive
* != --> not equal to --> applicable on every type of primitive
* > , < , >= ,<=  --> applicable to every type of primitive except boolean

//-----------------------------BitWise Operators---------------------------------------\\

* & -->both conditions must be true--> is applicable on Boolean and integral operators
* | ---> at least one must be true --> is applicable on Boolean and integral operators

* ^ --> Xor ----> it is true when both the operands are different(like true and false). it is also applicable on integral types as well

* ~ ---> negation --> only applicable for integral types

//---------------------Logical Operators - Short-Circuit Operators---------------------\\

* &&-->Logical and -->returns true if both conditions are true(Only on Booleans)
* ||--> Logical or --> returns true if one of conditions true(Only on Booleans)
* ! --> Logical NOT --> only applicable for Boolean

******Difference between &,| and &&,||;

* & -- > requires both statements to be checked
* &&--->if the first one is false does not evaluate the second one(faster)
* | --->requires both statements to be checked
* ||---> if the first one is true does not evaluate the second one(faster)
								
//-----------------Syntax for instanceOf;----------------------------------------------\\
* Syntax:

a instanceOf b --> a instanceof b True if the reference that a points to is an instance of a class, subclass, or class that implements a particular interface, as named in b

EX: Thread f = new Thread();

System.out.println(f instanceOf Thread);--->true
System.out.println(f instanceOf Object);--->true
System.out.println(f instanceOf Runnable);-->true

//---------------------------------NOTES-----------------------------------------------\\
1)		
* In float and double wrapper classes infinity is defined
* In float and double wrapper classes undefined defined as NaN

System.out.println(10/0);  ----->  Runtime exception
System.out.println(10/0.0);  -----> Infinity 
System.out.println(-10/0.0);  -----> -Infinity 
System.out.println(0/0);       ----->  Runtime exception
System.out.println(0.0/0);       ----->  NaN (not a number)		
2)
* If at least there is one string in the expression then + will concat but if they are both numbers then it will add.Precedent is important but if they are all the same solve it from left to right

* System.out.println(10<20<30) ---> throws an CE because true < 30(not comparable)
* System.out.println(true<false) -->  same as above
* System.out.println("hey" < "ju")  ---> same as above
* System.out.println('a' == 97.0) --> true
* System.out.println(false==false) --> true
* System.out.println("hey" == "hey") --> true
3)
* int a,b,c,d;
a=b=c=d=20; ---> chained assignment
int a=b=20 ----> cannot do this

//---------------------------------BINARY NOTES and examples---------------------------\\

* Binary addition: 1+1 = 0 and carry one
1+1+1 = 1 and carry one
* Binary Division:
17/2->1
8/2 ->0
4/2 ->0
2/2 ->0
1   ->1    so is 10001 == 17
* Write 5 in binary: 101 ....write 6 in binary :110

* int x = 'A'; ----> 1000001 which is 32 bits.0000000.......1000001

* 1's complement the most significant bit represents sign of the no(either - or +) if it is 1 then sign is '-' if it is 0 then sign is '+'

* In java the negative numbers are stored in 2's complement form, the acquired result we have to convert into 2's complement( first perform 1's complement and just add 1 to 1's complement).

* System.out.println(~4); return -5  ---->  4 == 0000000...100. ~4 = 1111111.....011. so it is a negative number. add +1 to the second complement which is 101 == -5

* System.out.println(~5); return -6  ---->  5 == 0000000...101 find ~5 which is negative then find second complement then +1 which is 110 == -6
						
* System.out.println(~-4); return 3  ---->  4 == 100 then -4 == 11111.....100 then negation becomes positive number 011 which is 3.

* System.out.println(~-7); return 6  ---->  7 == 111 then -7 == 11111.....001 then negation becomes positive number 110 which is 6.

* System.out.println(~-17); return 16  ---->  17 == 10001 then -17 == 11111.....01111 then negation == 00000.....10000 which is 2^4 == 16 (in this process make sure u flip until the most right 1)

* We can apply bitwise operators to integral types - byte, short, int, long, char

0 -> represent false and 1 -> represent true. that's the logic here

& --> 0 and 0 is 0, 1 and 1 is 1, 0 and 1 is 0
| --> 0 and 0 is 0, 1 and 1 is 1, 0 and 1 is 1
^ --> 0 and 0 is 0, 1 and 1 is 0, 0 and 1 is 1


System.out.println(4 & 5); ---> returns 4 ---------> 100         
								  101
								result will be 100

System.out.println(4 | 5); ---> returns 5 ---------> 100          
								  101
								result will be 101 

System.out.println(4 ^ 5); ---> returns 1  ---------> 100          
								   101
								result will be 001
								
//-----------------------------Type-Cast Operators------------------------------------\\

* byte--->short--->int --->long -->float -->double
/
char ----> /

1)Implicit typeCasting:

* Compiler is responsible for converting from smaller to higher types(done internally)
* Automatic promotion.This is also called widening or up-casting
* NO LOSS OF INFO

* Ex: 
int b = 10;
double d = b;
System.out.println(d); --> 10.0

int x = 'a';
System.out.println(x); --> 97


2) Explicit TypeCASTING:

* Programmer is responsible for converting from higher to smaller types(done externally)
* This is also called narrowing or down-casting
* YES to LOSS OF INFO
* if you are doing explicit type casting from floating points to integral types then after decimal values will be gone. 

Ex:
double d = 150.522;
int x = (int) d; ----> 150
byte s = (byte) d; ---> -106

Ex: 
int x = 150;
short s = (short) x;---> 150
byte b = (byte) x;---> -106

First off; 150 is equal to 10010110 and it is 32 bits --> 00000.....10010110

short s = (short) x; -->since short is 16 bits; so it will take the 16 bits starting from right so 000..10010110 which is the same and outputs 150.(value is there directly)

byte b = (byte) x; -->since byte is 8 bits; so it take the 8 bits starting from right..so 10010110. here the first bit from the left represent the sign which is a negative so rest is 0010110. find the second complement(negation) == 1101001 add 1 == 1101010 calculate it ==64+32+8+2 =-106

*/


System.out.println("------------Increment/Decrement Operators-----------------");

//NOTE: when you do shorthand operator like print += 2+3; first java calculates 2+3 before even print takes into picture

String print ="";
print += 2+'a';//try with ""+ 2 + 'a';
System.out.println(print + 2);

int xx = 10, yy = 5, a = 9, b = 0;
char z = 'w';
int zz = 'w';

xx++; --yy;	yy++; yy++;	--a;++b;z++;zz++;

System.out.println(xx+".."+yy+".."+a+".."+b+".."+yy++ +".."+ yy + ".."+ ++z +".."+ ++zz);

System.out.println("------------------ TypeCasting-------------------------"); 

char ch = 6;
double heyhey = ch + 5;

byte aya = (byte) -200;
byte ay = (byte) 182;
byte bb = (byte) 140.21245;

System.out.println(heyhey + "..." + aya + "..."+ ay + "..." + bb );

System.out.println("---------------~negation~----------------------------------");

System.out.println(~16 + "..." + ~-6 + "..." + ~-14);

System.out.println("------------------ General--------------------------"); 

int aa,bbb,ccc,dd;
aa=bbb=ccc=dd=20;
aa += bbb-= ccc*= dd/=2;
System.out.println(aa +".." +bbb+ "..." + ccc+"..." + dd+"..."); 


String m = "durga";
int vv= 1, vvv = 2, vvvv = 3;
System.out.println(vv+m+vvv+vvvv);
System.out.println(vv+vvvv+vvv+m);	


System.out.println("------------ Bitwise && Logical Operators------------------");

boolean xxx = false;
boolean yyy = true;
System.out.println(xxx ^ yyy);

boolean xz = false;
boolean yz = true;
System.out.println(!!!xz == !!yz);

int g = 10;

if(++g < 10 && (g/0) > 10)   //try with & also
System.out.println("Hello");
else
System.out.println("Hi");
int x1 =10;
int y1 = 15;

if(++x1 < 10 && ++y1 > 15)//use it & && | || separately
x1++;
else
y1++;
System.out.println(x1 + "...." + y1);
}
}