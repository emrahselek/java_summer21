package _Course_preInterview_Hamza;

public class _37_InnerClass {
    public static void main(String[] args) {
        Matematik matematik = new Matematik();
        System.out.println(matematik.sayi);

        Matematik.Kare kare = new Matematik().new Kare();
        System.out.println(kare.alan(5));
        System.out.println(kare.getCevre(4));

    }
}

class Matematik {
    /*
    Bir class icerisinde olusturulan static olmayan classlara denir.
    */

    public int sayi = 20;

    public class Kare {
        public int alan(int kenar) {
            System.out.println(sayi);//inner class daki diger variable cok kolay bir sekilde cagirabilioruz.
            return kenar * kenar;
        }
        public int getCevre(int kenar) {
            return 2 * kenar;
        }
    }

    public class Dikdortgen {
        Kare kar = new Kare();// class icersinde diger clasdan nesne olusturabiliyoruz.

        public int getAlan(int kisa, int uzun) {
            return kisa * uzun;
        }
        public int getCevre(int kisa, int uzun) {
            return 2 * kisa + 2 * uzun;
        }
    }
}