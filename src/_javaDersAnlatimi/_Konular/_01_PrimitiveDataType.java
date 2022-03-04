package _javaDersAnlatimi._Konular;

public class _01_PrimitiveDataType {
    /*
    Javada toplam 8 data type vardir. Bunlar ( PRIMITIVE DATA TYPE )

    byte -->
    Min deger : -128
    Max deger : 127
    Uzunlugu 8 bit.

    int --> Integer ( Tam sayilar icin kullanir ) --> 1, 4, 100, 1000
    Min deger : -2147483648
    Max deger : 2147483647
    Uzunlugu 32 bit.

    short -->
    Min deger : -32768
    Max deger : 32767
    Byte tipinde tanimlanan satilardan daha buyuk satilar icin tanimlanir.
    Uzunlugu 16 bit


    float --> Float
    float data tipinde ondalikli sayi yazdiktan sonra sayinin sonunda f koymak zorunludur. f koymazsak hata verecektir.
    Min deger : 1.4E-45
    Max deger : 3.4028235E38
    Ondalik sayi turlerinde kullanilir.
    Uzunlugu 32 bittir.
    Ondalikli sayi kisa bir sayi ise float i tercih etmek her zaman daha iyidir.

    double -->
    Min deger : 4.9E-324
    Max deger : 1.7976931348623157E308
    Ondalik sayi turlerinde kullanilir.
    Uzunlugu 64 bittir.
    Ondalikli sayi uzun bir sayi ise double i tercih etmek her zaman daha iyidir.

    Long -->
    Cok buyuk Tam sayi turlerinde kullanilir.
    Uzunlugu 64 bittir.

    char --> Character (Karakterler icin kullanilir) Ornek : a, A, b, B
    Karakter turunde degerler alir. Tanimlama yapilirken yanliz bir rakam isaret ve harf kullanilir. ' ' tek tirnak
    icine alinarak tanilmanir.Icinde sadece tek karakter tutar.


    boolean --> Boolean 2 deger alir. Bunlar true veya false dur. Mantiksal tipler olarak bilinir.


     */
    public static void main(String[] args) {
        //Degisken olusturm
        // veritipi degikeninIsmi = deger
        
        int isayi = 10;
        long lsayi = 2096986896;
        double dsayi = 1.443;
        float fsayi = 1.4432f;
        byte bsayi = 127;
        short sSayi = 495;
        char charf = 'b';
        boolean bkosul = false;
    }
}

