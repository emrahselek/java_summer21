package javaDersAnlatimi._Konular;

public class _37_StaticTanimlama {
    /*
        Static anahtar kelimesi
        Degisken , method ve classlarda kullanabiliriz. Ama classlarda kullanim birz daha farklidir.
        Hafiza yonetimi icin static keyword kullanilir. Static kelimesinin kullanildigi degisken hafizada
        sadece 1 kez olusturulur.
        Static keyword ile olusturulan nesneye ozel degildir. class a baglidir.
        Static degisken sadece bir kez olusturuluyor ozaman bir nesnenin static degiskeninin degeri
        degistirilirse tum nesnelerin degiskeninin degeride degismis olur.
        Static degistirildigi zaman class icindeki kullanilan tum static degerlerde otomatik olarak degisir.
        Static nesne olusturmadanda kullanilabilir.

        Bir degisken static ise classismi.degiskenismi seklinde nesne olusturmadan cagrilabilir.
     */

    public static void main(String[] args) {

            Araba11 nesne = new Araba11(200, "Mavi", 6);
            nesne.model = 2020;
        System.out.println(nesne.hiz);
        System.out.println(nesne.renk);
        System.out.println(nesne.vites);
        System.out.println(nesne.model);

        Araba11 nesne1 = new Araba11(100, "Sari", 5);
        System.out.println(nesne1.hiz);
        System.out.println(nesne1.renk);
        System.out.println(nesne1.vites);
        System.out.println(nesne1.model);

        Araba11 nesne3 = new Araba11(150, "Yesil", 6);
        System.out.println(nesne3.hiz);
        System.out.println(nesne3.renk);
        System.out.println(nesne3.vites);
        System.out.println(nesne3.model);

        System.out.println(Araba11.model); //--> statik olan variablei bu sekildede cagirip kullanabiliriz.

        Araba11.bilgi();

    }
}

class Araba11{

    static int model = 2015;
    int vites;
    int hiz = 200;
    String renk;

    public Araba11 (int hiz, String renk, int vites ){

        this.hiz = hiz;
        this.renk = renk;
        this.vites = vites;
    }

    public void deneme(){
        System.out.println("Deneme");
    }

    public static void bilgi(){
        System.out.println("Bilgi");
    }

}
