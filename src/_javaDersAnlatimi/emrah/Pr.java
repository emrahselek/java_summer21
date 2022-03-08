package _javaDersAnlatimi.emrah;

import java.util.Locale;
import java.util.Scanner;

public class Pr {
    /**
    lines of a half pyramid
     *
     *  *
     *  *  *
     *  *  *  */

    public static void main(String[] args) {

        int rows=5;

        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print("o "); // for print same line
            }
            System.out.println();// for next line
        }
    }



}
