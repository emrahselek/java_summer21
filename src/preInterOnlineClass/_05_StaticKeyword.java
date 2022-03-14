package preInterOnlineClass;

public class _05_StaticKeyword {
    /**
        Static keyword:
        * Hafiza yonetimi icin static keyword kullanilir.
        * Degisken, method, block ve Nested class'lar da kullanabiliriz.
        * Static kelimesinin kullanildigi degisken hafizada sadece 1 kez olusturulur.
        * Static keyword ile olusturulan variable ve method'lar nesneye ozel degildir. class'a baglidir.
        * Static degisken sadece bir kez olusturuluyor o zaman bir nesnenin static degiskeninin degeri
          degistirilirse tum nesnelerin degiskeninin degeride degismis olur.
        * Nesne olusturmadan,bir static degiskeni yada methodu baska bir sinifta kullanabilirsininz.
        * Class icinde class kullanirken kullaniriz. Bunu icin static keywordu kullanmak gerek.
        * Static block'larda java run edildiginde ilk bu block calistirilir. Oncelik hakki vardir.

        The static keyword in Java is used for memory management mainly.
        We can apply static keyword with variables, methods, blocks and nested classes.
        The static keyword belongs to the class than an instance of the class.
        The static can be:
             Variable
             Method
             Block
             Nested class
     */

    public static void main(String[] args) {

        System.out.println(Araba.model);//2015

        Araba nesne = new Araba(200, "Mavi", 6,1950);
        System.out.println(Araba.model);//1950
        nesne.model = 1960;

        System.out.println(nesne.hiz);//200
        System.out.println(nesne.renk);//Mavi
        System.out.println(nesne.vites);//6
        System.out.println(nesne.model);//1960
        System.out.println("--------------");

        Araba nesne1 = new Araba(100, "Sari", 5,1970);
        System.out.println(nesne1.hiz);//100
        System.out.println(nesne1.renk);//Sari
        System.out.println(nesne1.vites);//5
        System.out.println(nesne1.model);//1970
        System.out.println("---------------");

        Araba nesne3 = new Araba(150, "Yesil", 6,1980);
        System.out.println(nesne3.hiz);//150
        System.out.println(nesne3.renk);//Tesil
        System.out.println(nesne3.vites);//6
        System.out.println(nesne3.model);//1980

        System.out.println(Araba.model); //--> statik olan variable'i bu sekildede cagirip kullanabiliriz.

        Araba.bilgi();//Bilgi
    }
}

class Araba {
        static int model = 2015;
        int vites;
        int hiz = 200;
        String renk;

    public Araba(int xHiz, String xRenk, int xVites, int xModel ){
        this.hiz = xHiz;
        this.renk = xRenk;
        this.vites = xVites;
        this.model= xModel;
    }
    public void deneme(){
        System.out.println("Deneme");
    }
    public static void bilgi(){
        System.out.println("Bilgi");
    }

}
