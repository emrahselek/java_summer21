package _javaDersAnlatimi._Konular;

public class _42_Default_Acc_Mod {
    /*
        -Default
        Sadece ayni class icerisinde ve ayni paket icerisinde erisim izni verir.
        Herhangi bir access modifier yazmazsak java otomatik olarak default acc mod. yazmis olur.
        Farkli pakete izin vermez.
        Baska bir paket icerisinde object olusturarak variable i cagiramayiz.
     */

    public static void main(String[] args) {

        Kitap1 nesne = new Kitap1();

        System.out.println(nesne.sayfaSayisi);



    }
}

class Kitap1 {

    int sayfaSayisi = 250;

}
