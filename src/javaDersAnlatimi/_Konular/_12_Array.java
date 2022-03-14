package javaDersAnlatimi._Konular;

import java.util.Arrays;

public class _12_Array {

    public static void main(String[] args) {
        // Birden fazla data'yi bir arada tuttugumuz yapilardir.
        // Kac tane data tutmak istiyorsaniz bunu array'a yazmaniz gerekiyor.
        int sayi = 20;
        String isim = "Orcun";

        int[] sayilar = new int[5]; // verileri daha sonra eklemek isterseniz.
        int[] sayilar1 = { 10, 20, 30, 40, 50 }; // verileri ilk basta ekliyerek olusturmak icin bu yontemle yazilir.
        System.out.println(Arrays.toString(sayilar1));

        String[] isimler = new String[7];
        String[] isimler2 = { "Mehmet", "Ahmet", "Riza", "Halil" };
        System.out.println(Arrays.toString(isimler2));
        System.out.println(isimler2[1]);

        // Array icerisine data eklemek icin indexleri kullaniriz. Indexler her zaman
        // sifirdan basladigini unutmayalim.
        // ornek : isimler[indexnumarasi] seklinde yazilmasi gerekir.
        System.out.println(sayilar1[0]); // --> 10
        System.out.println(sayilar1[1]);
        System.out.println(sayilar1[2]);
        System.out.println(sayilar1[3]);
        System.out.println(sayilar1[4]);

        // Arrayin icindeki data'yi degistirmek istersek index bilgisini yazarak yeni datayi eklememiz yeterli olacaktir.
        sayilar1[0] = 100;
        sayilar1[1] = 110;
        sayilar1[2] = 120;
        sayilar1[3] = 130;
        sayilar1[4] = 140;
        System.out.println(Arrays.toString(sayilar1));
        System.out.println(sayilar1[2]);

        // Arrayleri olusturup sonradan arraye eklemek istedigimiz
        int[] sayilar2 = new int[5];
        sayilar2[0] = 20;
        sayilar2[1] = 100;
        sayilar2[2] = 400;
        sayilar2[4] = 500;
        System.out.println(Arrays.toString(sayilar2));
    }
}
