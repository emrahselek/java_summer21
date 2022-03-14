package javaDersAnlatimi._Konular;

public class _35_thisKullanimi {
    //this ifadesi genelce constructorlarda kullanilir.

    public static void main(String[] args) {
        Araba9 araba9 = new Araba9(200, "Siyah");
        System.out.println(araba9.arabaninHizi);
        System.out.println(araba9.arabaninRengi);
    }
}

class Araba9 {
    int sayi;
    int hiz = 9999;
    int model = 2015;
    int arabaninHizi;
    String arabaninRengi;

    public Araba9(int hiz, String renk){
        int model = 2000;
        arabaninHizi = hiz;
        arabaninRengi = renk;
        System.out.println("const :" + this.hiz);
        System.out.println("model const icindeki : " + model);
        System.out.println("model class leveldeki  : " + this.model);
        //this. kullanirsak class leveldaki veriablelari kullanir. this. kullanmazsak parametredeki degeri kullanir.

    }
    public void bilgiyardir (int sayi){
        this.sayi = sayi; //--> class icerisineki sayi degiskenini aliyor
    }
}
