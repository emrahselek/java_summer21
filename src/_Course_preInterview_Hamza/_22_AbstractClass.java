package _Course_preInterview_Hamza;

public class _22_AbstractClass {
    public static void main(String[] args) {
        /**
         * abstract "soyut" demek. Bundan dolayi abstract class dan NESNE olusturulamaz.
           Ama miras alarak abstract daki variable ve methodlari kullanabilriz
         * abstract class kullanmamizin asil amaci abstract method olusturmak.
         * abst. methodlar da BODY olmaz.
         * Eger abst class miras alinirsa,
           abstract classlar icerisinde abstract methodlar OVERRIDE edilmek ZORUNDADIR.
           Normal methodlarda override yapilabilir ama abst.method olmak zorunda.

         * Bu classlarda abstract method olusturup diger classlarda kullandiriyoru. Amac bu.
         * abstract method private olamaz. public default yada protected olur
         * abstract method static olamaz.
         * abstract class ve methodlarda  final key kullanilmaz.
         * private, final yada static; abstract method olusturamayiz.
         */

        Cocuk2 cocuk = new Cocuk2();
        //Soyut2 soyut = new Soyut2(); -> Abstract class 'dan nesne olusturulmaz
    }
}

class Cocuk2 extends Soyut2{
    public Cocuk2(){
        System.out.println("Sayi: " + sayi);
        isim();
        System.out.println(getHiz());
    }

    @Override
    public void soyisim() {
    }
}

abstract class Soyut2{
   public int sayi=5000;

   public void isim(){
       System.out.println("isim yazdirildi");
   }
   public int getHiz(){
       return 50;
   }
   public abstract void soyisim();
}

abstract class Maas{
    public abstract void maasHesapla();
}

class TamZamanli extends Maas{
    @Override
    public void maasHesapla() {
        System.out.println("Maas hesaplandi");
    }
}

class YariZamanli extends Maas{
    @Override
    public void maasHesapla() {
        System.out.println("Yari zamnali maas hesaplandi");
    }
}