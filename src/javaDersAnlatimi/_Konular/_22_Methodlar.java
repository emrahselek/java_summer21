package javaDersAnlatimi._Konular;

public class _22_Methodlar {
    /*
    Alt programlar yardimiyla programi daha anlasilir ve gelistirilebilir hale getirmek
    1- Parametresiz
    2- Parametreli
    Bir class icerisinden istedigimiz kadar method olusturabiliriz.
    Olusturdugumuz methodlari kullanmak zorunda degiliz.
     */
    public static void main(String[] args) {

        int [] sayilar = {10,20,30,40,50};
        int toplam = 0;
        int [] sayilar2 = {100,200,300,400,500};
        int toplam1 = 0;
        int [] arr2 = {34,45,56,77,88};


        for (int sayi : sayilar){
            toplam = toplam + sayi;
            //yukaridaki satiri toplam += sayi; seklindede yazabiliriz.
        }
        System.out.println(toplam);

        for( int sayi2 : sayilar2){
            toplam1 += sayi2;
        }
        System.out.println("Sayi2 toplam : " + toplam1);

        toplama(sayilar);
        toplama(arr2);
        System.out.println(toplamaArray(sayilar2));

    }

    public static void toplama (int [] arr){
        int toplam = 0;
        for (int sayi  : arr){
            toplam += sayi;

        }
        System.out.println(toplam);

    }
    public static int toplamaArray (int [] arr){
        int toplam = 0;
        for (int say : arr){
            toplam += say;
        }
        return toplam;
    }
}
