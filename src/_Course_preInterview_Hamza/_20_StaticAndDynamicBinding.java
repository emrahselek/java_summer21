package _Course_preInterview_Hamza;

public class _20_StaticAndDynamicBinding extends Elma2 {
    public static void main(String[] args) {
        /**
         Statik Binding (Baglama) ve Dinamik Baglama(Binding)

         Static B.: -> Early Binding
         * Happens at Compile time
         * Speed is high
         * Ex. Method Overloading

         Dynamic B.: -> Late Binding
         * Happens at Runtime
         * Speed is low
         * Ex. Method Overriding

         */

        //Static Binding
        Elma2 meyveX = new Elma2();
        meyveX.isim();

        //Dynamic Binding : Meyve clasindan meyve nesnesi olurtirduk ama Elma Constr.'dan
        Meyve2 meyve = new Elma2();
        meyve.isim();

    }
}

class Elma2 extends Meyve2{
    public void isim(){
        System.out.println("Elma");
    }
}

class Meyve2{
    public void isim(){
        System.out.println("Meyve");
    }
}
