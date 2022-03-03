package _javaDersAnlatimi.suleymanInterview;
/*
	 				Ebay Interview Questions
	 	Get a String and a character from user
	 	Count the number of characters between the first occurence and the last occurence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 5
	 	             "Java is easy" - 'w' ==> -1
	 	             "Java is easy" - 'e' ==> -1
	 */

import java.util.Scanner;

public class FirstLastCharacter {
    public static void main(String[] args) {
        System.out.println(getNumOfChar());
    }

    public static int getNumOfChar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string...");
        String s = sc.nextLine();

        System.out.println("Enter a char...");
        char ch = sc.next().charAt(0);
        int count = 0;

        int firstIdx = s.indexOf(ch);
        System.out.println(firstIdx);
        int lastIdx = s.lastIndexOf(ch);
        System.out.println(lastIdx);

        if (firstIdx == lastIdx) {
            return -1;
        } else {
            for (int i = firstIdx + 1; i < lastIdx; i++) {
                if (s.charAt(i) != ' ') {
                    count++;
                }
            }
            return count;
        }
    }
}
