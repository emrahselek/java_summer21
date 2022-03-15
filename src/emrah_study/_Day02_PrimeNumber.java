package emrah_study;

import java.util.Scanner;

public class _Day02_PrimeNumber {

        public static void main(String[] args) {
            /**
             Prime number is divided by 1 and itself. and just positive whole number.
             Prime Numbbe = Mutlak sayi

             #Conditions:
             must be bigger than 0,
             not zero,
             not negative number,
             0 is PN,
             just divide by 1 and itself

            */

            int mynumber= 10;
            int mycount=0;

            for(int i=2; i<mynumber; i++){
                if(mynumber % i == 0){
                    mycount++;
                }
            }

            if(mynumber<=0){
                System.out.println(mynumber + " is NOT Prime number");
            }else if(mynumber==1 || mycount==0){
                System.out.println(mynumber + " is prime number");
            }else  {
                System.out.println(mynumber + " is NOT Prime number");
            }
        }
    }

class PrimeNumber_Boolean {
    //prime number
    public static void main(String[] args) {

        int intox = scan();
        boolean istrue = primeNumberMth(intox);
        System.out.println(istrue);
    }

    public static int scan() {
        Scanner scannn = new Scanner(System.in);
        System.out.println("enter a number");
        int user = scannn.nextInt();
        return user;
    }

    public static boolean primeNumberMth(int number) {
        int count = 0;
        boolean sonuc = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (number <= 0) {
            sonuc = false;
        } else if (number == 1 || count == 0) {
            sonuc = true;
        } else {
            sonuc = false;
        }
        return sonuc;
    }
}

class PrimeNumber_Method {
    public static void main(String[] args) {
        int boom = scanMan();
        primeNumber(boom);
    }

    public static int scanMan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int user = scan.nextInt();
        return user;
    }

    public static void primeNumber(int mynumber ) {
        int mycount = 0;
        for (int i = 2; i < mynumber; i++) {
            if (mynumber % i == 0) {
                mycount++;
            }
        }

        if (mynumber <= 0) {
            System.out.println(mynumber + " is NOT Prime number");
        } else if (mynumber == 1 || mycount == 0) {
            System.out.println(mynumber + " is prime number");
        } else {
            System.out.println(mynumber + " is NOT Prime number");
        }
    }

}






