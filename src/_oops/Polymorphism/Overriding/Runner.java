package _oops.Polymorphism.Overriding;

public class Runner {

    public static void main(String[] args) {
        Toyota car1 = new Toyota();
        car1.move();
        car1.gasoline();
        car1.color();

        Honda car2 = new Honda();
        car2.move();
        car2.gasoline();

    }
}
