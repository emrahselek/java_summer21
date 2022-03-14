package javaDersAnlatimi.suleymanInterview;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 10;
        primeNumber(number);

    }
    public static void primeNumber (int number){
        int count = 0;
        if(number > 0 ){
            if (number == 1){
                System.out.println(number + " is prime number");
            }else {
                for (int i = 2; i < number; i++) {
                    if (number % i ==0){
                        count++;
                    }
                }
            }
            if (count==0){
                System.out.println(number + " is prime");
            }else {
                System.out.println(number + " is not prime");
            }
        }else  {
            System.out.println("enter a positive integer");
        }
    }
}
