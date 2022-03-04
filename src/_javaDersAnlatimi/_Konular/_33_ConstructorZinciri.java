package _javaDersAnlatimi._Konular;

public class _33_ConstructorZinciri {
    /*
        Constructor zinciri birden fazla olusturdugumuz constructor icinde diger constructoru cagirabilme durumudur.
        2 yada daha fazla constructorun ayni class icerisinde this ifadesi yardimiyla cagrilmasi
        birden fazla nesne uretmez
        Eger diger bir constructor cagirilacaksa contructorun en ust kisminda cagrilmalidir. Ilk sirada
        this keywordu kullanilmalidir.

     */

    public static void main(String[] args) {
        Araba7 nesne = new Araba7();
//        Araba7 nesne1 = new Araba7(200);
//        Araba7 nesne2 = new Araba7(180, "Siyah");


    }


}


class Araba7{

    public Araba7(){ //-->Default constructor
        this(200); //--> ikinci constructor i cagiriyoruz. Parametresinde sadece int olan constructori cagiriyor.
        System.out.println("Default Constructor");
    }
    public Araba7(int hiz){
        this(180, "Siyah");
        System.out.println("Tekli Constructor");

    }

    public Araba7(int hiz, String renk ){
        System.out.println("Ikili Constructor");
    }

}
