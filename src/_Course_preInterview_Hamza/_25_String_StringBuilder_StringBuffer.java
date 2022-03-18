package _Course_preInterview_Hamza;

public class _25_String_StringBuilder_StringBuffer {

    /**
     * Bu ucunun asil kullanilma amaci hafiz ile ilgili olamsidir.(Stack - Heap)
               String name = "Premium";
               stack -> name
               heap  -> Premium

     * String ile olusturulan bir variable's value heap de yaziliyor.
       Daha sonra value silip yenisi yazdigimizda, eski value hafizada silinmiyor.
       Yani hazifada hep kaliyor. ve cok yer kapliyor.
       Ama StringBuilder ve StringBuffer'da bu olay olmuyor. Once tamamen
       siliyor value ve daha sonra yenisini yaziyor.

     * StringBuffer, StringBuilder'a gore biraz daha yavas calisiyor. Cunku thread safe ozelligi var.
       Once variable kontrol ediyor safe mi degilmi diye daha sonra islem yapiyor.

     */


}