package javaDersAnlatimi._Konular;

import java.util.ArrayList;
import java.util.List;

public class _61_ArrayList_Index_Kullanimi {
    /*
        Arraylistlerde indexe bir veri eklemek icin
        listeadi.add( indexno, deger );


     */

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Orcun");
        liste.add("Berk");
        liste.add("Erdal");
        liste.add(0, "Ayse");
        liste.add(2, "Burak");

        //remove datayi kaldiriyor.
        liste.remove(2);

        System.out.println(liste);
    }
}
