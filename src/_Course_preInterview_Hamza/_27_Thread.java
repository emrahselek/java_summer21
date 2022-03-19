package _Course_preInterview_Hamza;

public class _27_Thread {
    /*
      * Thread: Bir is parcacigi diyebilirs. Thread sayesinde
      ayni anda birden fazla is yapilabilir.Yani ayni anda iki
      for loop dongusunu calistirabiliriz.

      * Thread classini extend ettikten sonra, class icerinde hazir bulunan
        run() methodunu Override ediyoruz. Ve daha sonra start() ile birden fazla
        isi ayni anda calistiryoruz.  COOL:D

     */
    public static void main(String[] args) {
        Calistir c1 = new Calistir("Bir");
        Calistir c2 = new Calistir("Iki");
        Calistir c3 = new Calistir("Uc");

        c1.start();
        c2.start();
        c3.start();
    }
}

class Calistir extends Thread {
    // extend Thread yerine asagidakinide kullanabilirsin.Aynidir.
    // class Calistir implements Runnable {
    public String isim;

    public Calistir(String gelenIsim) {
        this.isim = gelenIsim;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(isim + " - " + i);
        }
    }
}
