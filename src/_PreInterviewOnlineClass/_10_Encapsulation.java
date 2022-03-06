package _PreInterviewOnlineClass;

public class _10_Encapsulation {
    /**
        Nesne Tabanli Programlama Prensipleri (OOP Principles)
        1- Encapsulation
        2- Abstraction
        3- Inheritance
        4- Polymorphism

        Encapsulation --> Data Saklama
        Disariya aktarmak istemedigimiz degiskeni 'private' yapariz.
        private --> Sadece class icerisinden erisilebilir.
        Encapsulationda okuma ve yazma islemleri yapabilmek icin getter setter methodlarini kullanmamiz gerekiyor.
        getter methodlarinda sadece okuma islemi yapilabilir.
        setter methodlarinda ise yazma yani guncelleme islemi yapilabilir.
     */

    public static void main(String[] args) {
        Ogretmen1 nesne = new Ogretmen1();

        nesne.setBrans("Man");
        System.out.println(nesne.getBrans());
        System.out.println(nesne.getDogumTarihi());
    }
}

class Ogretmen1 {
    private String brans;
    private int dogumTarihi=1988;

    public String getBrans() {
        return brans;
    }

    public void setBrans(String starx) {
        this.brans = starx;
    }

    public int getDogumTarihi() {
        return dogumTarihi;
    }

}