package _javaDersAnlatimi._Konular;

public class _27_ObjectOlusturma {


    public static void main(String[] args) {

        Araba audi = new Araba();
        audi.calistir();
        audi.durdur();
        System.out.println("Hiz : " + audi.maxHiz);
        System.out.println("Renk : " + audi.renk);
        System.out.println("Vites : " + audi.vites);
        System.out.println("Model : " + audi.model);
        System.out.println("Kapi : " + audi.kapiSayisi);


    }

}


class Araba {

    int maxHiz = 250;
    String renk = "Mavi";
    int vites = 5;
    int model = 2012;
    int kapiSayisi = 4;

    public void calistir (){
        System.out.println("Calisti");
    }
    public void durdur(){
        System.out.println("Durduruldu");
    }

}
