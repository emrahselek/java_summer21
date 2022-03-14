package javaDersAnlatimi._Konular;

import java.util.LinkedList;

public class _63_LinkedList_Tip_Belirleme {
    /*
        LinkedList icerisinde sadece belirli tipte data tutmak

        AraryList vs LinkedList
        Veri ekleme : linkedlistte daha hizli ve verimli
        Veri alma : arraylistte daha hizli ve verimli.
     */

    public static void main(String[] args) {

        LinkedList<String> liste = new LinkedList<>();
        liste.add("Orcun");

        //LinkedList data eklemek

        LinkedList<Integer> sayilar = new LinkedList<>();
        sayilar.add(20);
        sayilar.add(12);
        sayilar.add(1, 40); //--> istedigimiz indexe data eklemek istedigimizde index ve datayi yaziyoruz
        sayilar.add(0, 5);

        System.out.println(sayilar);

        //Linkelist icerisindeki datalari alip islem yapabilmek icin for ve for each kullanimi

        LinkedList<String> liste2 = new LinkedList<>();
        liste2.add("Orcun");
        liste2.add("Nurullah");
        liste2.add("Cihangir");

        for ( int i = 0 ; i < liste2.size(); i++){
            System.out.println(liste2.get(i));
        }

        System.out.println();

        //reverse olark cikti almak istiyorsak
        for (int i = liste2.size()-1; i >=0 ; i--){
            System.out.println(liste2.get(i));
        }
        System.out.println();
        System.out.println("For Each");
        //for each
        for (String e : liste2){
            System.out.println(e);
        }




    }
}
