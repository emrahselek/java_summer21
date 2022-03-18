package _Course_preInterview_Hamza;

public class _18_Final {
    /*
    * Final kelimesi NIHAI demek. Yani enson hali bu olsun demek.

    * Variable -> Degiskenin degeri degistirlemez.
    * Method   -> Method override edilemez.
    * Class    -> Class miras alinamaz.
    * Constructor-> final key kullanmazsin const. ile.

     */

    public static void main(String[] args) {
        Mercedess mercedess = new Mercedess();
        System.out.println(mercedess.sayi);
       // mercedess.sayi=200;  -> final
    }
}

class Mercedess extends Araba4{
    public final int sayi=100;
    public Mercedess(){
    }

//    @Override
//    public void isim() {
//        System.out.println("mercedes");
//    }
}

class Araba4{
    public Araba4(){
    }
    public final void isim(){
        System.out.println("araba4");
    }
}

//class Manx extends Man{  -> miras alamazsin
//
//}
//class final Man{
//
//}
