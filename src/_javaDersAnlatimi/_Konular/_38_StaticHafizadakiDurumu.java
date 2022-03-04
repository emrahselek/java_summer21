package _javaDersAnlatimi._Konular;

public class _38_StaticHafizadakiDurumu {
    /*
        static olan herseyi java hafizaya ekler. program calisir calismaz ben static ile olusturulan
        tum degiskenleri hafizaya eklerim daha sonra programi calistiririm.
        Static olmayan hic bir degeri static olan methodda yada classda kullanilamaz.
     */

     static int sayi = 99;
    public static void main(String[] args) {

        System.out.println("MainMethod");
        System.out.println(Araba12.model);
        System.out.println(sayi);


    }
    public void deneme ( ){
        //static olmayan bir methodu main method icinde cagirilamaz. Cagirilmak istendiginde static olarak
        //yazilmasi gerekiyor.
    }

}


class Araba12 {

    static int model = 2015;
    static int hiz = 200;
    String renk = "Siyah";

    public static void bilgi (){
        System.out.println(hiz);
    }

}
