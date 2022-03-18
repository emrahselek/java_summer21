package _Course_preInterview_Hamza;

public class _19_Final_MainMethod {
    /*
    * Main method da final kullanilabilir.
    * Bos bir final degiskeni(instance Variable) herhangi bir method icerisinde olusturulur.
      Birde method icinde sadece value degeri verilir ve method disinda ise bos final
      degiskeni olusturabiliriz.
     */

    public final static void main(String[] args) {
        Merce merce = new Merce();
        isim();
    }

    public static void isim(){
        final int sayi;
        sayi=55;
        //sayi=98;-> buna izin vermez
        System.out.println(sayi);
    }
}

class Merce{
    final int sayi;

    public Merce(){
        sayi=60;
    }

    public Merce(int gelenSayi){
        sayi = gelenSayi;
    }
}
