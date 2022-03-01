package day14_w4_methodoverloading_construction;


public class _05_Animal {
	
	String name;
	int age;
	String specy;
	
	static int counter = 0; 
	
	public _05_Animal() {
		counter++;
	}
	
	public _05_Animal(String name, int age, String specy) {
		this.name = name;
		this.age = age;
		this.specy = specy;
		counter++;
	}
	
	public _05_Animal(int age, String specy) {
		this.age = age;
		this.specy = specy;
		counter++;
	}

}