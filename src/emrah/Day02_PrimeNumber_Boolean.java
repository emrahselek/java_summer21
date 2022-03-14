package emrah;

import java.util.Scanner;

public class Day02_PrimeNumber_Boolean {

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
