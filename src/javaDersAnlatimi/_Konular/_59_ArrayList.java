package javaDersAnlatimi._Konular;

import java.util.ArrayList;

public class _59_ArrayList {
    /*
    ArrayList
    arratlist bir nesnedir.
    - liste uzunlugu dinamiktir.
    - icerisinde farkli tipte datalar tutabilir.

        - addAll methodu bir listeyi baska bir listeye eklemek icin kullaniyoruz.

     */
    public static void main(String[] args) {

        ArrayList isimler = new ArrayList();
        //Istedigimiz gibi data ekliyebiliyoruz.
        isimler.add("Orcun");
        isimler.add("Gokhan");
        isimler.add("Abdurrahman");
        isimler.add(20);
        isimler.add(false);
        isimler.add(20.5f);





        //contains aradigimiz bir datanin arraylistin icinde olup olmadigini kontrol eder.
        boolean varMi = isimler.contains("Gokhan");
        System.out.println(varMi);

        //indexof methodu aranilan datanin hangi indexde oldugunu bize soyler.
        System.out.println("Index : " + isimler.indexOf("Gokhan"));

        //sort methodu elimizdeki listeyi siralayabiliyoruz.




        //Arrayi konsola yazdirmak icin
        System.out.println(isimler);


        //get() ile istedigimiz indexdeki bilgiyi alabiliriz.
        System.out.println(isimler.get(2)); //Abdurrahman


        //remove icine yazildi indexdeki datayi siler
        isimler.remove(1);
        System.out.println(isimler);


        //size arraylist icerisinde kac tane data oldugunu bize soyler.
        System.out.println(isimler.size());



        //clear arraylistin icindeki tum datalarini temizler.
        isimler.clear();
        System.out.println(isimler);
    }
}
