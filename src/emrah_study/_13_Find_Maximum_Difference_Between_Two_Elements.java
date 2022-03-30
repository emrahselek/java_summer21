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
public class _13_Find_Maximum_Difference_Between_Two_Elements {
    public static void main(String[] args) {
        int maxValue= Integer.MIN_VALUE;
        int[] arr={1,2,-50,0,8,50};
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                maxValue=Integer.max(maxValue, arr[j]-arr[i]);
            }
        }
        System.out.println(maxValue);
    }
}

class Find_Maximum_WithMethod {
    public static int withMethod(int[] nums) {
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
        System.out.println("The maximum difference between two elements of the said array element " + withMethod(nums));
    }
}