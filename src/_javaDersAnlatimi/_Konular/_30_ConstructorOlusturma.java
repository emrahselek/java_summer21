package _javaDersAnlatimi._Konular;

public class _30_ConstructorOlusturma {
    /*
        Constructorun icinde herhangi bir kod yazdirilmissa veya varsa java ilk once constructor u calistirir.
     */

    public static void main(String[] args) {
        Araba4 nesne = new Araba4();
        System.out.println(nesne.model);
        System.out.println(nesne.hiz);
        System.out.println(nesne.renk);
    }
}

class Araba4 {

    int model = 1990;
    int hiz = 150;
    String renk = "Siyah";

    public Araba4(){

        hiz = 200;
        model = 1995;
        renk = "Mavi";
    }
}
