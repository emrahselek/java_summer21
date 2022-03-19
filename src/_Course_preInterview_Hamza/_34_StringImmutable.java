package _Course_preInterview_Hamza;

public class _34_StringImmutable {
    public static void main(String[] args) {
        String isim = "George";
        isim.concat(" John");
        System.out.println(isim);//String immutable. Buda ispati :D
        //Ancak bu sekilde System.out icerisinde ekranda degisitirlmis gibi gorunur ama String sabittir.
        System.out.println(isim.concat(" John"));

        /*
          concat() method ile yeni bir value eklemek istedik.
          Ama var olan onceki String degeri degismedi.
          Ve halen hafizada ilk deger olarak aliniyor.
          Print yaptigimizdada yine ilk yazilan degeri gosterir.
          Iste burada String immutable.

        */
    }
}
