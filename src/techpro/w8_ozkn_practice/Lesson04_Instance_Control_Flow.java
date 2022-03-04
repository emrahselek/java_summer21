package techpro.w8_ozkn_practice;


public class Lesson04_Instance_Control_Flow extends Baba {
		
	int i  = 100;
		{
			m2();
			System.out.println("Child First instance block");
		}
	Lesson04_Instance_Control_Flow(){
			System.out.println("Child Constructor");
		}
	public static void main(String[] args) {
			Lesson04_Instance_Control_Flow t = new Lesson04_Instance_Control_Flow();
			//if this object creation was not here then the output would be only "Child main"
			System.out.println("Child main");
			
			//now If I add another object here. then it will repeat the instance control flow 
			//Lesson04_Instance_Control_Flow tt = new Lesson04_Instance_Control_Flow();
		}
	public void m2() {
			System.out.println(y);
		}
		{
			System.out.println("Child Second instance block");
		}
	int y = 20;
}

class Baba{
	int i  = 10;
	{
		m1();
		System.out.println("Baba first instance block");
	}
	Baba(){
		System.out.println("Baba Constructor");
	}
	public static void main(String[] args) {
		Baba t = new Baba(); //if this object creation was not here then the output would be only "Baba main"
		System.out.println("Baba main");
		//now If I add another object here. then it will repeat the instance control flow 
		//Baba tt = new Baba();
	}
	public void m1() {
		System.out.println(j);
	}
	{
		System.out.println("Baba second instance block");
	}
	int j = 20;
	{
		System.out.println(j);
	}
}

