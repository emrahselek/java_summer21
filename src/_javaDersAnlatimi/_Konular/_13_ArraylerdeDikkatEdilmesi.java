package _javaDersAnlatimi._Konular;

import java.util.Arrays;

public class _13_ArraylerdeDikkatEdilmesi {

    public static void main(String[] args) {

        String [] isimler = new String[3];
        isimler[0] = "Ayse";
        isimler[1] = "Cansu";
        isimler[2] = "Kubra";
//        isimler[3] = "Hale"; --> ArrayIndexOutOfBoundsException bunun nedeni 3 olan siniri asarak 4 nci indexi
        // eklemek istedgimiz icin hata mesajini aldik. Bir arrayin uzunlugu ne kadar ise okadar elemen ekliyebiliriz.
        //Dikkat edilmesi gereken bir konuda data type dir. Hangi data type'dan olusturulmussa icerisine o data type
        // haricinde bir data type eklenemez. String olarak olusturulan bir arraye int deger atanamaz.

        System.out.println(Arrays.toString(isimler));

    }
}
