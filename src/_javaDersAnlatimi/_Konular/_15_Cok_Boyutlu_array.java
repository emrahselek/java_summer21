package _javaDersAnlatimi._Konular;

import java.util.Arrays;

public class _15_Cok_Boyutlu_array {

    public static void main(String[] args) {
        // int [] sayilar = new int[3] --> tek boyutlu arraylerdir
        // int [] [] sayilar = new int[2][3] --> cok boyutlu arraylerdir.
        int [] [] sayilar = new int[2][3]; //--> 2 boyutlu array
        int [][][] sayilar1 = new int[2][3][4]; //--> 3 boyutlu array

        sayilar[0][0] = 5;
        sayilar[0][1] = 7;
        sayilar[0][2] = 4;
        sayilar[1][0] = 10;
        sayilar[1][1] = 20;
        sayilar[1][2] = 30;

        System.out.println(Arrays.deepToString(sayilar));

        for (int [] x : sayilar){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
