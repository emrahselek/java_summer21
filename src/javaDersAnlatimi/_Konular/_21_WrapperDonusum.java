package javaDersAnlatimi._Konular;

public class _21_WrapperDonusum {
    /*
    Wrapper classlarla donusum primitive data typelar ile ayni islemi yapiyor. Elimizde bir metin varken
    bir sayi elde edebiliyoruz. Bunlari yapmak icin hazir methodlari kullaniriz.
     */

    public static void main(String[] args) {

        int maximumSayi = Integer.max(50, 100);
        System.out.println(maximumSayi);

        //parse ve valueof yardimi ile elimizdeki bir stringi tam sayiya donusturebiliyoruz.

        String yas = "50";
        int yastamsayi = Integer.parseInt(yas); //--> yas stringinden tam sayi elde ediyoruz.
        System.out.println(yastamsayi);

        String sonuc = "false";
        boolean sonuc1 = Boolean.parseBoolean(sonuc);
        System.out.println(sonuc1);


        int sayi = 50;
        String yazi = String.valueOf(sayi);
        System.out.println(yazi);



    }
}
