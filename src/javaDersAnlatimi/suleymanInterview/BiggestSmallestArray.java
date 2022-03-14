package javaDersAnlatimi.suleymanInterview;
//buyuk olan array ve kucuk olan arrayin arasindaki fark nedir ?
 /*

	 	returns the difference between the biggest and the smallest numbers.

	*/

import java.util.Arrays;

public class BiggestSmallestArray {
    public static void main(String[] args) {
        int arr [] = {22,44,32,66,87,24,54,68,343};
        Arrays.sort(arr);
        System.out.println("Sorted Arrays : " + Arrays.toString(arr));
        int BigandSmaal = arr[arr.length-1] - arr[0];
        System.out.println("Difference between the greatest and the lowerst array is  : " + BigandSmaal);
    }

}
