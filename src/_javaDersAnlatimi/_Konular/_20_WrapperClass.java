package _javaDersAnlatimi._Konular;

public class _20_WrapperClass {
    /*
    Primitive data type --> int, short, byte dan olusturulan classlardir. Ayni isimden olusuturlmustur. Sadece nesne
    sekilinde kullanilir.
    int         Integer
    short       Short
    byte        Byte
    long        Long
    float       Float
    double      Double
    boolean     Boolean
    char        Character
     */
    public static void main(String[] args) {
        int sayi = 587788;
        Integer sayi2 = new Integer(40);
        System.out.println(sayi2);
        sayi = sayi2;
        System.out.println(sayi);

    }
}
