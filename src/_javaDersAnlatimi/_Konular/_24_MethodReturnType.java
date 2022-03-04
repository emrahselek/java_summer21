package _javaDersAnlatimi._Konular;

public class _24_MethodReturnType {
    /*
        void : deger dondurmez.


     */
    public static void main(String[] args) {

        bilgiGoster();
        int sonuc = toplam(20,40);
        System.out.println(sonuc);

    }
    public static void bilgiGoster (){
        System.out.println("Merhabalar");
        System.out.println("Hosgeldiniz.");
    }

    public static int toplam (int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        return toplam;
    }
}
