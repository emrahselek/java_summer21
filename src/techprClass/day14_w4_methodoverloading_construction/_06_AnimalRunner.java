package techprClass.day14_w4_methodoverloading_construction;

public class _06_AnimalRunner {

	public static void main(String[] args) {
		
	    _05_Animal a01 = new _05_Animal();
		
		_05_Animal a02 = new _05_Animal("Bobby", 7, "Bulldog");
		
		_05_Animal a03 = new _05_Animal(3, "Puppy");
		
		//If you want to look at the value of a class variable
		//from another class, use class name first then use 
		//variable name by putting "." between them.
		//Like Animal.counter
		System.out.println(_05_Animal.counter);//3
	}

}