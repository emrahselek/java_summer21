package javaDersAnlatimi._Konular;

public class _31_BirdenFazlaConstructorOlusturma {
    /*
           Birden fazla constructor olusturma------

     */
    public static void main(String[] args) {
        Araba5 araba5 = new Araba5();
        System.out.println(araba5.hiz);
        System.out.println(araba5.renk);

        Araba5 araba51 = new Araba5(300);
        System.out.println(araba51.hiz);
        System.out.println(araba51.renk);
    }
}


class Araba5{

    int hiz = 200;
    String renk = "Mavi";

    public Araba5(){
        hiz = 150;

    }
    public Araba5(int gelenhiz){
        /*
        Ikinci constructor ici bos oldugu icin class in icindeki bilgileri kullaniyor.
         */
    }

    public Araba5(String gelenRenk){

    }
    public Araba5 (int gelenHiz, String gelenRenk){


    }
}
