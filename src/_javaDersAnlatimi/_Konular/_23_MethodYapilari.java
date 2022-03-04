package _javaDersAnlatimi._Konular;

public class _23_MethodYapilari {
    /*
    Anahtar kelimeler  isim (parametre) {
    }


     */
    public static void main(String[] args) {
        toplama();
        toplama(10,20);

    }

    public static void toplama (){ //--> parametresiz method
        System.out.println("Toplama methodu cagrildi");
    }
    public static void toplama (int sayi1, int sayi2){ //--> parametreli method
        int toplam = sayi1 + sayi2;
        System.out.println("Toplama : " + toplam);

    }
}
