package _PreInterviewOnlineClass;

public class _47_Encapsulation_get_set {
    /*
    Encalsulation : Data saklama
    get ve set mehodlari kullanarak bir degiskene disaridan erisebilir ve istersek degiskenin degerinide
    degistirebiliriz.

     */

    public static void main(String[] args) {

        Ogretmen2 nesne = new Ogretmen2();
        System.out.println(nesne.getYas());
        nesne.setYas(40);
        System.out.println(nesne.getYas());
        System.out.println(nesne.getIsim());

    }


}

class Ogretmen2 {

    private int yas = 20;
    private String isim = "Hamza";
    private long kimlikNo = 123456789;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

}
