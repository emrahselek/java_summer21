package emrah_study;

import java.util.Arrays;

public class _18_ConcatenateTwoArray {
    /**
     * Write a return method that can concatenate two arrays
     */

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {4, 6, 7, 8, 9};

        int array[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++)
            array[i] = arr1[i];
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < arr2.length; i++)
            array[arr1.length + i] = arr2[i];

        System.out.println(Arrays.toString(array));

    }
}