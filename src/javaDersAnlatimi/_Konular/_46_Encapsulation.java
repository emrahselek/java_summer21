package javaDersAnlatimi._Konular;

public class _46_Encapsulation {
    /*
        Encapsulation --> Data Saklama
        Disariya aktarmak istemedigimiz degiskeni 'private' yapariz.
        private --> Sadece class icerisinden erisilebilir.
        Encapsulationda okuma ve yazma islemleri yapabilmek icin getter setter methodlarini kullanmamiz gerekiyor.
        getter methodlarinda sadece okuma islemi yapilabilir
        seter methodlarinda ise yazma yani guncelleme islemi yapilabilir.
     */

    public static void main(String[] args) {
        Ogretmen1 nesne = new Ogretmen1();
//        nesne.dogumTarihi = 1970;
//        System.out.println(nesne.brans);
//        System.out.println(nesne.dogumTarihi);
//        System.out.println(nesne.kimlikNo);
        System.out.println(nesne.getBrans());
        System.out.println(nesne.getDogumTarihi());


    }

}

class Ogretmen1 {
    private String brans = "Matematik";
    private int dogumTarihi = 1980;
    private long kimlikNo = 123456789;

    public String getBrans(){
        return brans;
    }
    public int getDogumTarihi(){
        return dogumTarihi;
    }
}
