package _javaDersAnlatimi._Konular;

public class _05_if_kullanimi {
    public static void main(String[] args) {
        /*
        If yapisi yardimi ile programi yonlenirebiliyoruz. If kosul olarak gecmektedir.
        Kullanimi
        if ( kosul == true ){
                Kod calisir
        }
         */

        int sayi = 95;
        String diller = "Arapca, ingilizce, fransizca, istanpolca";
        String cinsiyet = "Erkek";
        String cinsiyet1 = "Kadin";
        int yas = 25;



//        if (sayi > 100){ //false
//            System.out.println("Sayi 100'den buyuk ");
//        }
//        if(sayi > 50){ //true
//            System.out.println("Sayi 50'den buyuk");
//        }
//        if (sayi < 50 ){ //false
//            System.out.println("Sayu 50 den kucuk");
//        }
//        if (diller.contains("turkce")){
//            System.out.println("Turkce biliyorsunuz");
//        }
//        if (diller.contains("ingilizce")){
//            System.out.println("Ingilizce biliyorsunuz");
//        }
//        if( yas >= 20 && cinsiyet.equals("Erkek")){  // true && true = true
//            System.out.println("Askere gidebilirsiniz");
//        }
        if (yas > 20 && cinsiyet1.equals("Erkek")){ //true && false = false if herhangi bir sey yazdirmadan cikar.
            System.out.println("Askere gidebilirsiniz");
        }
    }
}
