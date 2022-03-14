package javaDersAnlatimi._Konular;

public class _52_Override {
    /*
    Extends edilen methodun icerigini degistirerek alt classlarda ( sub class) kullanabiliriz.
    Override edilecek methodlarin ikisininde ayni olmasi gerekiyor.

     */

    public static void main(String[] args) {

        Toyota nesne = new Toyota();
        nesne.calistir();
        nesne.hareket();

    }

}

class Araba16 extends SoyutClass {

    public void hareket (){
        System.out.println("Araba Hareket Ediyor....");
    }

    public void calistir (){
        System.out.println("Araba calisti");
    }

    @Override
    public void bilgi() {

    }
}

class Toyota extends Araba16{
    @Override
    public void hareket() {
        System.out.println("Toyota calisti hareket etti");
    }
}

abstract class SoyutClass {

    public abstract void bilgi ();
}
