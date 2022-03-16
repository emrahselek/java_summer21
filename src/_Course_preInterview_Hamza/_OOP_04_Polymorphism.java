package _Course_preInterview_Hamza;

public class _OOP_04_Polymorphism {
    /**
        Bir nesnenin birden fazla farkli nesneymis gibi davranabilmesi
        Classlar miras aldiklari classin tum ozelliklerini tasidigi icin miras alinan classtan miras alan
        class nesnesi olusturulabilir.
     */

    public static void main(String[] args) {

        Hayvan hayvan1 = new Hayvan();
        Kedi kedi = new Kedi();
        Hayvan kedi2 = new Kedi();

        hayvan1.konus();
        kedi.konus();
        kedi2.konus();

    }
}

class Kedi extends Hayvan {
    public void konus (){
        System.out.println("Miyav");
    }

}

class Kopek extends Hayvan{
    public void konus (){
        System.out.println("Hav Hav");
    }

}

class Hayvan {
    public void konus (){
        System.out.println("Hayvan konusuyor...");
    }

}
