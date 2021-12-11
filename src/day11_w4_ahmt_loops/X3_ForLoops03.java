package day11_w4_ahmt_loops;

import java.util.Scanner;

public class X3_ForLoops03 {
	
    public static void main(String[] args) {
        
        /*
         * Nested Loop
         */
        
        for(int i=1; i<4 ; i++) {
            
            for(int j=5 ; j<7 ; j++) {
                
                System.out.println(i +"-"+ j);
            }
          
    }
        System.out.println("==========================");
        
        /*
        Ask user to enter the number of rows and the number columns then
        draw rectangle by using *   
        Example: row = 3, column=4
                 * * * *
                 * * * *
                 * * * *
         */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the # of rows");
        int row = scan.nextInt();
        System.out.println("enter the # of columns");
        int col = scan.nextInt();
        
        for(int i = 1; i<row+1; i++) { // or (i<=row)
            for(int j = 1; j<=col; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
   
        
    }
}





