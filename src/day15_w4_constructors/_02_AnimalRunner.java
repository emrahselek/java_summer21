package day15_w4_constructors;



public class _02_AnimalRunner {

	public static void main(String[] args) {
		
		_01_Animal a01 = new _01_Animal("Puppy"); // "new X1_Animal" After Animal typing ctrl+spacebar ==> popup all Constructors
				
		System.out.println(a01.age);//5
		System.out.println(a01.name);//Bobby
		System.out.println(a01.specy);//Puppy
		System.out.println(a01.gender);//M
		System.out.println(a01.isCarnivorous);//false
		
		System.out.println(_01_Animal.counter);//2
		

	}

}