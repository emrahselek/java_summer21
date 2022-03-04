package _javaDersAnlatimi._Konular;

import java.util.LinkedList;

public class _62_LinkedList {

    /*
        List interfaceinden olusturulmustur.

        -add methodu : veri eklemek icin
        -addFirst() ilk siraya veri eklemek icin kullaniliyor
        -addLast()  son siraya veri elemek icin kullaniyoruz.
        -remove() listenin icerisindeki bir datayi cikarmak icin kullaniliyor. Her iki turde
        kullanilabiliyor istersek datanin degerini yada datanin index numarasini yazabiliriz.
        -removeFirst() listenin ilk verisini kaldirir
        -removeLast() listenin son verisini kaldirir.
        -get() verileri almak icin kullaniliyor
        -getFirst() ilk siradaki veriyi alir
        -getLast() son siradaki veriyi alir.
        -contains() bir verinin liste icinde olup olmadini bulmak icin kullaniyoruz.
        -size() listenin sizeini verir.


     */

    public static void main(String[] args) {

        LinkedList liste = new LinkedList();
        liste.add("Orcun");
        liste.add("Burak");
        liste.add("Ayse");
        liste.addFirst("Ahmet");
        liste.addLast("Selcuk");


        liste.remove("Orcun");
        liste.remove(2 );

        System.out.println(liste.get(0));
        System.out.println(liste.getLast());
        System.out.println(liste.getFirst());

        System.out.println(liste.contains("Burak")); //-->true

        System.out.println("Eleman sayisi : " + liste.size());




        System.out.println(liste);


    }
}
