package javaDersAnlatimi._Konular;

public class _02_Artimatik_Operatorler {
    /*
    Operatorler bizim degisken ve nesneler uzerinde degisiklik yapmak icin kullandigimiz yapilardir (elemanlar).
    Ornek
    int sayi = 20; degerini degistirmek gerekiyorsa ozaman aritmatik operatorleri kullanmamiz gerekir.
    Aritmatik Operatorler
    Matematiksel islemler icin kullanilan operatordur
    + - / *
    20 + 30
    50 - 20
    20 * 30
    100 / 50
    20 % 3
    Bunlar matematiksel operatorlerdir
     */

    /*
    Arttirma ve Azaltma Operatorleri
    ++ --> degiskenin degerini 1 arttiriyor
    -- --> degiskenin degerini 1 azaltiyor
    Arttirma ve Azatlam islemi 2 farkli sekilde kullanilmaktadir. ( Bu kullanim sadece System.out.println icerisinde
    kullanilabilir.
    ++sayi --> degiskenin degerini 1 arttirir
    --sayi --> degiskenin degerini 1 azaltir
     */

    /*
    ARITMATIK ATAMA OPERATORLERI
    int sayi = 20 ;  bu degiskenin degerini degistirmek istedigimiz zaman ornegin bu degeri 5 ile carpmamiz gerekiyor
    ozaman bunu su sekilde kullanabiliriz.
    sayi = sayi * 5 ;
    Aritmatik Operatorlerin kisa kullanim sekli
    sayi *= 5;
    sayi -= 5;
    sayi /= 5;
    sayi += 5;
    sayi %= 5;
     */

    /*
        ILISKISEL OPERATORLER
        Herhangi bir degerin diger bir deger ile karsilastirma iliskisi iliskisel operatorler ile yapilir.
        Kosullu durumlarda kullanilir. Sartli durumlarda kullanilir.
        Ornek Ahmetin sayi 18 den buyukse oy kullanabilir. Bu ifadelerde sonucu almak icin iliskisel operator
        kullanilir.
        >       buyuk
        <       kucuk
        >=      buyuk yada esit
        <=      kucuk yada esit
        ==      esit mi
        !=      esit degil mi
     */

    /*
    MANTIKSAL OPERATORLER
    Birden fazla kosul bir olayi etkiliyorsa ozamanda mantiksal operayorlerden yararlaniyoruz. Sadece bir karsilastirma
    degil birden fazla karsilastirma yapabiliriz. Ornek olarak alinin cinsiteyi erkek ve yasi >=20 gidebilir
    aysenin cinsiyeti kadin ve sayi 20den buyukse askere gidemez cunku ayse bir kiz.
    && --> ve operatoru
    || --> veya operatoru
    && operatorunde tum kosullarin true olmasi durumunda sonuc true olarak doner
    && operatorunde kousllardan girisi false olmasi durumunda sonuc false olarak doner
    || operatorunde tum kosullarin turu olmadi durumunda sonuc true olarak odner
    || operatorunde bir kosulun false olmasi durumuda diger kosul true ise yine sonuc true olarak doner
    || operatorunda her kosulunda false olmasi durumunda sonuc false olarak doner
    yani
    && operatorunde kosullarin true olarak donmesi icin tum kosullarin true olmasi gerekir
    || operatorunda ise true olarak donmesini istyorsak bir kosulun true olmasi yeterlidir.

    true && true = true
    true && false = false
    false && false = false

    true || true = true
    true || false = true
    false || false = false
     */

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 3;
        int toplam = sayi1 + sayi2;
        int cikarma = sayi1 - sayi2;
        int carpim = sayi1 * sayi2;
        int bolum = sayi1 / sayi2;
        int mod = sayi1 % sayi2;


        System.out.println(toplam);
        System.out.println(cikarma);
        System.out.println(carpim);
        System.out.println(bolum); //--> normalde 6.6666 cikmasi gerekirken burada sonuc 6 cikiyor bunun nedeni
        // data type olarak int kullanildigi icin tam sayi olarak donus yapiyor. ondalikli olarak donus
        // yapmasi istenmesi durumunda double yada float kullanmak gerekmektedir.
        System.out.println(mod);

        //Arttirma ve Azaltma Operatorleri
        int sayi3 = 20;
        int sayi4 = 40;

        System.out.println("Degerler degismeden onceki sayi3 : " + sayi3);
        System.out.println("Degerler degismeden onceki sayi4 : " + sayi4);

        sayi3++;
        sayi4--;

        System.out.println("Degerler degistikten sorna sayi3 : " + sayi3);
        System.out.println("Degerler degistikten sorna sayi4 : " + sayi4);

        --sayi3;
        ++sayi4;
        System.out.println(sayi3); //--> 20
        System.out.println(sayi4); //--> 40
        System.out.println(++sayi3); //--> 21
        System.out.println(--sayi4); //--> 39

        //ARITMATIK ATAMA OPERATORLERI
        int sayi5 = 20 ;
        sayi5 = sayi5 * 5;
        System.out.println(sayi5); //--> 100
        sayi5 *= 5;
        System.out.println(sayi5); //--> 500
        sayi5 -= 5;
        System.out.println(sayi5); //--> 495
        sayi5 /= 5;
        System.out.println(sayi5); //--> 99
        sayi5 += 5;
        System.out.println(sayi5); //--> 104
        sayi5 %= 5;
        System.out.println(sayi5); //--> 4

        // ILISKISEL OPERATORLER
        int sayi6 = 100;
        int sayi7 = 90;

//        sayi6 > sayi7  --> boolean ( true yada false )
        System.out.println(sayi6 > sayi7); //--> true
        System.out.println(sayi6 < sayi7); //--> false
        System.out.println(sayi6 >= sayi7); //--> true
        System.out.println(sayi6 <= sayi7); //--> false
        System.out.println(sayi6 == sayi7); //--> false
        System.out.println(sayi6 != sayi7); //--> true


        //MANTIKSAL OPERATORLER
        int sayi8 = 75;
        // sayi8 buyukse 50 den ve sayi 2 kucukse 100 den
        // sayi8 > 50 && sayi8 < 100
//             true   &&      true -- > true
        System.out.println(sayi8 > 50 && sayi8 < 100); //--> true

        int sayi9 = 20 ;
        // sayi9 > 10 || sayi9 < 5
        //      true  ||     false  --> true
        System.out.println(sayi9 > 10 || sayi9 < 5); //-->true





    }
}
