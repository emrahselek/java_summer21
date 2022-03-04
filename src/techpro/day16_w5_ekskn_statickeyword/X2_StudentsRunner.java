package techpro.day16_w5_ekskn_statickeyword;

import java.util.Scanner;

public class X2_StudentsRunner {
	
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("Please enter your first name");
        String firstName = scanner.next();
        System.out.println("Please enter your last name");
        String lastName = scanner.next();
        String name = firstName+" "+lastName;
        System.out.println("Please enter your grade");
        int grade = scanner.nextInt();
        System.out.println("Please enter your year");
        int year = scanner.nextInt();
        
        
        
        
        
        X1_Students student1 = new X1_Students(name,grade,year);
        //we commented out this method to call it from constructor. it will make our code more clear
        
        //student1.setId();
        System.out.println("student1 id :"+X1_Students.id);
        System.out.println("student1 name: "+student1.name);
        System.out.println("student1 grade: "+student1.grade);
        System.out.println("student1 year: "+student1.year);
        
        //Students student2 = new Students("name",grade,year);
        //student2.setId();
        //System.out.println("student2 id :"+student2.id);
        
        System.out.println("to quit press Q, to go on press any key");
        String quit= scanner.next().toUpperCase();
        if (quit.equals("Q")) {
            break;
        }
        
        }while(true);
        
        System.out.println("Thanks for choosing us! See you later!");
        
        
        
    }
}