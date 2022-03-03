package _javaDersAnlatimi._Konular;

public class _28_ObjectIcindeBilgiDegistirme {
    /*
    Nesne Object icerisindeki bilgileri degistirme
     */
    public static void main(String[] args) {

        Araba1 araba1 = new Araba1();
        araba1.hiz = 280;
        araba1.isim = "Toyota";
        System.out.println(araba1.hiz);
        System.out.println(araba1.isim);

        System.out.println();
        Araba1 araba11 = new Araba1();
        araba11.hiz = 300;
        araba11.isim = "BMW";
        System.out.println(araba11.hiz);
        System.out.println(araba11.isim);

        System.out.println();
        Araba1 audi = new Araba1();
        audi.hiz = 200;
        audi.isim = "Audi";

        System.out.println(audi.hiz);
        System.out.println(audi.isim);

    }
}

class Araba1 {

    int hiz ;
    String isim ;
}
