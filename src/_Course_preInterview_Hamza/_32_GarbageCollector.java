package _Course_preInterview_Hamza;

public class _32_GarbageCollector {
    /*
    Garbage Collector: Hafiza temizligi.
                       Hafiza'da kullanilmayan degiskenleri ve nesneleri temizler.
                       Java bu islemi automatik olarak yapiyor.
                       Ancak manual bu islemi yapmak istersek:
                       "System.gc();"
                       YADA
                       "Runtime.getRuntime().gc();" kullanilir.
                        Bu Runtime olan method tavsiye ediliyor.


     */
    public static void main(String[] args) {
        int i=10;
        int j=30;

        int k =i+j;
        System.out.println(k);

//        System.gc();
        Runtime.getRuntime().gc();//Tavsiye edilen bu method dur.

    }

}
