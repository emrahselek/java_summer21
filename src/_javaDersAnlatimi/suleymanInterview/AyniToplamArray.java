package _javaDersAnlatimi.suleymanInterview;

/*
	  From a given array find all pairs whose sum is a given number
	  {4, 6, 5, -10, 8, 5, 20} ==> 10
	  For example;	4+6=10, 5+5=10, -10+20=10
	 */

public class AyniToplamArray {
    public static void main(String[] args) {
        int arr[] = {4, 6, 5, -10, 8, 5, 20};
        int num = 10;
        findPairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
        System.out.println("---------------------------------------");
        for( int i=0 ; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == num){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }
    }
    public static void findPairs(int [] arry, int num) {
        for(int i=0; i<arry.length; i++) {
            for(int j=i+1; j<arry.length; j++) {
                if(arry[i]+arry[j]==num) {
                    System.out.println(arry[i] + " + " + arry[j] + " = " + num );
                }
            }
        }
    }
}
