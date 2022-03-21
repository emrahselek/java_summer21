package emrah_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _Day16_PreInterviewAll {
/**
 1-Reverse String (String tersine cevirme)
 2-Reverse integer (Integer I tersine cevirme)
 3-Write a return method that can find the unique characters from the String
 (Dizedeki benzersiz karakterleri bulabilen bir metod yazın)
 Ex: unique(“AAABBBCCCDEF”) ==> “DEF”;
 4- Write a return method that can concate two arrays (İki diziyi birleştirebilen bir dönüş yöntemi yazın)
 5-Write a method which can identifies given number is even or odd
 (Verilen sayının çift veya tek olduğunu tanımlayabilecek bir yöntem yazın)
 6-Write a return method that can remove the duplicated values from String
 (Dize’den yinelenen değerleri kaldırabilecek bir metod yazın)
 Ex: removeDup(“AAABBBCCC”) ==> ABC
 7-Write a method that can check if a number is prime or not
 (Bir sayının asal olup olmadığını kontrol eden bir metot yazınız.)
 8-Given a list of Integers 1, 2, 3, 4, 5, 6,100,200,333....etc. remove all values greater than 100.
 (1, 2, 3, 4, 5, 6.100.200.333....vb. Tamsayıların bir listesi verildi. 100'den büyük tüm değerleri kaldırın.)
 9-Write a return method that can find the frequency of characters
 (Karakterlerin sayilarini bulabilen bir dönüş yöntemi yazın)
 Ex: FrequencyOfChars(“AAABBCDD”) ==> A3B2C1D
 */
}

class x01_ReverseString {
    public static void main(String[] args) {
        //1-Reverse String (String tersine cevirme)
        String str = "BEST";
        String rvr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rvr = rvr + str.charAt(i);
        }
        System.out.println("Orginal String: " + str);
        System.out.println("Reverse String: " + rvr);
    }
}

class x02_ReverseInteger {
    public static void main(String[] args) {
        //2-Reverse integer (Integer I tersine cevirme)
        int num = 123456789;
        int reversed = 0;
        System.out.println("Original Number: " + num);

        while (num != 0) {
            int digit = num % 10;//get last from num with % remainder
            reversed = reversed * 10 + digit;
            num /= 10;//remove last digit from num
        }
        System.out.println("Reversed Number: " + reversed);

    }
}

class x03_UniqueCharacters {
    public static void main(String[] args) {
        /*
        Write a return method that can find the unique characters from the String
        (Dizedeki benzersiz karakterleri bulabilen bir metod yazın)
        Ex: unique(“AAABBBCCCDEF”) ==> “DEF”;
         */

        String str = "AAABBBCCCDEF";
        for (int i = 0; i < str.length(); i++) {
            int flag = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }
}


class x05_Even$Odd {
    public static void main(String[] args) {
        /*
        Write a method which can identifies given number is even or odd
        (Verilen sayının çift veya tek olduğunu tanımlayabilecek bir yöntem yazın)
         */

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number for checking Even or Odd");
        int num = sc1.nextInt();
        System.out.println("Number: "+num);

        if (num % 2 == 0) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Number is ODD");
        }
        sc1.close();
    }
}

class x08_ReverseString {
    public static void main(String[] args) {
       /*
       Given a list of Integers 1, 2, 3, 4, 5, 6,100,200,333....etc.
       remove all values greater than 100.
       (1, 2, 3, 4, 5, 6.100.200.333....vb. Tamsayıların bir listesi verildi.
       100'den büyük tüm değerleri kaldırın.)
        */

        int[] listInt = {1, 2, 3, 4, 5, 6, 100, 200, 333};
        System.out.println(Arrays.toString(listInt));

        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < listInt.length; i++) {
            if (listInt[i] < 101) {
                newList.add(listInt[i]);
            }
        }
        System.out.println(newList);
    }
}




