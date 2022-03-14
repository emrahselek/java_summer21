package javaDersAnlatimi.suleymanInterview;
/*
	  If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
	  type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
	*/

import java.util.ArrayList;
import java.util.List;

public class ArrayToNewArray {
    public static void main(String[] args) {
        int arr [] = {3,5,1,2,7,9,2,3,5,7};
        System.out.println(arr.length);
        newArray(arr);

    }
    public static void newArray(int arr[] ){

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            int bas = i * (i+1) / 2;
            int bit = (i + 1) * (i + 2) / 2;
            if (bit > arr.length){
                break;
            }
            int sum = 0;
            for (; bas < bit; bas++){
                sum = sum + arr[bas];
            }
            list.add(sum);
            i++;
        }
        System.out.println(list);
    }
}
