package _javaDersAnlatimi.suleymanInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello Java, Java is Easy";
        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        Map<String, Integer> map = new HashMap<>();

        for (String e : arr){
            if (!map.containsKey(e)){
                map.put(e, 1);
            }else {
                map.put(e, map.get(e)+1);
            }
        }
        for (Map.Entry<String, Integer> w : map.entrySet()) {
            if (w.getValue() > 1) {
                System.out.println(w.getKey() + " = " + w.getValue());
            }
            if(w.getValue()>1 && w.getKey().equals(" ")){
                System.out.println("deneme");
            }
        }

    }
}
