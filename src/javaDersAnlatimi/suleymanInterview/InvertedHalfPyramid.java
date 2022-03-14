package javaDersAnlatimi.suleymanInterview;
/*
	  	Ask user to enter the number of lines of a inverted half pyramid.
	  	Type a program to create the inverted half pyramid.
	    For example if the number of lines is 5, the pyramid will be like;  * * * * *
																			* * * *
																			* * *
																			* *
																			*
    */

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int row = 7;

        for(int i = row; i >=1; i--){
            for (int j = i-1; j >=0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
