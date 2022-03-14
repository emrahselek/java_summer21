package PreInterOnlineClass;

public class _06_StaticBlock {
/*
    * Static olarak olusturulan degiskenlere program calismadan once deger atamasi yapmak icin kullanilir.
        static {
                hiz = 250;
        }
 */
    public static void main(String[] args) {
        System.out.println(Araba13.hiz);
    }
}
class Araba13 {
    //java static olan tum degerleri hafizaya almis oluyor.
    static int hiz = 83;
    static String renk = "Mavi";
    int vites = 5;

    static {
        hiz = 650;

    }
}
