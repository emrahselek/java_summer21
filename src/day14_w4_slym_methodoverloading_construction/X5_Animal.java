package day14_w4_slym_methodoverloading_construction;


public class X5_Animal {
	
	String name;
	int age;
	String specy;
	
	static int counter = 0; 
	
	public X5_Animal() {
		counter++;
	}
	
	public X5_Animal(String name, int age, String specy) {
		this.name = name;
		this.age = age;
		this.specy = specy;
		counter++;
	}
	
	public X5_Animal(int age, String specy) {
		this.age = age;
		this.specy = specy;
		counter++;
	}

}