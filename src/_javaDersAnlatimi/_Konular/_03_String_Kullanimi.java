package _javaDersAnlatimi._Konular;

public class _03_String_Kullanimi {
    /*
        Herhangi bir text ifadesini tutabilen yapilardir.
        String classtan elde edildigi icin Primitive data type degildir.
        Kullanimi digerlerinden daha farklidir. Ilk harfinin buyuk olmasi class oldugunu bildirmektedir.
        String degerlerde " " kullanilmak zorundadir.
        Kullanimi
        String isim = "Orcun"
     */
    /*
    String Methodlari
    1. length()
        Olusturulan string'in kac karakterden olustugunu ogrenmek icin kullaniliyor.
        Return type int degerdir.
    2. concat ( ) ya da " + "
        Iki tane stringi birlestirmek icin kullaniliyor.
    3. indexOf ()
        Aradigimiz ifadenin konumunu elde etmek icin kullaniyoruz.
    4. equals ()
        Iki string degerinin ayni olup olmadigini kontrol etmek icin kullaniyoruz.
    5. toLowerCase()
        Bir string degerinin tum karakterlerini kucuk harfe donusturmek istiyorsak bu methodu kullaniyoruz.
    6. toUpperCase()
        Bir string degerinin tum karakterlerini buyuk harfe donusturmek istiyorsak bu methodu kullaniyoruz.
    7. contains()
        Aranilan kelimenin Strgin icerisinde icerip icermedigini anlamak icin kullaniyoruz.
    8. trim()
        String icindeki bosluklari temizler
    9. chatAt()
        String icinde bulunan karakterleri index kullaniarak alir.
    10. split()

    11. compareTo()
        Iki string degerini birbiri ile karsilastirir.
    12. replace()
        String icerisinde degisiklik yapamamiza yardimci olur.
    13. substring()
        Herhangi bir index belirlendikten sonraki strginleri elde etmis oluyoruz.

     */

    public static void main(String[] args) {

        String isim = "Orcun";
        System.out.println(isim);

        String bilgi = "Java Programlama Dili";

        System.out.println(bilgi);

        //length ()

        String isim1 = "Orcun";
        String dil = "Java";
        String bilgi1 = "String uzunlugu elde etme";

        System.out.println(isim1);
        System.out.println(dil);
        System.out.println(bilgi1);

        System.out.println(isim1.length()); //--> int --> 5
        int isimUzunlugu = isim1.length(); //-- Return type int degerdir.
        int dilUzunlugu = dil.length();
        int bilgiUzunlugu = bilgi1.length();

        System.out.println(isimUzunlugu); //--> 5
        System.out.println(dilUzunlugu); //--> 4
        System.out.println(bilgiUzunlugu); //--> 25

        //CONCAT()
        String isim2 = "Kerem";
        String soyisim = "Kartal";

        String adSoyad = isim2 + soyisim; //--> KeremKartal
        //aralarina bosluk eklenmedigi icin aralarina bosluk eklemek icin + + kullanmamiz gerekiyor
        String adSoyad1 = isim2 + " " + soyisim; //--> Kerem Kartal --> length = 12

        System.out.println(adSoyad);
        System.out.println(adSoyad1);
        System.out.println(adSoyad.length()); //--> 11

        String bilgi2 = "Benim ismim " + isim2 + " ve soyismim " + soyisim ;
        System.out.println(bilgi2);

        String soyIsimBilgi = "Soyisim = " + soyisim;
        System.out.println(soyIsimBilgi);

        //concat methodunun kullanimi
        String isim4 = "Kerem";
        String soyidim2 = "Kartal";

        String adSoyad2 = isim4.concat(soyidim2);
        System.out.println(adSoyad2); //--> KeremKartal

        //Birde fazla birlestirme ornegi
        String isim5 = "Ayse";
        String soyisim2 = "Yilmaz";
        String bosluk = " ";
        String fullname = isim5.concat(bosluk).concat(soyidim2);
        System.out.println(fullname);

        //INDEXOF()

        //Herhangi bir String icindeki aradigimiz karakteri bulundugu indexi bulmak icin kullaniyoruz
        //indexin 0 dan basladigini burada unutmamak gerekiyor
        //Return type int
        // Aranilan karakterin bulunmamasi durumunda return -1 olarak olur.
        // Birden falza ayni karakterden bulunuyorsa ilk buldugu karakterin index numarasini verir.
        // indexOf soldan basliyarak saga dogru ilerler.
        // lastindexOf () sagdan baslayarak sola dogru ilerler
        String isim6 = "Orcun";
        String isim7= "Hakan";
        int sira = isim6.indexOf("u");
        int sira1 = isim6.indexOf("z");
        int sira2 = isim6.lastIndexOf("n");
        int firstA = isim7.indexOf("a");
        int lastA = isim7.lastIndexOf("a");

        System.out.println("u harfinin bulundugu index : "+ sira); //--> 3
        System.out.println(isim6); //--> Orcun
        System.out.println(isim6.length()); //--> 5
        System.out.println("z harfinin bulundugu index : " + sira1); //--> -1
        System.out.println("n harcinin sondan kacinci index  : " + sira2); //--> 4
        System.out.println("Hakan isminin ilk a indexi : " + firstA); //-->1
        System.out.println("Hakan isminin son a indexi : " + lastA); //-->3
        //Birden fazla karakter yazabiliriz
        int sira3 = isim7.lastIndexOf("ka");
        System.out.println("ka harcinin bulundugu index : " + sira3);

        // EQUALS ()
        //iki tane stringdin birbirine esit olup olmadigini dogrular
        //return type boolean
        //iki string birbirine esitse true esit degilse false olarak donus yapar
        // Kucuk harf buyuk harf duyarliligi vardir.
        // equalsIgnoreCase() buyuk harf ve kucuk harf duyarliligini ortadan kaldirir.

        String isim8 = "orcun";
        String isim9 = "ORCUN";

        boolean esitMi = isim8.equals(isim9);
        boolean esitMi1 = isim8.equals("orcun");
        System.out.println(esitMi); //--> false
        System.out.println(esitMi1); //--> true
        boolean esitMi2= isim8.equalsIgnoreCase(isim9);
        System.out.println("equalsIgnoreCase : " + esitMi2); //--> true

        //TOLOWERCASE & TOUPPERCASE
        String bilgi3 = "Java Programlama Dili";
        System.out.println("tolowecase kullanimi : " + bilgi3.toLowerCase());
        System.out.println("touppercase kullanimi : " + bilgi3.toUpperCase());

        //CONTAINS ()
        //Bir string icerisinde aradigimiz ifadenin gecip gecmedigini kontrol ediyor.
        //Return type boolean
        String diller = " ingilizce, fransizca, ispanyolca, turkce ";

        System.out.println("Contains ingilizce iceriyormu : " + diller.contains("ingilizce")); //--> true
        System.out.println("Contains arapca iceriyormu : " + diller.contains("arapca")); //--> false

        //TRIM ()
        //Bir Stringde baslangicinda veya son karakterinde bosluk varsa onlari temizliyor.
        System.out.println("Trim Baslardaki ve sondaki bosluklari kaldirir : " + diller.trim()); //->ingilizce, fransizca, ispanyolca, turkce

        //CHARAT()
        //Bizim istedigimiz indexdeki karakteri almamiza yariyor.
        System.out.println("Charat kullaran 20nci indexteki karakteri bulalim : " + diller.charAt(20)); //--> a


        //COMPARETO ()
        // iki tane stringi karsilastirmaya yariyan method. Iki stringin metinlerini birbiri ile esit olup olmadigi
        // yada sozlukte yada harf sirasina gore alphabede hangisi daha once geliyor hangisi daha sonra geliyor
        // bu ikisini karsilastirmaya yariyor.
        // sonuc - olarak geliyorsa isim11 olarak yazdigimiz alfabede isim10 dan sonra geliyor
        // Return type int
        // Siralama yaparken alphabeye gore siralamak istiyorsak compareto dan yararlanabilicez
        // yada bir listenin  alfabeye gore sarili olup olmadigini kontrol etmek istersen bu methoddan yaralanabiliriz
        // iki stringin esit oldugu durumda 0 olarak donus yapar.

        String isim10 = "Ahmet";
        String isim11 = "Mehmet";
        String isim12 = "Hamza";
        String isim13 = "Bekir";
        System.out.println("Compare to methodu : " + isim10.compareTo(isim11)); //--> -12
        System.out.println("compare to methodu 1 : " + isim12.compareTo(isim13)); //--> 6


        //REPLACE
        // Bir string icerisinde degisiklik yapmamiza yardimci oluyor.
        //Bu genellikle istenmeyen karakterlerin temizlenmesinde kullanilabiliyor.
        System.out.println("Replace methodu kullilmadan once diller : " + diller);
        //--> ingilizce, fransizca, ispanyolca, turkce
        System.out.println("Replace methodu kullanildiktan sonra diller : " + diller.replace("ispanyolca", "arapca"));
        //--> ingilizce, fransizca, arapca, turkce

        String bilgi4 = "Ben Java'yi sevmiyorum!";
        System.out.println(bilgi4.replace("sevmiyorum", "seviyorum"));
        System.out.println(bilgi4.replace(" ", ""));

        //SUBSTRING
        //Herhangi bir index belirlendikten sonraki strginleri elde etmis oluyoruz.
        //indexlerde son indexi dahil etmez. Ilk indexsi dahil eder.
        // substring in iki kullanimi mevcuttur birincisi baslangic ve bitis indexi yazildiktan sonra sadece yazilan
        // indexler arasindaki string bilgilerini verir.
        // veya sadece baslangic indexi yazilir ve stringin sonuna kadar olan kismi yazdirir.

        String diller2 = "ingilizce, fransizca, ispanyolca, turkce";

        String dil1 = diller2.substring(0, 9);
        System.out.println("Diller stringdeki index 0 ve index 10 arasindaki :" + dil1); //--> ingilizce

        String dil2 = diller2.substring(15, 20);
        System.out.println("diller stringindeki index 15 ve index 20 arasindaki : " + dil2); //--> sizca

        System.out.println(diller.substring(20));


        //STRING OZEL KARAKTERLER

        //Cocuk, "Benim adim Kerem." dedi.
        String bilgi5 = "Cocuk, 'Benim adim Kerem.' dedi";
        String bilgi6=  "Cocuk, \"Benim adim Kerem.\" dedi.";
        // Cift tirnak isaretinden once \ kullanilmasi durumunda ciktida "" olarak gorunus ama \ kullanmazsak
        // mecburen '' tirnak kullanmak zorunda kaliriz ve ciktidada ' ' tek tirnak olarak gorunuz
        System.out.println(bilgi5);
        System.out.println(bilgi6);

        String isimler = "Ahmet Kerem Cansu"; //-->Ahmet Kerem Cansu
        System.out.println(isimler);
        //Bir string icerisinde eger ifadeler arasinda satir atlamak istiyorsak kullanabilecegimiz komut \n dir
        String isimler1 = "Ahmet \nKerem \nCansu"; //--> Alt alta Ahmet Kerem Cansu olarak yazdirir.
        System.out.println(isimler1);


    }
}
