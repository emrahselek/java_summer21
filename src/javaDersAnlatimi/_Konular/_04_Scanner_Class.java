package javaDersAnlatimi._Konular;

import java.util.Scanner;

public class _04_Scanner_Class {
    public static void main(String[] args) {
        /*
        Kullanicidan herhangi bir data veya girdi almak icin kullandigimiz classtir.
         */
        Scanner sc = new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz. ");
//        String isim = sc.next();
//        System.out.println("Isminiz : " + isim);

//        System.out.println("Lutfen yasinizi giriniz");
//        int age = sc.nextInt();
//        System.out.println("yasiniz : " + age);

        System.out.println("Lutfen isminizi giriniz  :");
        String isim = sc.next();
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = sc.nextInt();
        System.out.println("Girilen isim : " + isim);
        System.out.println("Girilen yas : " + yas);
        System.out.println("Girilen isim : " + isim + " \nGirilen yas : " + yas);

    }
}
