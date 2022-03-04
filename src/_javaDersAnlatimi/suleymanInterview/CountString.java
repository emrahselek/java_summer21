package _javaDersAnlatimi.suleymanInterview;

/*
	  Count the words in a String one by one
	  String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */

import java.util.*;

public class CountString {

    public static void main(String[] args) {

        String str = "Ali came to school, and Ayse came to school.";
        String words[] = str.split(" ");
        System.out.println(Arrays.toString(words));

        List<String> wordslist = new ArrayList<>();
        for (String w : words) {
            wordslist.add(w.replaceAll("\\W", ""));
        }
        System.out.println(wordslist);
        Map<String, Integer> numOfWords = new HashMap<>();
        for (String e : wordslist) {
            if (numOfWords.containsKey(e)) {
                numOfWords.put(e, numOfWords.get(e) + 1);
            } else {
                numOfWords.put(e, 1);
            }
        }
        System.out.println(numOfWords);
    }
}
