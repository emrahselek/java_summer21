package javaDersAnlatimi._Konular;

public class _51_Abstraction {
    /*
        Abstraction ( Soyutlama )
        Abstract classlardan nesne ( Object ) olusturulamaz
        Abstract classlar extends olabilir fakar object olusturulamaz.
        Genel amaci bir cok nesneyi ayni baslik altinda barindirmaktir.
        Abstract sadece classlarda kullanilmaz methodlardada kullanilir.
        Abstract medhotlar olusturulabilir sadece abstract classlarda olusturulabilir.
        Abstract method olusturuldugunda extends edilen classlardada kullanilmak zorundadir.
        Abstract methodlarda body bos olmak zorundadir.
        Eger bir abstract class miras alinirsa o class icerisindeki abstract methodlar (override)
        class'a eklenmek zorundadir.

        Abstract class neyi yaptiginizla ilgilenir nasil yaptiginizla ilgilenmez.

        Abstract classlar abstract olmayan methodlarida barindirabilir concrit methodlari

        Abstract methodlar static olamazlar.

     */

    public static void main(String[] args) {

        Kus nesne = new Kus();
      //  Canli nesne1 = new Canli();
        Canli nesne3 = new Kus();
        nesne.konus();
        Kedi nesne2 = new Kedi();
        nesne2.konus();
        nesne3.bilgiYazdir();




    }
}

abstract class Canli {

    String isim = "Mehrhaba";
    int deneme = 3213;

    public abstract  void konus (); //--> abstract method
    public abstract void solunum(); //-->abstract meyhod

    public void bilgiYazdir (){
        System.out.println("Bilgiler.");
    }


}

class Kus extends Canli {


    @Override
    public void konus() {
        System.out.println("Cik cik...");
    }

    @Override
    public void solunum() {

    }
}

class Kedi1 extends Canli {

    @Override
    public void konus() {
        System.out.println("Miyav");
    }

    @Override
    public void solunum() {

    }
}
