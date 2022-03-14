package javaDersAnlatimi._Konular;

public class _10_Ternart {
    /*
    Genel kullanim sekli
    Kosul ? True : false
     */

    public static void main(String[] args) {
        String isim ="";
        int sayi = 75;

//        isim = sayi>20 ? "Ayse" : "Aysegul";
//        //Ternary icerisinde syso kullanilamaz. Kullanimak istendiginde if else i kullanmamiz gerekmektedir.
//        //Onemli olan ternary icerisinde bir deger dondurmektir. If else ile arasindaki en buyuk fark budur
//        // If elsede kullanilan kondisyon boolean deger dondururken ternary de kullanilan kondisyon bir deger
//        //dondurur
//
//        System.out.println(isim);
//
//        //Iki ternary olusturabiliriz.
//        //Kosul ? yenikosul ? "" : "" : false icin
//
//        String sayi2 = 75;
//        String isim2 = "";
        isim = sayi > 50 ? (sayi > 80 ? "Ayse" : "Busra") : ("Kubra");
        System.out.println(isim);

        //if else versiyonu
        if ( sayi > 50){
            if (sayi >80){
                System.out.println("ayse");
            }else {
                System.out.println("Busra");
            }
        }else {
            System.out.println("Kubra");
        }

    }
}
