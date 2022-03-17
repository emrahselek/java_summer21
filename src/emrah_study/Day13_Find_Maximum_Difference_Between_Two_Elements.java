package emrah_study;

/*
Write a Java program to find maximum difference between two elements in a given array of integers such that smaller element appears before larger element.

Example:
Input :
nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
Output:
The maximum difference between two elements of the said array elements
10
 */

import java.util.Arrays;

public class Day13_Find_Maximum_Difference_Between_Two_Elements {

    public static int diff_between_two_elements(int[] nums) {

        int diff_two_elements = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                diff_two_elements = Integer.max(diff_two_elements, nums[j] - nums[i]);
            }
        }
        return diff_two_elements;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 7, 9, 5, 11, 3, 5};
        System.out.println("Orijinal Array : " + Arrays.toString(nums));
        System.out.println("The maximum difference between two elements of the said array element " + diff_between_two_elements(nums));
    }

}