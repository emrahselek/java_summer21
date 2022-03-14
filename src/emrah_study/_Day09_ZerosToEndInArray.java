package emrah_study;
/*
	 	Ebay Interview Question
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */

import java.util.Arrays;

public class _Day09_ZerosToEndInArray {
    public static void main(String[] args) {

        int[] arr = {3, 0, 4, 2, 0};
        System.out.println("1.Array: " + Arrays.toString(arr));

        int[] brr = new int[arr.length];
        System.out.println("2.Array: " + Arrays.toString(brr));

        int idx = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] !=0){
                brr[idx] = arr[i];
                idx ++;
            }
        }
        System.out.println("3.Array: " + Arrays.toString(brr));

    }
}

class ZeroToEndInArrayItself {

    public static void main(String[] args) {

        int[] arr = {2,0,0,5,0,9,1};
        System.out.println(Arrays.toString(arr));

        int up=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                arr[up]=arr[i];
                up++;
            }
        }

        int zero=arr.length-up;
        System.out.println(zero);
        for (int i=0; i<zero; i++){
            arr[arr.length-1-i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

