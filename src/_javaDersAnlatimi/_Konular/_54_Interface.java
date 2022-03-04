package _javaDersAnlatimi._Konular;

public class _54_Interface {
    /*
        Interface'den nesle olusturulamaz.
        extends ifadesi ile degil implements ifade ile miras alinabilir.
        Interfacede olusuturulan methodlar java tarafindan abstract method olarak algilanmaktadir.
        Interface isinde ya abstract method olusturabiliriz yada static method olusturabiliriz.
        Interface classlarin icindeki degerler final degeler oldugu icin sonradan degistirilememtekdir.
        Bir class birde fazla interface extend edilebilir.

     */

    public static void main(String[] args) {
        Araba17 nesne = new Araba17();
        nesne.bilgi();
        nesne.modelBilgileri();

    }
}

class Araba17 implements Arac3, Model{

    @Override
    public void bilgi() {
        System.out.println("Bilgiler...");
    }

    @Override
    public void modelBilgileri() {
        System.out.println("Modeller...");

    }
}

interface Arac3 {

    int sati = 1234; //degeler final oldugu icin sonradan degistirilemiyor.
    void bilgi();

    public static void deneme (){

    }

}

interface Model {

    void modelBilgileri();

}

