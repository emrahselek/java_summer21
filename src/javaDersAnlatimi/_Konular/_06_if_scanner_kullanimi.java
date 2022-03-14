package javaDersAnlatimi._Konular;

import java.util.Scanner;

public class _06_if_scanner_kullanimi {
    public static void main(String[] args) {
        //if yapisini scanner class ile kullanimi
        Scanner sc = new Scanner(System.in);
//        System.out.println("Lutfen not giriniz");
        System.out.println("Islem seciniz.");
        String secim = sc.next();
        System.out.println("Ilk sayiyi giriniz");
        int num1 = sc.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int num2 = sc.nextInt();
        System.out.println("Sayilarin toplami : " + (num1 + num2));

        if(secim.equals("+")){
            System.out.println("Toplam : " + (num1+num2));
        }
        if(secim.equals("-")){
            System.out.println("Fark : " + (num1-num2));
        }
        if(secim.equals("*")){
            System.out.println("Carpim : " + (num1*num2));
        }
        if(secim.equals("/")){
            System.out.println("Bolum : " + (num1/num2));
        }

//        int ortlama = sc.nextInt();

//        if (ortlama >=45){
//            System.out.println("Dersi gectiniz.");
//        }
//        if(ortlama <45){
//            System.out.println("Dersten kaldiniz.");
//        }
    }
}
