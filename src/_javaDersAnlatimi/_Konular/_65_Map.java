package _javaDersAnlatimi._Konular;

import java.util.*;

public class _65_Map {
    /*
        Mapler key, value degeleri olarak calisir. Mapler iki data tutar.
     */

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Orcun"); //Abdullar
        isimler.add("Kerem"); //Kerem
        isimler.add("Fatih"); // Fatih

        List<Integer> maaslar = new ArrayList<>();
        maaslar.add(3500); //Abdullar
        maaslar.add(4700); //Kerem
        maaslar.add(5800); // Fatih

        System.out.println(isimler.get(2) + " : " + maaslar.get(2)); //manuel olarak iki sekilde list kullanilarak
        //map e benzetmek.

        /*
            HASHMAP KULLANIMI
            key = value
            anahtar = deger
            anahtarlar benzersiz olmak zorundadir. Duplicate key olamaz.


         */

        HashMap liste = new HashMap<>();

        //data eklemek istiyorsak put() methodundan faydalaniriz.
        liste.put("hamza", 75);
        liste.put("ali", 80);
        liste.put("kadir", 100);

        System.out.println(liste);

        //containskey, containsValue anahtar kelimenin var olup olmadigi kontrol edilir. boolean return type
        // containsValue ile degerin varligi kontrol edilir.
        System.out.println(liste.containsKey("kadir")); //true
        System.out.println(liste.containsValue(80)); //true

        //entryset eklenen datalarin listesini almak icinde kullanilir.
        System.out.println(liste.entrySet());

        //keyset() sadece keyleri yazdirmak icin kullanilir.
        System.out.println(liste.keySet());

        //isempty listenin dos olup olmadigini dogrular
        System.out.println(liste.isEmpty());

        //remove methodu icine yazilan key degerini silmek icin kullanilir.

        /*
            TreeMap - > Sirali Map
            Anahtar bolumundeki kisimlari kontrol ederek sirali olarak siralar
         */

        TreeMap liste2 = new TreeMap();
        liste2.put("Ali", 70);
        liste2.put("Zeynep", 90);
        liste2 .put("Berk", 55);

        System.out.println(liste2);

        HashMap <String, Integer> liste3 = new HashMap<>();
        liste3.put("Ali", 20);
        liste3.put("Ahmet", 70);
//        liste3.put(50, 80);

        System.out.println(liste3);

        //Listelerde yada setlerde <> icine data turlerini yaziyorduk. Maplerde <String, String> seklinde yazilabilir

        HashMap<String,String> liste4 = new HashMap<>();
        HashMap<String,Araba20> liste5 = new HashMap<>();

        HashMap<String, Integer> liste6 = new HashMap<>();
        liste6.put("Ali", 90);
        liste6.put("Bekir", 95);
        liste6.put("Zeynel", 75);

        System.out.println(liste6);
        //Maplerde for loop yardimi ile liste icini yazdiramayiz. Set ve maplerde for each kullanilarak yazdirma
        //islemi yapilir.

        for(Map.Entry<String, Integer> e : liste6.entrySet()){
            System.out.println(e);
        }





    }

    class Araba20{

    }
}
