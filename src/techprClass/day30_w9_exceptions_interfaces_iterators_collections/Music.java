package techprClass.day30_w9_exceptions_interfaces_iterators_collections;

public interface Music {
	
	String system = "Surround";
	int price = 2000;
	
	void sound();
	void tune();
	void eat();
	
	static void volume() {
		System.out.println("Do not listen to the music with high volume...");
	}

}
