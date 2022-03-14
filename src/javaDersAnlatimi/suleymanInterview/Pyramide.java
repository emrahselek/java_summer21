package javaDersAnlatimi.suleymanInterview;
/*
	 Ask user to enter the number of lines of a pyramide.
	  Type a program to create the pyramide.
	  For example if the number of lines is 5, the pyramide will be like;           *
																			      * * *
																			    * * * * *
																			  * * * * * * *
																			* * * * * * * * *
	 */

public class Pyramide {
    public static void main(String[] args) {
        int row = 5;
        for ( int i = 1; i <=row ; i++){
            for (int j = 1; j <= row -i; j++){
                System.out.print("  "); //2 tane bosluk kullaniliyor.
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
