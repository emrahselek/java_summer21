package _Course_preInterview_Hamza;

public class _26_ExceptionHandling {
    /**
     * Exception Handling: Hata yakalama anlamina gelir.
     * try-catch kullaniriz

     */
    static int sonuc=0;

    public static void main(String[] args) {
        try {
            int sayi = 50;
            int sayi2 = 0;
//            sonuc = sayi+sayi2; //-> burda hata yok. Ondan dolayi catch'i calistirmaz

            System.out.println("hata Oncesi");
            sonuc = sayi / sayi2;// Normalda sifira bolunme olmaz
            System.out.println("hata sonrasi");

        } catch (Exception e) { //Exception terimi butun hatalar icin kullanilir.
            System.out.println("HATA VAR");
        }finally {
            System.out.println("Her zaman calisir. hata olsada, olmasada");
        }

        System.out.println("burada: " + sonuc);
    }
}
