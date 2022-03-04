package _javaDersAnlatimi._Konular;

import java.util.HashSet;
import java.util.TreeSet;

public class _64_Set {
    /*
        Set herhangi bir sira ile datalari getirmez.
        Don't allow duplicate --> tekrarli olan datalari kabul etmez
        remove komudu diger collectionlarda index yazdigimzida kaldirabiliyorduk fakar
        setlerde siralama sitemi olmadigi icin index kullanilamaz.


        HashSet
        Data eklemesi yapildiktan sorna ekleme sirasina gore cikti vermez.

        TreeSet (SortedSet Interface ) --> eklenen verileri sirali halde eklenebiliyor.
        Treeset hashsete gore yavastir bunun nedeni datalari sirali olarak yerlestirmesidir.

     */

    public static void main(String[] args) {

        //Hashset -- Kullanimi ve methodlari
        HashSet liste = new HashSet();


        //Hashsete data eklemek icin add() methodu kullanilir
        liste.add("Orcun");
        liste.add(100);
        liste.add(false);
        liste.add("Burak");
        liste.add("Orcun");


        System.out.println(liste);

        System.out.println(liste.contains("Orcun")); //--> contains() methodu ile veri icerip icermedigini kontrol eder

        //remove methodu ile liste icerisinde istedigimiz verileri kaldirabiliriz.
        liste.remove("Burak");
        System.out.println(liste);

        //bir set in size ini bulmak icin size() methodunu kullaniriz.
        System.out.println(liste.size()); //--> 3

        //set i arraye donusturmek icin kullaniliyor.
        Object [] array = liste.toArray();

        //toString() methodunu kullanarak bir seti String data turune dondurebiliyoruz.
        String metin = liste.toString();
        System.out.println(metin);


        /*
         TREESET - SiraliKume
        Treeset olusturulurken SertedSet interfaceinden yararlanilmistir.
        Eklenen datalari sirali bir sekilde tutuyor.
        Duplicate kabul etmiyor.
        add - data ekliyoruz
        remove - data kaldiriyoruz
        contains  - datanin icinde olup olmadigini kontrol eder.
        size - listenin eleman sayisini ogrenebiliyoruz
        Performansi yuksek bir yapi degildir. Treeset yerine ArrayList kullanmak daha hizlidir.
         */

        TreeSet <String> liste3 = new TreeSet();
        liste3.add("Hamza");
        liste3.add("Ali");
        liste3.add("Betul");

        System.out.println(liste3);

        //HashSet ve TreeSet icerisindeki verileri for yardimiyla gormek
        //foreach
        HashSet<String> liste4 = new HashSet<>();
        liste4.add("Orcun");
        liste4.add("Ali");
        liste4.add("Burak");

        for (String e : liste4){
            System.out.println(e);
        }

        //Iterator yarimiyla herhangi bir list ve set icerisinde while dongusu veya for loop olarak alabiliriz.




    }
}
