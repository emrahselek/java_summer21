package emrah_study;
import java.util.Scanner;

public class _19_EvenAndOdd {
    /**
    Write a method which can identifies given number is even or odd.
    */

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number for checking Even or Odd");
        int num = sc1.nextInt();
        System.out.println("Number: " + num);

        if (num % 2 == 0) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Number is ODD");
        }
        sc1.close();
    }
}