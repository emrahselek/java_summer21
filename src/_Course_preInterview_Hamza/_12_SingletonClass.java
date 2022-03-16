package _Course_preInterview_Hamza;

public class _12_SingletonClass {
    /**
     * Bir classtan birden fazla object olusturulabilir.Ornegin;
                    Peace p1 = new Peace();
                    Peace p2 = new Peace();

     * Ama SingletonClass da ise; Hafizada sadece bir tane nesne (object) olusturma garantisi verir.

     * Singleton Class Olusturmak icin:
        1- Constructor'i private yapiyoruz:
                     private Peace(){
                     }

        2- Daha sonra ayni class icerisinde private ve static bir nesne olusturuyoruz:
                    private static Peace peaceX = new Peace();

        3- Daha sonrada bir tane public static method olusturyoruz ve daha once
           olusturdugumuz nesneyide return ederek disariya aciyoruz.
                     public static Peace getInstance(){ // ->getInstance methodu.
                     return peaceX;
                     }

     */

    public static void main(String[] args) {
        System.out.println(Peace.getInstance().sayi);
    }
}

class Peace{

    public int sayi=21;

    //private constructor
    private Peace(){
    }

    //Kendi class'imizdan kendimize bir nesne olusturuyoruz.
    private static Peace peaceX = new Peace();

    // Bir private olan degiskene disardan ulasmak icin getter and setter kullaniyoruz.
    public static Peace getInstance(){ // ->getInstance methodu.
        return peaceX;
    }
}
