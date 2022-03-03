package _javaDersAnlatimi._Konular;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _66_Iretator {
    /*

        Iterator
        ListIterator
        collectionlar ile beraber karsimiza cikan yapilardir. Elizmideli listelerde gezinti yapmamiza yariyan
        yapilardir.
        Set tibinde olusturulan listenin icindeki verileri bastan sona kadar iterator kullanarak yapabiliriz.
        hasNext() - > oge var mi
        next() -> bir sonraki ogeyi getir
        remove -> o anki ogeyi sil

        Normal Iterator yardimiyla baslangictan sona dogru gezintiye cikabiliyoruz.
        ListIterator da ise baslangictan sona dogru gezerbilirken sondan basada gezinti yapmamiza imkan verir

        Iterator bir interfacedir.

     */

    public static void main(String[] args) {
        ArrayList <String> isimler = new ArrayList<>();
        isimler.add("Burcu");
        isimler.add("Nesrin");
        isimler.add("Busra");

        System.out.println(isimler);

        Iterator<String> itr = isimler.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //hasNext() sonraki data varmi yokmu onu kontrol eder.

//        System.out.println(itr.hasNext()); //true
//        //next() bir sonraki datayi getir demek oluyor.
//        System.out.println(itr.next()); //Burcu
//        System.out.println(itr.next()); //Nesrin


    }



}

class Detay_ListIt {

    public static void main(String[] args) {

        ArrayList <String> isimler = new ArrayList<>();
        isimler.add("Burcu");
        isimler.add("Nesrin");
        isimler.add("Busra");

        ListIterator <String> iterator = isimler.listIterator();

        System.out.println(iterator.hasPrevious()); //false
        System.out.println(iterator.next()); //Burcu
        System.out.println(iterator.next()); //Nesrin
        //set methodu ile o an iterayorun uzerinde bulundugu deger degistirir.
        iterator.set("Burcu 12345");
        System.out.println(iterator.previous());//Nesrin
        System.out.println(iterator.previous());//Burcu
        iterator.add("Ayse"); //Iterator burcu indexindeyken add islemi yaparsak hangi indexde ise iterator
        //oraya ekleme yapar.
        System.out.println(isimler);
        //
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }


}
