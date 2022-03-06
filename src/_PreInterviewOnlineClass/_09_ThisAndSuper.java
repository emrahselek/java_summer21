package _PreInterviewOnlineClass;

public class _09_ThisAndSuper {

    /**
     this    -> Kendi class'in daki variable kullanmak icin.
     super   -> Miras aldigimiz yani extends ettigimiz class ile degeri kullanmak icindir.
     this()  -> Kendi class'in daki constructor'i okur.
     super() -> Miras aldigimiz class daki constructor'i okur. ilk olarak.

     */

    public static void main(String[] args) {

        Arabam arabam = new Arabam();

    }
}

class Arabam extends Motorm{
    public int sayi = 50;

    public Arabam(){
        this(10);//
        System.out.println("Arabam 1. constructor");

        System.out.println("Araba Sayi: " + this.sayi);// Bu class daki variable kullan.
        System.out.println("Motor Sayi: " + super.sayi);// miras aldigimiz Motor class'in daki variable kullan demek.
        ekranaYazdir(90);
        yaz(100);
    }

    public void ekranaYazdir(int sayi){
        System.out.println("This-siz SAYI: " + sayi);
    }
    public void yaz(int say){
        System.out.println("This'li SAYI: " + this.sayi);
    }
    public Arabam(int numb){
        super(20);//ilk once motor class'ni daki 2.constructor okur.
        System.out.println("Arabam 2. constructor");
    }

}

class Motorm{
    public int sayi = 20;

    public void calistir(){
        System.out.println("calisti.");
    }

    public Motorm(){
        System.out.println("Motor 1. constructor");
    }

    public Motorm(int nnnn){
        System.out.println("Motor 2. constructor");
    }

}