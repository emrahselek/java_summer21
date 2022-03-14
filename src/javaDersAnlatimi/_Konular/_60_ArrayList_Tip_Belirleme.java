package javaDersAnlatimi._Konular;

import java.util.ArrayList;

public class _60_ArrayList_Tip_Belirleme {
    /*
        Arrayde hep ayni tip data tutmak istiyorsak <> icine data turunu yazariz. Generic yapi yardimi ile
        arraylistin icindeki datalarin tiplerini belirtebiliyoruz.
        ArrayListin data typeini olustururken primitive data type kullanamayiz.
        ArrayListin data typini olusturuken wrapper classlari kullanmamiz gerekir.
        Integer, Boolean, String, Long, Double, Byte gibi
        <> isaretleri icerisine liste icerisinde tutmak istedigimiz veri tipini yazabiliriz.
     */

    public static void main(String[] args) {

        ArrayList isimler = new ArrayList();
        isimler.add("Orcun");
        isimler.add("Kerem");
        isimler.add(20);

        ArrayList<String> isimler2 = new ArrayList<>(); //--> bu bir interfacedir.
        isimler2.add("Orcun");
        isimler2.add("Kerem");

        System.out.println(isimler);
        System.out.println(isimler2);

        ArrayList <Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(55);


    }
}
