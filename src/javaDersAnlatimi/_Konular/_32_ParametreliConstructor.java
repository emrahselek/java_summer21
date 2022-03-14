package javaDersAnlatimi._Konular;

public class _32_ParametreliConstructor {

    public static void main(String[] args) {

        Araba6 araba6 = new Araba6(200, "Mavi");
//        araba6.hiz = 200;
//        araba6.renk = "Mavi";
        System.out.println(araba6.hiz);
        System.out.println(araba6.renk);

        System.out.println();
        Araba6 araba61 = new Araba6(180, "Siyah");
//        araba61.hiz = 150;
//        araba61.renk = "Siyah";
        System.out.println(araba61.hiz);
        System.out.println(araba61.renk);

    }

}

class Araba6 {
    int hiz ;
    String renk ;
    //constructor olusturma, constructor olusturarak daha kolay bir sekilde variableleri degistirebiliriz.
    public Araba6 (int gelenHiz, String gelenRenk){
        hiz = gelenHiz;
        renk = gelenRenk;

    }
}
