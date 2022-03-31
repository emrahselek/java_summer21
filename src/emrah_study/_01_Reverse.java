package emrah_study;

public class _01_Reverse {
    /**
     1) Write a Java Program to reverse a STRING
     2) Write a Java Program to reverse a NUMBER
     3) Write a Java Program to reverse just LETTERS in string
     */
}

class ReverseString {
    //Write a Java Program to reverse a string
    public static void main(String[] args) {
        String str = "Java easy!";

        //1.Way using Stringbuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        System.out.println("StringBuilder-1 : " + stringBuilder.reverse());

        //Other One:
        StringBuilder sBuil = new StringBuilder(str);
        System.out.println("StringBuilder-2 : " + sBuil.reverse());

        //2.Way using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("StringBuffer : " + stringBuffer.reverse());

        //3.Way using for
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("For_loop : " + rev);

        //4.Way calling method
        revString(str);

    }

    public static String revString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("InMethod : " + str);
        return rev;
    }
}

class ReverseNumber {
    public static void main(String[] args) {
        // Reverse Number
        long num = 123456789;
        long reversed = 0;
        System.out.println("Original Number: " + num);

        while (num != 0) {
            long digit = num % 10;//get last from num with % remainder
            reversed = reversed * 10 + digit;
            num /= 10;//remove last digit from num
        }
        System.out.println("Reversed Number: " + reversed);
    }
}

class ReverseLetterInString {
    public static void main(String[] args) {
        String reverse = "TheMan who has 9876 number to 123 in COUNTRY";
        System.out.println(reverseOnlyLetter(reverse));
    }

    public static boolean isAlphabet(char char1) {
        return (char1 >= 'a' && char1 <= 'z' || char1 >= 'A' && char1 <= 'Z');
    }

    public static String reverseOnlyLetter(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i <= j) {
            if (!isAlphabet(s.charAt(i))) {
                i++;
                continue;
            } else if (!isAlphabet(s.charAt(j))) {
                j--;
                continue;
            } else {
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, s.charAt(i));
            }
            i++;
            j--;

        }
        return sb.toString();
    }
}