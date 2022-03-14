package emrah_study;

import java.util.Arrays;

public class Pr {

    public static void main(String[] args) {

        int[] arr = {2,0,0,5,0,9,1};
        System.out.println(Arrays.toString(arr));

//        int[] brr = new int[arr.length];
//        System.out.println(Arrays.toString(brr));

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
