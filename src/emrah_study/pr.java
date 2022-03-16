package emrah_study;

import java.util.Arrays;

public class pr {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 2, 4, 0, 8};
        System.out.println(Arrays.toString(arr));

//        int[] brr = new int[arr.length];
//        System.out.println(Arrays.toString(brr));
//
//        int upx=0;
//        for(int i=0; i<arr.length;i++){
//            if (arr[i]!=0){
//                brr[upx]=arr[i];
//                upx++;
//            }
//        }
//        System.out.println(Arrays.toString(brr));

        int upxx=0;
        for(int i=0; i<arr.length;i++){
            if (arr[i]!=0){
                arr[upxx]=arr[i];
                upxx++;
            }
        }

        int zero = arr.length-upxx;
        System.out.println(zero);
        for (int i=0; i<zero;i++){
            arr[arr.length-1-i]=0;
        }
        System.out.println(Arrays.toString(arr));

    }
}

