package _Course_preInterview_Hamza;

public class _24_Interface {
    public static void main(String[] args) {

        /**
         * Interface 'in icende olusturulan methodlarda BODY olmaz.
         * Diger classlara IMPLEMENTS edilir. Ve kullanilmak zorundadir.

         * Kullanma Amacimiz:
           1. Guvenilik amaciyla kullanilir
           2. Birden fazla farkli classlari bir arada tutar.
           3. Interface birden fazla class'a implemet edildiginde,
              unutulmus yada yeni eklenecek bir method varsa eger,
              interface icerisine ekleriz, boylelikle diger butun
              classlara da eklenmis olur.
         */

        // Araba'i de ve mercedes'i de, tek bir tip'e (IFonk.) donusturduk.
        // iki nesneyide ayni tip olarak kabul edebiliriz.
        IFonksiyonlar araba = new Araba5();
        IFonksiyonlar mercedes = new Mercedes5();
    }
}

interface IFonksiyonlar{
    public void isim();
    public int hiz();
}

class Araba5 implements IFonksiyonlar{
    @Override
    public void isim() {
    }

    @Override
    public int hiz() {
        return 0;
    }
}

class Mercedes5 implements IFonksiyonlar{
    @Override
    public void isim() {
    }

    @Override
    public int hiz() {
        return 0;
    }
}