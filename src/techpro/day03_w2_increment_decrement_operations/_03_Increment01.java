package techpro.day03_w2_increment_decrement_operations;

public class _03_Increment01 {
	
	public static void main(String[] args) {
				
		//How to increase the value by addition "+"
		int age=20;
		//1.way
		age = age + 5;
		//2.way
		age += 6; // age = age + 6
		//3.way -->increasing by only 1
		age ++;
		
		//has three way for +		
		int a=10;
		a=a+5;
		a+=10;
		a++;
		System.out.println(a);
			
		// how to increase the value of a variable by multiplication "*"
		int salary=1000;
		//1.way
		salary=salary*2;
		System.out.println("new salary value is "+ salary);
		//2.way
		salary*=3;
		System.out.println("new salary..."+salary);
		
	}

}
