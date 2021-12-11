package day14_w4_slym_methodoverloading_construction;

public class X6_AnimalRunner {

	public static void main(String[] args) {
		
	    X5_Animal a01 = new X5_Animal();
		
		X5_Animal a02 = new X5_Animal("Bobby", 7, "Bulldog");
		
		X5_Animal a03 = new X5_Animal(3, "Puppy");
		
		//If you want to look at the value of a class variable
		//from another class, use class name first then use 
		//variable name by putting "." between them.
		//Like Animal.counter
		System.out.println(X5_Animal.counter);//3
	}

}