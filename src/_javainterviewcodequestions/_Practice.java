package _javainterviewcodequestions;

import java.util.Scanner;

public class _Practice {

    //Write a Java Program to reverse a string

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String str = scan.nextLine();

        //StringBuilder:
        StringBuilder strB =new StringBuilder();
        strB.append(str);
        System.out.println(strB.reverse());

        //StringClass:
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);








    }


}
