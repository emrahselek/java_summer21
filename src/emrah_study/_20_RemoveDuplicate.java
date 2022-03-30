package emrah_study;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _20_RemoveDuplicate {
    /**
     * Write a return method that can remove the duplicated values from String
     * Ex: removeDup(“AAABBBCCC”) ==> ABC
     */

    public static void main(String[] args) {
        String str = "AAABBBCCC";
        WhitCollec(str);
        whitSub(str);
    }

    //1.way:
    private static void WhitCollec(String str) {
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length() - 1; i++) {
            set.add(arr[i]);
        }
        System.out.println(" set " + set.toString());
    }

    //2.way:
    private static void whitSub(String str) {
        String cont = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (!cont.contains(str.substring(i, i + 1))) {
                cont += str.substring(i, i + 1);
            }
        }
        System.out.println(" uniqu " + cont);
    }
}