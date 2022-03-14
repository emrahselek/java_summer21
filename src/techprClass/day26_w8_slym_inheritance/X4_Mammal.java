package techprClass.day26_w8_slym_inheritance;

public class X4_Mammal extends X1_Animal {
	
	String name="Mammal";
	int height=22;
	byte ageOfMammal=2;
	
	
	public X4_Mammal(int height) {
		super();
		
		System.out.println(height + "cm.");
	}
	
	public void move() {
		System.out.println("Mammals move...");
	}
	
	public void feed() {
		System.out.println("Mammals feed their babies with milk...");
	}

}
