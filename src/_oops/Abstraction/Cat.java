package _oops.Abstraction;

public class Cat extends Animal{


    @Override
    public void talk() {
        System.out.println("Cat meyaw");
    }

    @Override
    public void walk() {
        System.out.println("walks as a cat");
    }
}
