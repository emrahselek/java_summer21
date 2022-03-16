package _Course_preInterview_Hamza;
import java.util.ArrayList;
public class _11_Array_ArrayList {
    /**
     ARRAY:
     * Statik bir listedir. Elemant sayisi sabittir.
     * Hafizada sabit bir yer tutuyor. 5 birimlik istenirse o kadar yer kaplar.
     * Javadaki hazir kutuphaneden geliyor. Import etmeye gerek yok.
     * Belirtilen data type disinda baska bir data tipi ekleyemezsiniz. Int ise sayi eklersin.

     ARRAYLIST:
     * Dinamik listedir. Eleman eklenebilir veya silinebilir.
     * Hafizada sabit yer tutmaz. surekli degisir.
     * Import etmek gerekir. //import java.util.ArrayList;
     * Istedigimiz data tipini kullanabiliyoruz ayni arraylist icinde :
        ArrayList arrayList = new ArrayList<>();              -> Bu formatta istedigin data tipi kullanilir.
        ArrayList<Integer> arrayListInt = new ArrayList<>();  -> Burada ise sadece integer data type kullana biliyoruz.

     */

    static int[] array = new int[5];
    static ArrayList arrayList = new ArrayList<>();

    public static void main(String[] args) {

        array[0]=5;
        array[1]=111;
        array[2]=3;
        array[3]=954;
        array[4]=23;
        array[5]=0;

        arrayList.add(10);
        arrayList.add('E');
        arrayList.add(1);
        arrayList.add("WarAndPeace");

    }
}
