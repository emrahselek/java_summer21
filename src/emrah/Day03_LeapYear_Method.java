package emrah;

import java.util.Scanner;

public class Day03_LeapYear_Method {

    public static void main(String[] args) {

        int inx=scan();
        leapMethod(inx);

    }

    public static int scan(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int in=sc.nextInt();
        return in;
    }

    public static void leapMethod(int year){
        if(year%100==0 && year%400==0){
            System.out.println("leap year");
        }else if(year%100!=0 && year%4==0){
            System.out.println("leap year");
        }else {
            System.out.println("NOT leap year");
        }

    }
}
