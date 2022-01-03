package _oops.Abstraction;

public class Dog extends Animal {


    @Override
    public void talk() {
        System.out.println("Dog haw haw");
    }

    @Override
    public void walk() {
        System.out.println("walks as a dog");
    }
}
