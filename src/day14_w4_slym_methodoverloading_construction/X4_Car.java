package day14_w4_slym_methodoverloading_construction;


public class X4_Car {
	
	String make;
	int price;
	int year; 
	String model;
	String color;
	static int soldCarCounter = 0;

	public static void main(String[] args) {
		
		//ClassName   ObjectName = new Constructor
		    X4_Car         car01    = new X4_Car("Audi", 20000, 2017, "Q5", "Black");
		    System.out.println(car01.make);
		    System.out.println(car01.price);
		    System.out.println(car01.year);
		    System.out.println(car01.model);
		    System.out.println(car01.color);
		    
		    X4_Car         car02    = new X4_Car("Honda", 15000, 2019, "CRV", "Red");
		    System.out.println(car02.make);
		    System.out.println(car02.price);
		    System.out.println(car02.year);
		    System.out.println(car02.model);
		    System.out.println(car02.color);
		    
		    X4_Car         car03    = new X4_Car("Lexus", 22000, 2020, "RC2000");
		    System.out.println(car03.make);
		    System.out.println(car03.price);
		    System.out.println(car03.year);
		    System.out.println(car03.model);
		    
		    X4_Car         car04    = new X4_Car(22000, 2020);
		    System.out.println(car04.price);
		    System.out.println(car04.year);
		    
		    X4_Car         car05    = new X4_Car();
		    System.out.println(car05.make);//default value ==> null
		    System.out.println(car05.price);//default value ==> 0
		    System.out.println(car05.year);//default value ==> 0
		    System.out.println(car05.model);//default value ==> null
		    System.out.println(car05.color);//default value ==> null
		     
		    System.out.println(soldCarCounter);//5
		    //When you want to look at the value of a class variable no need to use objects.
		    System.out.println(car01.soldCarCounter);//5
		    System.out.println(car02.soldCarCounter);//5
		    System.out.println(car03.soldCarCounter);//5
		    
	}
	
	public X4_Car(String make, int price, int year, String model, String color) {		
		this.make = make;		
		this.price = price;		
		this.year = year;		
		this.model = model;		
		this.color = color;		
		soldCarCounter++;		
	}
	
	public X4_Car(String make, int price, int year, String model){
		
		this.make = make;
		this.price = price;	
		this.year = year;
		this.model = model;	
		soldCarCounter++;
		
	}
	
	public X4_Car(int price, int year){

		this.price = price;	
		this.year = year;
		soldCarCounter++;
		
	}
	
	public X4_Car(){
		
		soldCarCounter++;	
		
	}
}