package techprClass.day30_w9_exceptions_interfaces_iterators_collections;

public interface Engine {
	
	int price = 8000;
	String name = "Eco";
	
	void gasUsage();
	
	void speedLimit();
	
	void eat();
	
	default void accelerate() {
		System.out.println("Accelerate quickly...");
	}

}
