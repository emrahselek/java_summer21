package emrah_study;

import java.util.*;

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









class x07_PrimeTest {
    public static void main(String[] args) {
        /*
        7-Write a method that can check if a number is prime or not
        (Bir sayının asal olup olmadığını kontrol eden bir metot yazınız.)
        Prime Numbers : 2 3 5 7 11 13 17
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scan.nextInt();
        System.out.println("Is " +num + " prime? " +isPrime(num));
    }

    public static boolean isPrime (int num){
        if(num<=1){
            return  false;
        }else{
            for (int i = 2; i <num/2 ; i++) {
                if(num%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}

class x08_ReverseString {
    public static void main(String[] args) {
       /*
       Given a list of Integers 1, 2, 3, 4, 5, 6,100,200,333....etc.
       remove all values greater than 10.
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




