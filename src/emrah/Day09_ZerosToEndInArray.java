package emrah;
/*
	 	Ebay Interview Question
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */

import java.util.Arrays;

public class Day09_ZerosToEndInArray {
    public static void main(String[] args) {

        int[] arr = {3, 0, 4, 2, 0};
        System.out.println(Arrays.toString(arr));
        int[] brr = new int[arr.length];

        int idx = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] !=0){
                brr[idx] = arr[i];
                idx ++;
            }
        }
        System.out.println(Arrays.toString(brr));


    }
}
