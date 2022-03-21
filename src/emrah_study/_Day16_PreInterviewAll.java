package emrah_study;

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



