package _javaDersAnlatimi._Konular;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _67_Exceptions {
    /*
            Syntax Errors
            string isim = "Orcun"; --> String isim = "Orcun"
            Logical Errors
            Program calistiktan sonra bu hatayi gorebiliriz.
            Run Time Errors
                Try-Catch-Finally
                Throw, Throws, Trowable

            try {
                //kodlar
            }catch () {
                //hata yakalandi
            }finally
                ust kisimda islem bittiren sonra calistirilacak kodlar

                catch bolumunde istedigin tipte hatayi soyliyebilirsin. Birden fazla catch eklenebilir.

                finally her sekilde calisiyor. catch yakalasada yakalamasada yazdrir.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilk Sayisis giriniz");
        int ilkSayi = sc.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int ikinciSayi = sc.nextInt();

        int sonuc = 0;

        try{
            sonuc = ilkSayi / ikinciSayi;
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Hata olustu : " + e);
        }finally {
            System.out.println("Finally bolumu");
        }
        System.out.println("Sonuc :" +  sonuc);
    }

}

class Exception1 {
    public static void main(String[] args) {
        /*

         */
        int num1 = 50;
        int num2 = 0;

        try {
            int sonuc = divide(num1, num2);
            System.out.println(sonuc);
        }catch (ArithmeticException e ){
            System.out.println(e);
        }



//        try {
//
//            if ( num2 ==0 ){
//                throw new ArithmeticException();
//            }else {
//                System.out.println(num1 / num2 );
//            }
//
//        }catch (ArithmeticException e){
//            System.out.println("hata yakalandi" + e);
//        } catch (Exception e){

        dosyaOku();


        }



    public static int divide (int sayi1, int sayi2) throws ArithmeticException{
        /*
        methodun icinde hata ile karsilasacabilecegini dusunerek twrows u methoda yaziyor.
        sonrasinda bakan bir yazilimci bunun hata verebilecegini dusunerek main method
        icerisinde meyhodu kullanirken try catch blogunu icine almasi gerektisini anlar.
         */
        return sayi1/sayi2;
    }
    //throw degil try catch kullanilmis method
    public static void dosyaOku() {
        try {
            FileInputStream file = new FileInputStream(new File("adres"));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    //throws kullanilmis method
    public FileInputStream dosyaOku1() throws FileNotFoundException {
        FileInputStream file = new FileInputStream(new File("adress"));
        return file;
    }
}
