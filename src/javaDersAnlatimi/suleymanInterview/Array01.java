package javaDersAnlatimi.suleymanInterview;

import java.util.Arrays;

public class Array01 {

    public static void main(String[] args) {
        
        int arr [] = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        int a= 0; 

        for (int i = 0 ; i < 7; i++){
            a = arr[0];
            for (int j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];

            }
            arr[arr.length-1] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
