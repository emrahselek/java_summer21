package emrah_study;

import java.util.Scanner;

public class _10_SwapTwoNumbers {
    public static void main(String[] args) {
        // write a java program to swap two numbers

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();

        System.out.println("Before swapping: " + n1 + "  -   " + n2);

        double temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping: " + n1 + "   -   " + n2);


        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println(" "+n1+"   -   "+n2);

    }
}