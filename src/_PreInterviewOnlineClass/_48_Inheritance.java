package _PreInterviewOnlineClass;

public class _48_Inheritance {
    /*
        Inheriance : Kalitim ( Miras Alma )
        Bir classi miras olarak almak istiyorsak EXTENDS kullanmamiz gerekir

     */
    public static void main(String[] args) {
        Ogretmen4 nesne = new Ogretmen4();
        System.out.println(nesne.brans);
        System.out.println(nesne.isim);
        System.out.println(nesne.bilgi);
        nesne.deneme();

        Mudur nesne1 = new Mudur();
        System.out.println(nesne1.bilgi);
        System.out.println(nesne1.maas);


    }
}

class Calisan3 {

    String bilgi = "Calisan";
    int maas = 4500;
    public void deneme (){
        System.out.println("Deneme...");
    }

}

class Ogretmen4 extends  Calisan3{

    String isim = "Orcun";
    String brans = "Matematik";



}

class Mudur extends Calisan3{

}
