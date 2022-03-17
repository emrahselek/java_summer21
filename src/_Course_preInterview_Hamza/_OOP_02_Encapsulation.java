package _Course_preInterview_Hamza;

public class _OOP_02_Encapsulation {
    /**
     * Encapsulation --> Data Saklama. Data'yi korumak ve guvenli yapilar olusturmak.
     * Disariya aktarmak istemedigimiz degiskeni 'private' yapariz.
     * boylelikle sadece o class da degiskenler okunabilir.
     * Encapsulation'da okuma ve yazma islemleri yapabilmek icin
     * getter setter methodlarini kullanmamiz gerekiyor.
     * "getter" methodlarinda sadece okuma islemi yapilabilir.
     * ve return'u vardir.
     * "setter" methodlarinda ise yazma yani guncelleme islemi yapilabilir.
     * ve return yoktur. "this" kullanilir.
     */

    public static void main(String[] args) {
        Araba3 nesne = new Araba3();

        nesne.setBrand("Honda");
        nesne.setHiz(80);
        System.out.println(nesne.getBrand());//Honda
        System.out.println(nesne.getPrice());//1988
        System.out.println(nesne.getHiz());//80
    }
}

class Araba3 {
    private String brand = "Toyota";
    private int price = 12000;
    private int maxHiz = 200;

    public void setBrand(String one) {
        this.brand = one;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setHiz(int gelenHiz) {
        //maxHiz=gelenHiz;
        if (gelenHiz < 250) {
            maxHiz = gelenHiz;
        }
    }

    public int getHiz() {
        return maxHiz;
    }

}