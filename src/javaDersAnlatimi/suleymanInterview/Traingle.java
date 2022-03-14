package javaDersAnlatimi.suleymanInterview;
/*
	 Type code to draw isosceles right triangle whose side length will be given by user.
	 For example; if the side is 5 triangle will be like;   *
															* *
															*   *
															*     *
															* * * * *
	 */

public class Traingle {
    public static void main(String[] args) {
        traginel(5);

    }
    public static void traginel(int sideLenght){
        int line = 1;
        System.out.println("*");
        for (int i = 1; i < sideLenght; i++) {
            line = 2 * i -1;
            int count = 0;
            if ( i <= line){
                System.out.print("*");
            for (int k = 0; k < line; k++){
                if ( i < sideLenght-1){
                    System.out.print(" ");
                }else if ( i == sideLenght - 1){
                    System.out.print(" *");
                    count ++;
                    if ( count == sideLenght-1){
                        break;
                    }
                }
            }
            if (count < sideLenght-1){
                System.out.print("*");
            }
            }
            System.out.println();
        }

    }
}
