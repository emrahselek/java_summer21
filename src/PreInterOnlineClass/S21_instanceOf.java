package PreInterOnlineClass;

public class S21_instanceOf {
    public static void main(String[] args) {

        Integer sayi = 20;
        boolean durum= sayi instanceof Integer;// sayi degiskeni Integer'dan mi olustuurlmus mudur? diye sorgulariz
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
