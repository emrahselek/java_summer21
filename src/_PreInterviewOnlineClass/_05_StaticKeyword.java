package _PreInterviewOnlineClass;

public class _05_StaticKeyword {
    /*
        Static keyword:
        * Hafiza yonetimi icin static keyword kullanilir.
        * Degisken , method, block ve Nested class'lar da kullanabiliriz.
        * Static kelimesinin kullanildigi degisken hafizada sadece 1 kez olusturulur.
        * Static keyword ile olusturulan variable ve method'lar nesneye ozel degildir. class a baglidir.
        * Static degisken sadece bir kez olusturuluyor o zaman bir nesnenin static degiskeninin degeri
          degistirilirse tum nesnelerin degiskeninin degeride degismis olur.
        * Nesne olusturmadan,bir static degiskeni yada methodu baska bir sinifta kullanabilirsininz.
        * Class icinde class kullanirken kullaniriz. Bunu icin static keywordu kullanmak gerek.
        * Static block'larda java run edildiginde ilk bu block calistirilir. Oncelik hakki vardir.

        The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.
        The static can be:
         Variable (also known as a class variable)
         Method (also known as a class method)
         Block
         Nested class

     */

    public static void main(String[] args) {

        System.out.println(Araba.model);
        Araba nesne = new Araba(200, "Mavi", 6,1950);
        System.out.println(Araba.model);
        nesne.model = 1960;

        System.out.println(nesne.hiz);
        System.out.println(nesne.renk);
        System.out.println(nesne.vites);
        System.out.println(nesne.model);
        System.out.println("--------------");

        Araba nesne1 = new Araba(100, "Sari", 5,1970);
        System.out.println(nesne1.hiz);
        System.out.println(nesne1.renk);
        System.out.println(nesne1.vites);
        System.out.println(nesne1.model);
        System.out.println("---------------");

        Araba nesne3 = new Araba(150, "Yesil", 6,1980);
        System.out.println(nesne3.hiz);
        System.out.println(nesne3.renk);
        System.out.println(nesne3.vites);
        System.out.println(nesne3.model);

        System.out.println(Araba.model); //--> statik olan variablei bu sekildede cagirip kullanabiliriz.

        Araba.bilgi();

    }
}

class Araba {
        static int model = 2015;
        int vites;
        int hiz = 200;
        String renk;

    public Araba(int a, String b, int c, int d ){
        this.hiz = a;
        this.renk = b;
        this.vites = c;
        this.model= d;
    }
    public void deneme(){
        System.out.println("Deneme");
    }
    public static void bilgi(){
        System.out.println("Bilgi");
    }

}
