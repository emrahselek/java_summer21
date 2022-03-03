package _javaDersAnlatimi.suleymanInterview;

//Create a method which returns non-repeated elements from a list


import java.util.ArrayList;
import java.util.List;

public class NonRepeated {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(4);
        nums.add(1);
        //[3, 2, 3, 4, 1, 4, 1]
        System.out.println(nonRepeated(nums));

    }
    public static List<Character> nonRepeated(List<Integer> nums){

        List<Character> unique = new ArrayList<>();
        String s = "";
        for (Integer e : nums){
            s = s + e;
        }
        for( int i = 0; i < s.length(); i++){
            if (s.indexOf(s.charAt(i))== s.lastIndexOf(s.charAt(i))){
                unique.add(s.charAt(i));
            }
        }
        return unique;
    }
}

