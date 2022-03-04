package _javaDersAnlatimi.emrah;

public class Pr {
    public static void main(String[] args){

        fibonacci();

    }

    public static void fibonacci(){
        int number =6; //how many fibonacci number you want to see.

        int fib1=1;
        int fib2=1;
        int fibResult=0; // 1 1 2 3 5 8 13 ....
        System.out.print(fib1 + " ");
        System.out.print(fib2 + " ");

        for(int i=1; i<number-1; i++){
            fibResult = fib1 +fib2;
            fib1=fib2;
            fib2=fibResult;
            System.out.print(fibResult + " ");
        }

    }

}
