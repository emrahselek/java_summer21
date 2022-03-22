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

        //2.way:
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println("StringBuilder: " + sb.reverse());
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

        //1.way:
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

        //2.way:
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        Set<String> hList = new HashSet<>();

        for (String a: list) {
            hList.add(a);
        }

        System.out.println(hList);
        for (int i=0;i<hList.size();i++) {

            String element = list.get(i);
            list.remove(element);
            if (list.contains(element)) {
                hList.remove(element);
            }
        }
        System.out.println(hList);
    }
}


class x04_Concat2Array {
    public static void main(String[] args) {
        /*
        Write a return method that can concate two arrays (İki diziyi birleştirebilen bir dönüş yöntemi yazın)
         */

        int arr1[]= {1,2,3,4};
        int arr2[] = {4, 6, 7, 8, 9};

        int array[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++)
            array[i] = arr1[i];
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < arr2.length; i++)
            array[arr1.length + i] = arr2[i];

            System.out.println(Arrays.toString(array));

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
        System.out.println("Number: " + num);

        if (num % 2 == 0) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Number is ODD");
        }
        sc1.close();
    }
}


class x06_RemoveDuplicate {
    public static void main(String[] args) {
        /*
        Write a return method that can remove the duplicated values from String
            (Dize’den yinelenen değerleri kaldırabilecek bir metod yazın)
            Ex: removeDup(“AAABBBCCC”) ==> ABC

         */
        String str="AAABBBCCC";
        WhitCollec(str);
        whitSub(str);
    }

    //1.way:
    private static void WhitCollec(String str) {
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
        Set<String> set=new HashSet<>();
        for (int i = 0; i <str.length()-1 ; i++) {
            set.add(arr[i]);
        }
        System.out.println(" set "+set.toString());
    }

    //2.way:
    private static void whitSub(String str) {
        String cont="";
        for (int i = 0; i <str.length()-1 ; i++) {
            if (!cont.contains(str.substring(i,i+1))){
                cont+=str.substring(i,i+1);
            }
        }
        System.out.println(" uniqu "+cont);
    }
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




