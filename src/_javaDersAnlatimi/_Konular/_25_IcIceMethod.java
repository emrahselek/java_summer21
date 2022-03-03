package _javaDersAnlatimi._Konular;

public class _25_IcIceMethod {
    /*
    Method icinde method cagirabiliriz.
    Ayni method icindeki methodu calistirdiginizda StackOverflowError hatasi alirsiniz.
     */

    public static void main(String[] args) {
        bilgiGoster();



    }
    public static void bilgiGoster(){
        isimYazdir();
        System.out.println("Merhabalar");
        programYazdir();
    }

    public static void isimYazdir (){
        System.out.println("Orcun");
    }

    public static void programYazdir (){
        System.out.println("Java!");
    }
}
