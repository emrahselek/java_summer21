package _oops.Polymorphism.Overloading;

public class Overloading {

    public static void main(String[] args) {

        interview("Joe");
        interview("Joe","Man");

    }

    public static void interview(String firstName){
        System.out.println(firstName);
    }

    public static void interview(String firstName, String lastName){
        System.out.println(firstName+" "+lastName);
    }

}
