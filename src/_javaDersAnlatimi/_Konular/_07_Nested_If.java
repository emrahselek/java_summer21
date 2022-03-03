package _javaDersAnlatimi._Konular;

import java.util.Scanner;

public class _07_Nested_If {
    //ic ice if kullanimi
    public static void main(String[] args) {

//        int sayi = 65 ;
//        if (sayi >= 50 ){
//            System.out.println("50ye esit yada buyuktur");
//            if(sayi %10 ==0){
//                System.out.println("10 a tam bolunebiliyor");
//                if(sayi == 80){
//                    System.out.println("Sayi 80");
//                }
//            }
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int age = sc.nextInt();
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet = sc.next().toLowerCase();
        if (cinsiyet.equals("erkek")){
            if (age >=20){
                System.out.println("Askere gidebilirsiniz");
            }
            if (age < 20){
                System.out.println("Yasiniz askerlik icin yeterli degil");
            }
        }
    }
}
