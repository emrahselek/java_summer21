package javaDersAnlatimi._Konular;

public class _26_ObjectNedir {
    /*
    Nesne tabanli programlama dilidir java
    ClassIsmi nesneIsmi = new ClassIsmi;
     */


    public static void main(String[] args) {
        Kitap kitap = new Kitap();


        System.out.println(kitap.sayfa);
        System.out.println(kitap.yazar);


    }

}

class Kutuphane{


}

class Kitap {

    public int sayfa = 250;
    public String yazar = "Hugo";

}

class Yazar {

    int dogumTarihi = 1950;
    String isim = "...";
}

