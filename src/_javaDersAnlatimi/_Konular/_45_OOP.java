package _javaDersAnlatimi._Konular;

public class _45_OOP {
    /*
        Nesne Tabanli Programlama Prensipleri ( OOP Principles )
        1- Encapsulation
        Her data disariya gonderilmek zorunda degildir. Bazi datalar onemlidir ve gizli kalmasi gerekmektedir.
        Datalarin saklanma ve degistirememe mantigidir.
        2- Abstraction

        3- Inheritance
        4- Polymorphism
        Cok bicimlilik anlamina gelir. Bazi nesneler cok bicimli olarak davranabilir.
     */
    public static void main(String[] args) {

        Calisan c1= new Calisan("Orcun", 4343494, 4500);
        Calisan c2= new Calisan("Ahmet", 4433256, 4700);

        System.out.println(c1.isim);
        System.out.println(c1.kimlikNo);
    }
}

class Calisan {

    String isim ;
    long kimlikNo ;
    int maas;

    public Calisan(String isim, long kimlikNo, int maas) {
        this.isim = isim;
        this.kimlikNo = kimlikNo;
        this.maas = maas;
    }



}
