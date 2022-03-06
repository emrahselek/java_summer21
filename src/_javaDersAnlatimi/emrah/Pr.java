package _javaDersAnlatimi.emrah;

import _PreInterviewOnlineClass.pr.OzClass;

public class Pr {
    public static void main(String[] args){


        //I want to see first 6 fibonacci numbers.
        int number = 6;

        int fib1=1;
        int fib2=1;
        int fibresult;

        for(int i=1; i<number-1; i++){
            fibresult=fib1+fib2;
            fib1=fib2;
            fib2=fibresult;
            System.out.println(fibresult+" ");
        }


    }

}
