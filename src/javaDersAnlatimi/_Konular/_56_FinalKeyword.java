package javaDersAnlatimi._Konular;

public class _56_FinalKeyword {
    /*
        Final anahtar kelimesi
        Kullanilan yapinin son halini almasini saglar
        Degisken - degeri degistirilemez
        Method - override edilemez
        Class extend edilemez.

        Final kelimesi program icerisinde sabit degiskenler varsa orada kullaniliyor. Version, websitesi, firma adi
        gibi bilgileri final yaparsak herhangi bir sekilde degisitirlemez. Herhangi bir methodun guvenlik nedeni ile
        degisitirilmesini istemiyorsak yine final kelimesini kullanabiliriz. Bunu classlar icinde kullanabiliriz.
     */

    public static void main(String[] args) {
        Araba19 nesne = new Araba19();
        System.out.println(nesne.sayi);
        //nesne.sayi= 122;
        //nesne.deneme();

    }
}

class Araba19 {

    final int sayi = 1;

//    @Override
//    public void deneme() {
//        System.out.println("Araba...");
//    }
}

final class Motor1 {

   public final void deneme (){
       System.out.println("Motor...");
   }

}
