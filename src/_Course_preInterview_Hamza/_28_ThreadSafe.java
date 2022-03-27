package _Course_preInterview_Hamza;

public class _28_ThreadSafe {
    /*
    Thread Safe: Thread yapilirken ortaya cikan problemleri onlemek icin
                 yani senkronizasyon sorununu onlemek icin kullaniriz.
                 Bunun icin "synchronized" kullaniyoruz.
                 Thread Safe ile isler sira ile calisir.
     */
    static Sayac sayac = new Sayac();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(){
            public void run(){
                for (int i=0;i<10000; i++){
                    sayac.artir();
                }
            }
        };

        Thread thread2 = new Thread(){
            public void run(){
                for (int i=0;i<10000; i++){
                    sayac.artir();
                }
            }
        };

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(sayac.sayi);// sonuc: 20000 olur. Ama sycho. kullanmazsa
                                       // eger her sefirnde rakamlar degisiyor

    }
}

class Sayac{
    public int sayi =0;
    public synchronized void artir(){
        sayi++;
    }
}
