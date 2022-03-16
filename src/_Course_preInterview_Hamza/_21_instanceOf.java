package _Course_preInterview_Hamza;

public class _21_instanceOf {
    public static void main(String[] args) {

        Integer sayi = 20;
        // "sayi" degiskeni Integer'den mi olusturulmus mudur? diye sorgulariz
        boolean durum= sayi instanceof Integer;
        System.out.println(durum);

        // instanceof olayini genelde object olusturuken kullaniyoruz.
        // class'i bulmak icin.
        Elma elma = new Elma();
        Meyve meyve = new Meyve();
        System.out.println(elma instanceof Elma);
        System.out.println(meyve instanceof Meyve);
        System.out.println(meyve instanceof Yiyecek);
    }
}

class Elma{
}

class Meyve extends Yiyecek{
}

class Yiyecek{
}
