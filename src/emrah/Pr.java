package emrah;

import java.util.Arrays;

public class Pr {

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 4, 0, 4, 5, 0, 8, 9};
        System.out.println("1. Array: " + Arrays.toString(arr));

        int[] brr = new int[arr.length];

        int up = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[up] = arr[i];//assign, change
                up++;
            }
        }
        System.out.println("3. Array: " + Arrays.toString(brr));


    }


}
