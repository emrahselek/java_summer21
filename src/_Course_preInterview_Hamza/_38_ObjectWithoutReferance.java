package _Course_preInterview_Hamza;

public class _38_ObjectWithoutReferance {
    public static void main(String[] args) {
        /*
         - Referans'i olmadan nesne olusturmanin 3 farkli yontemi vardir.

         - Referansiz nesneleri daha sonra Java Garbage Collector
           ile automatik olarak siliyor.

        */

        //1.way:
        new Matematiko();

        //2.way:
        Matematik m1 = new Matematik();
        Matematik m2 = new Matematik();
        m1=m2;// Bu sekilde m2'nin referansini iptal ettik.

        //3.way:
        Matematiko m3 = new Matematiko();
        m3=null;//Bunu yaparak yine referansi sildik.

    }
}

class Matematiko{

}