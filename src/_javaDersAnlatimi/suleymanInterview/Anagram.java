package _javaDersAnlatimi.suleymanInterview;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "Mary";
        String str1 = "army";

        String a1[] = str.toLowerCase().split("");
        Arrays.sort(a1);

        String a2[] = str1.toLowerCase().split("");
        Arrays.sort(a2);

        if (str.length() != str1.length()){
            System.out.println("Strgins are not anagram ");
        }else if (str.isEmpty() || str1.isEmpty()){
            System.out.println("Strings are not anagram");
        }else if (Arrays.equals(a1, a2)){
            System.out.println("String are anagram");
        }else {
            System.out.println("Strings are not anagram");
        }
    }
}
