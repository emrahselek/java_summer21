package emrah_study;

public class pr {
    /*
	  From a given array find all pairs whose sum is a given number
	  {4, 6, 5, -10, 8, 5, 20} ==> 10
	  For example;	4+6=10,
	                5+5=10,
	             -10+20=10
	 */

    public static void main(String[] args) {

        int[] arr = {4, 6, 5, -10, 8, 5, 20};
        int num = 10;

        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==10){
                    System.out.println(arr[i]+" + " + arr[j] + " = " + num);
                }
            }
        }

    }


}
