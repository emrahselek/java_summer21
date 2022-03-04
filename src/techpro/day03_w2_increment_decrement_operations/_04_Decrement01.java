package techpro.day03_w2_increment_decrement_operations;

public class _04_Decrement01 {

	public static void main(String[] args) {
		
		//how to decrease the value of variable by subtraction "-"
		int num=100;
		//1.way
		num = num-5;
		//2.way
		num -=5;
		//3.way --> works to decrease the value by one
		num--;
		
		//how to decrease the value of variable by division "/"
		int salary = 5000;
		//1.way
		salary=salary/5;
		System.out.println(salary);
		//2.way
		salary/=2;
		System.out.println("final salary is " + salary);
		
		/*Q: 1) Decrease Ali's salary 20% then increase it by 100 dollars.
		     2) Increase veli's salary 100 then decrease it by 20%.
		     3) Then compare their salaries?
		*/
		int aliSalary=600;
		int veliSalary=500;
		
		aliSalary *= (int)(aliSalary*0.8);
		aliSalary+=100;
		System.out.println("Final Ali's Salary is " + aliSalary);
		
		veliSalary+=100;
		veliSalary=(int)(veliSalary*0.8);
		System.out.println("final veli salary is "+ veliSalary);
		
	}

}
