package _javaDersAnlatimi.suleymanInterview;

public class PrimeOrNot {
    public static void main(String[] args) {
        int number = 4;
        int count = 0 ;
        if (number > 0 ){
            if (number == 1){
                System.out.println(number + " is a prime number");
            }else {
                for (int i=2; i < number ; i++){
                    if (number %i == 0){
                        count++;
                    }
                }
                if ( count == 0){
                    System.out.println(number + " is a prime");
                }else {
                    System.out.println(number + " is not a prime");
                }
            }
        }else {
            System.out.println("enter a psotive number");
        }
    }
}
