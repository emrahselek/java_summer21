package _oops.Polymorphism.Overriding;

public class Toyota extends Car {

    @Override
    public void move(){
        System.out.println("Toyota moves carefully");
    }

    @Override
    public void gasoline(){
        System.out.println("Toyota uses less gasoline");
    }

    public void color(){
        System.out.println("Toyota has various colors");
    }

}
