package _javaDersAnlatimi._Konular;

public class _43_Protected_Acc_Mod {
    /*
        Protected --> Ayni class, ayni paket ve farkli pakette miras durumu varsa.
        baska bir paketten ulasmak icin extends ibaresini class kismina eklenmesi gerekmektedir.
     */

    public static void main(String[] args) {

        KimlikBigileri nesne = new KimlikBigileri();

        System.out.println(nesne.sayiDefault);
        System.out.println(nesne.sayiProtedted);
     //   System.out.println(nesne.sayiPrivate); //--> private oldugu icin buna erisemiyoruz.


    }
}

class KimlikBigileri {

    int sayiDefault = 250;
    private int sayiPrivate = 500;
    protected int sayiProtedted = 300;

}
