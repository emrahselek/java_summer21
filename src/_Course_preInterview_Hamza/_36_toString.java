package _Course_preInterview_Hamza;

import java.util.ArrayList;

public class _36_toString {
    /*
    Object'leri string'e cevirmek icin kullandigimiz genel method dur.

    */
    public static void main(String[] args) {
        System.out.println("try");
        BosClassX bs = new BosClassX();
        System.out.println(bs.toString());

        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());

    }

}

//-->Boyle gibi davraniyor , eger biz toString kullanirsak
// Automatikmen miras aliyoruz.=> class Bosclass extends Object{}
class BosClassX {
    public int sayi = 20;
    public String isim = "Game";

    public String toString() {
        return "isim: " + isim + "\nSayi: " + sayi;
    }

}