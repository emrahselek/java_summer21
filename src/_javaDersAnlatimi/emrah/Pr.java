package _javaDersAnlatimi.emrah;

public class Pr {

    public static void main(String[] args) {

        // Fibonacci number is a sequence of whole number where every number is the sum of previous two numbers.
        // Formula is "Fn = Fn-1 + Fn-2"   ->    0.1.1.2.3.5.8.13........

        // give me first 7 fibonacci numbers  -> 0.1.1.2.3.5.8
        int range = 7;

        int fibo1 = 0;
        int fibo2 = 1;
        int fiboN;

        System.out.print(fibo1+" ");
        System.out.print(fibo2+" ");

        for(int i=1; i<range-1; i++){
            fiboN = fibo1 + fibo2;
            fibo1=fibo2;
            fibo2=fiboN;
            System.out.print(fiboN+" ");
        }







    }


}
