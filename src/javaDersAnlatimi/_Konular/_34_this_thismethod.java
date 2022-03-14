package javaDersAnlatimi._Konular;

public class _34_this_thismethod {
    /*
    this -> bu class
    this () -> bu class'taki constructor. this() kullanarak bir constructordan baska bir constructor cagirabiliyoruz.

     */

    public static void main(String[] args) {
        Araba8 nesne = new Araba8(200);

        System.out.println(nesne.arabaninHiz);
        System.out.println(nesne.arabaninRengi);
    }

}


class Araba8 {
    int arabaninHiz;
    String arabaninRengi;

    public Araba8(){
        this(150,"Siyah");
        System.out.println("Default");
    }

    public Araba8(int hiz){
        this(); //-->bu classtaki constructoru cagiriyor parametresiz olani
        System.out.println("Tekli");
    }

    public Araba8(int hiz, String renk){
        arabaninHiz = hiz;
        arabaninRengi = renk;
        System.out.println("Ikili");
    }
}
