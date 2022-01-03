package _oops.Polymorphism.Overriding;

public class Car extends Vehicle {
    public void move(){
        System.out.println("Cars move");
    }
    public void gasoline(){
        System.out.println("Cars use gasoline");
    }

    @Override
    public void haveEngine() {
        System.out.println("Cars have small engine");
    }
}
