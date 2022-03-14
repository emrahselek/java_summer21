package javaDersAnlatimi._Konular;

public class _55_Interface_Diff_Abstract {
    /*
        interface ve abstract classlar arasindaki farkliliklar
        Abstract classlar miras alinabiliyor. Extends keyworkds u kullaniyoruz.
        Interface classlar extract kullanilamiyor bunun yerine implements keyword kullaniliyor.

        Abstract class sadece bir class extend edilebilir
        Interface classlar birden falza implements edilebilir.

        Abstract classdan nesle olusturulamaz
        Interface classdan nesle olusturulamaz

        Abstract classlar icerisinde abstract methodlar yer alir
        Interface classlarin icindede yine abstract methodlar yer alir.

        abstract classlari
        Interface classlari

        extends ifadesi ile bir class miras alinirsa bu o classin ust soyu anlamina gelir.
        implements ifadesi ile bir interface miras alinirsa bu onun ust soyu degil yetenekleri anlamina gelir.

     */

    public static void main(String[] args) {


    }

}

abstract class Araba18 {

    public abstract void bilgi();

}


class Mercedes extends Araba18 implements Fonsksiyonlar{


    @Override
    public void bilgi() {

    }

    @Override
    public void calistir() {

    }
}


interface Fonsksiyonlar {

    void calistir ();
}
