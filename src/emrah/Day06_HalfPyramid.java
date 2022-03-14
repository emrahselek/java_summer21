package emrah;
/*
	  	Ask user to enter the number of lines of a half pyramid.
	  	Type a program to create the half pyramid.
  	    For example if the number of lines is 5,
  	    the pyramid will be like;   *
                                    * *
                                    * * *
                                    * * * *
                                    * * * * *
    */
public class Day06_HalfPyramid {

    public static void main(String[] args) {
        int rows = 4;
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
