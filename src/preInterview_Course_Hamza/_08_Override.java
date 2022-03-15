package preInterview_Course_Hamza;

public class _08_Override {
    /**
     * Extends edilen (miras alinan) methodun icerigini degistirerek alt
       classlarda (sub class) kullanabiliriz.
     * Override edilecek methodlarin ikisininde ayni olmasi gerekiyor.
     * Diger class'dan alinan methodu eziyoruz.
     */

    public static void main(String[] args) {

        Cocuk nesne = new Cocuk();
        nesne.yemek();//cocuk hamburger yiyiyor
        nesne.haberlesme();//Baba posta yoluyla haberlesiyor
        nesne.sadeceDedenin();//Dedeninki
    }

}

class Cocuk extends Baba {

    public void yemek(){
        System.out.println("cocuk hamburger yiyiyor");
    }

}

class Baba extends Dede{
    public void yemek(){
        System.out.println("baba guvec yiyiyor.");
    }

    public void haberlesme(){
        System.out.println("Baba posta yoluyla haberlesiyor");
    }

}

class Dede {
    public void yemek(){
        System.out.println("dede kuzuyu cevirir.");
    }
    public void haberlesme() {
        System.out.println("Guvercin ile haberlesme");
    }
    public void sadeceDedenin(){
        System.out.println("Dedeninki");
    }

}

abstract class Cousin {

    public abstract void bilgi();
}
