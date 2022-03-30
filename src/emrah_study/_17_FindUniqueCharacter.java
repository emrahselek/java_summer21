package emrah_study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _17_FindUniqueCharacter {
    /**
     * Write a return method that can find the unique characters from the String
     * Ex: unique(“AAABBBCCCDEF”) ==> “DEF”;
     */

    public static void main(String[] args) {
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

        for (String a : list) {
            hList.add(a);
        }

        System.out.println(hList);
        for (int i = 0; i < hList.size(); i++) {

            String element = list.get(i);
            list.remove(element);
            if (list.contains(element)) {
                hList.remove(element);
            }
        }
        System.out.println("List_Collection: "+hList);
    }
}