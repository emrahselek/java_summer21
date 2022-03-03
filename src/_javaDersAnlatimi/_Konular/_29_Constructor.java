package _javaDersAnlatimi._Konular;

public class _29_Constructor {
    /*
    Constructor nedir ?
    Nesne olustururken kullandigimiz constructorlardir. Eger bir classtan nesne olusturmak istersek
    once class ismi sonra degisken ismi esittir yapip class ismi yazariz.
    Class isim = new Class (); --> new Class dedigimiz sey contructordur.
    Javada bir nesne olusturulurken kullanilan yapilar constructordur. Hafizada yer olusturmak icin NEW keyword
    kullaniyor.
    Butun classlarin consturctor i vardir.

    Java tarafindan default olarak bu constructor olusturulur.

    public Araba () {
    }


     */

    public static void main(String[] args) {
        Araba3 araba3 = new Araba3(); //-->constructordur.
        System.out.println(araba3.hiz);
        System.out.println(araba3.renk);


    }
}

class Araba3 {

    int hiz = 200;
    String renk = "Mavi";
}
