package emrah_study;

import java.util.HashMap;
import java.util.Map;

public class _Day07_RomanToNumber {
    //convert a roman number to integer(numerical number)
    public static void main(String[] args){
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        String roman = "MCML";
        // IndexNumber's value  <   Previous IndexNumber's value
        // then use just index number value.

        int result = 0;
        for (int i=0; i<roman.length(); i++) {
            if (i>0 && numbersMap.get(roman.charAt(i))>numbersMap.get(roman.charAt(i - 1))) {
                result = result + numbersMap.get(roman.charAt(i)) - 2 * numbersMap.get(roman.charAt(i - 1));
            } else
                result = result + numbersMap.get(roman.charAt(i));
        }
        System.out.println("Roman Number: " + roman);
        System.out.println("Numeric Number: " + result);
    }
}

class RomanToNumber2 {
    public static int romanToInteger(String roman) {
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i > 0 && numbersMap.get(roman.charAt(i)) > numbersMap.get(roman.charAt(i - 1))) {
                result = result + numbersMap.get(roman.charAt(i)) - 2 * numbersMap.get(roman.charAt(i - 1));
            } else
                result = result + numbersMap.get(roman.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        String romanNumber = "MCML";
        int numericalNumber = romanToInteger(romanNumber);

        System.out.println("Roman number is :" + numericalNumber);
        System.out.println("Roma num : " + romanNumber);
        System.out.println();
    }
}