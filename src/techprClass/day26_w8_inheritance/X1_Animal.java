package techprClass.day26_w8_inheritance;

public class X1_Animal {
	
	String name="Animal";
	int height=33;
	byte ageOfAnimal=3;
	
	
	public X1_Animal() {
		System.out.println("parent constructor ran");
	}
	
	public X1_Animal(String name) {
		System.out.println("Parent constructor with parametrs ran...");
	}
	
	public void move() {
		System.out.println("Animals move...");
	}
	
	public void eat() {
		System.out.println("Animals eat...");
	}
	
	

	
	
}
