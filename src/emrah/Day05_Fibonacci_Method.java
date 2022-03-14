package emrah;

import java.util.Scanner;

public class Day05_Fibonacci_Method {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int range = scan.nextInt();
        fibonacci(range);
        scan.close();
    }

    public static void fibonacci(int range) {
        int fibo1 = 0;
        int fibo2 = 1;
        int fiboN;
        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i = 1; i < range-1; i++) {
            fiboN = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fiboN;
            System.out.print(fiboN + " ");
        }

    }

}
