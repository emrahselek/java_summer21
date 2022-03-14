package javaDersAnlatimi._Konular;

public class _44_Public_Acc_Mod {
    /*
        public --> Her yerden erisim saglamak icin kullanilir.
        A : ayni class
        B : ayni paket farkli class
        C : farkli paket miras alinma
        D : her yerden

                A   B   C   D
    privare     +   -   -   -
    default     +   +   -   -
    protected   +   +   +   -
    public      +   +   +   +
     */

    public static void main(String[] args) {
        Futbolcu nesne = new Futbolcu();
        System.out.println(nesne.formaNo);
        nesne.bilgi();

    }
}

class Futbolcu {

    public int formaNo = 10;

    public void bilgi (){
        System.out.println("Bilgi");
    }
}