package day15_w4_slym_constructors;



public class X2_AnimalRunner {

	public static void main(String[] args) {
		
		X1_Animal a01 = new X1_Animal("Puppy"); // "new X1_Animal" After Animal typing ctrl+spacebar ==> popup all Constructors
				
		System.out.println(a01.age);//5
		System.out.println(a01.name);//Bobby
		System.out.println(a01.specy);//Puppy
		System.out.println(a01.gender);//M
		System.out.println(a01.isCarnivorous);//false
		
		System.out.println(X1_Animal.counter);//2
		

	}

}