package emrah_study;

import java.util.Scanner;

public class _Day01_Palindrome {
    // Palindrome is any string or int value that reads the same backward as forward.
    // madam -> madam
    // 12321 -> 12321
    public static void main(String[] args) {

        //1.way
        String str = "ey edip adanada pide ye";
        str = str.replace(" ", "").toLowerCase();
        String rverse = "";

        for( int i=str.length()-1; i >= 0; i-- ){
            rverse = rverse + str.charAt(i);
        }

        if ( str.equals(rverse)){
            System.out.println(str + " is a palindrome");
        }else {
            System.out.println(str + " is not a palindrome");
        }

        //2.way
        palindrome(str);
        palindrome("ey edip adanada pide ye");

        //3.way
        String cool = enterString();
        palindrome(cool);

         // palindrome(str)); --> enterSting methodunu kullanarak methodun icindeki str degerini String olarak
         // methodun icine gonderdi. Ekstradan bir String deger yazamamiza gerek kalmiyor. " palindrome(enterString()); "

    }

    public static String enterString( ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter string");
        String strm = scan.nextLine().replace(" ", "").toLowerCase();
        return strm;
    }

    public static void palindrome(String entry){
        String reverse2="";
        for(int i=entry.length()-1; i>=0; i--){
            reverse2 = reverse2 + entry.charAt(i);
        }
        if(entry.equals(reverse2)){
            System.out.println(entry + "  is a palindrome");
        }else{
            System.out.println(entry + " is NOT a palindrome");
        }

    }

}
