package emrah_study;

import java.util.Scanner;

public class _Day05_Fibonacci {
    // Fibonacci's numbers are a sequence of whole numbers where every number is
    // the sum of the previous two numbers. It starts from 0 and 1 as the first two numbers.
    // The Formula of Fibonacci Number is "Fn = Fn-1 + Fn-2"

    public static void main(String[] args){

        int range = 7;// 0.1.1.2.3.5.8

        int fibo1=0;
        int fibo2=1;
        int fiboN;
        System.out.print(fibo1+" ");
        System.out.print(fibo2+" ");

        for (int i=1; i<range-1; i++){
            // Fn = Fn-1 + Fn-2
            fiboN = fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fiboN;
            System.out.print(fiboN+" ");
        }
    }
}

class Fibonacci_Method {

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

