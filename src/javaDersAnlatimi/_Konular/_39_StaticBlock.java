package javaDersAnlatimi._Konular;

public class _39_StaticBlock {
/*
    static olarak olusturulan degiskenlere program calismadan once deger atamasi yapmak icin kullanilir.
                static {

                }
 */

    public static void main(String[] args) {

        System.out.println(Araba13.hiz);

    }


}

class Araba13 {

    //java static olan tum degerleri hafizaya almis oluyor.
    static int hiz = 200;
    static String renk = "Mavi";
    int vites = 5;

    static {
        hiz = 250;

    }
}
