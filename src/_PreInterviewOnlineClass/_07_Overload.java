package _PreInterviewOnlineClass;
public class _07_Overload {
    /*
        Overload (Overloading) --> Bir methodun imzasi degistirilerek ayni isimde yeni bir method
        olusturulmasidir.
        toplama (int..)
        toplama (int.., int...)
        toplama (int..., int..., int...)
     */
    public static void main(String[] args) {
        int sonuc = toplama(10,50);
        System.out.println(sonuc);
        System.out.println("result: " + toplama(20, 5, 30));
        System.out.println(toplama(1,5));
    }
    public static int toplama (int sayi, int sayi1){
        return sayi + sayi1;
    }

    public static int toplama (int sayi, int sayi1, int sayi2){
        return sayi+sayi1+sayi2;
    }

}
