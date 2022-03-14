package javaDersAnlatimi._Konular;

public class _19_TypeCasting {
    /*
    elimizdeki degiskenli farkli bir degiskene donusturme sistemine type casting denir.
    byte < short < int < long < float < double
    Eimizdeki sayi byte in icine sigabilecek bir sayi ise dondurur. Ama sigmayacak bir durumda java
    bunu otomatik olarak yapar fakat sonuclar her zaman yanlis cikar.

     */

    public static void main(String[] args) {

        byte sayi1 = 100;

        int sayi2 = 50;

        sayi1 = (byte) sayi2;
        System.out.println(sayi1);


        int sayi3 = 999;
        long sayi4 = 5674;

        sayi3 = (int) sayi4;
        System.out.println(sayi3);

        //Kucuk olan sayiyi buyuk olan sayiya donusturme islemi
        byte sayi5 = 120;
        int sayi6 = 500;

        sayi6 = sayi5;
        System.out.println(sayi6);


    }
}
