package _javaDersAnlatimi.emrah;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Pr {

    // convert roman number to numerical number

    public static void main(String[] args) {


        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);


        Scanner scan = new Scanner(System.in);
        System.out.println("Roman number gir");
        String roman = scan.next().toUpperCase();

        // Memo
        for (int i = 0; i < roman.length(); i++) {
            if (!numbersMap.containsKey(roman.charAt(i))) {
                System.out.println("yanlis girdin");
            }else{

            }

        }


        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i > 0) {
                if (numbersMap.get(roman.charAt(i)) > numbersMap.get(roman.charAt(i - 1))) {
                    result = result + numbersMap.get(roman.charAt(i)) - 2 * numbersMap.get(roman.charAt(i - 1));
                }
            } else {
                result = result + numbersMap.get(roman.charAt(i));
            }
        }
        System.out.println("Roman Number: " + roman);
        System.out.println("Integer number: " + result);


    }


}

