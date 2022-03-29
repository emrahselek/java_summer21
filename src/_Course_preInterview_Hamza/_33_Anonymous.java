package _Course_preInterview_Hamza;

public class _33_Anonymous {
    /*
        Anonymous:
        1) Abstract yada interface gibi nesne olusturamiyacagimiz
        ama ona ragmen olusturmak istedigimiz durumlarda kullaniyoruz.
        Anonymous yardimiyla nesneler olusturulabilir.
        2) Diger bir ozellik ise bir classdaki methodu baska classda
        override yaparak kullanmak icin bu anonymous'u kullaniriz.

     */

    public static void main(String[] args) {
        //Ogrenci ogrenciEhmo = new Ogrenci();//->interface den nesne olusturulmaz.
        Ogrenci ogrenciEhmo1 = new BosClass();//-> ama implement yaparak nesne olusturabiliriz.
        ogrenciEhmo1.ogrenciBilgileri();

        Ogrenci ogrenciEhmo2 = new Ogrenci() {//Anonymous kullanarak nesne olusturduk.
            @Override
            public void ogrenciBilgileri() {

            }
        };
        ogrenciEhmo2.ogrenciBilgileri();
        System.out.println("=========");

        NewClass newclass = new NewClass();
        System.out.println("Sayi: " + newclass.sayi);
        newclass.denemeMethodu();
        newclass.selamlarMethodu();

        NewClass newClass2 = new NewClass(){
            @Override
            public void denemeMethodu() {
                System.out.println("Anonymous - Yeni Bilgi");
            }
        };
        System.out.println("Sayi: " + newClass2.sayi);
        newClass2.denemeMethodu();
        newClass2.selamlarMethodu();
    }
}

interface Ogrenci{
    public void ogrenciBilgileri();

}

class BosClass implements Ogrenci{
    @Override
    public void ogrenciBilgileri() {
        System.out.println("BosClass OgrenciBilgisi");
    }
}

class NewClass{
    public int sayi= 20;
    public void denemeMethodu(){
        System.out.println("Deneme");
    }
    public void selamlarMethodu(){
        System.out.println("Selamlar");
    }

}