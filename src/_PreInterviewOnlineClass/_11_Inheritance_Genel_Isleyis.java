package _PreInterviewOnlineClass;

public class _11_Inheritance_Genel_Isleyis {
    /**
    Inheritance : Miras Alma islemidir. Bir class'i miras olarak almak istiyorsak EXTENDS kullanmamiz gerekir.

    Extend mantiginda ilk calisan son extend yapilan class'tir. Asagidaki ornekte son class olan arac class'i
    motor class'i na extend oldugu icin ve araba15 class'i da motor class'i na extend oldugu icin
    calisma onceligi once "arac" , sonra "motor" , ve "araba" oluyor.
     */

    public static void main(String[] args) {
        Araba15 nesne = new Araba15();
        nesne.calistir();
        nesne.durdur();

    }
}

class Araba15 extends Motor {
    String isim = "Toyota";
    int maxHiz = 200;

    public Araba15(){
        System.out.println("Araba");
    }

}

class Motor extends Arac{
    public Motor(){
        System.out.println("Motor");
    }
    public void calistir (){
        System.out.println("Motor Calisti.");
    }
    public void durdur(){
        System.out.println("Motor durduruldu");
    }
}

class Arac {
    public Arac(){
        System.out.println("Arac");
    }
}
