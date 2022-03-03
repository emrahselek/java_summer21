package _javaDersAnlatimi._Konular;

public class _41_PrivateAccMod {
    /*
        Private --> Sadece ayni class icerisinde erisim izni verir.
        Private genellike bilgi gizliligi icin kullanilir.
        Private method variable lara class disinda ulasma imkani yoktur.
     */

    public static void main(String[] args) {

        Orgetmen nesne = new Orgetmen();
        System.out.println(nesne.isim);
        System.out.println(nesne.yas);
        nesne.deneme();
//        nesne.bilgi();

    }
}


class Orgetmen {

    private long kimlikNo = 539209599;
    String isim = "Halil";
    int yas = 42;

    public void deneme (){
        System.out.println("Deneme");
    }

    private void bilgi (){
        System.out.println("Bilgi");
    }



}
