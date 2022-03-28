package _Course_preInterview_Hamza;

public class _14_IS_AandHAS_A {
    public static void main(String[] args) {
        /**
         is-a:
         Extend yaptigimizda olur.
         ornegin, mercedes classi araba classini miras aldiginda,
         o zaman mercedesde bir araba oluyor.
         Yani "Mercedes is a Araba1"
         -> Bir class dan nesne olusturdugumuzda, o class miras aldigi diger classin
         ozelliklerini tasidigi icin ona "is-a" deriz.

         has-a:
         Bir nesnenin icerisinde baska bir nesne olurturma olayina deriz.
         Mercedes has a motor.


         Ozetle:
         is-a  -> Bir class'in baska bir classi miras almasina denir
         has-a -> Bir nesnenin icerisinde baska bir nesne bulunmasina denir.

         */

        //Mercedes is a Araba1;
        Mercedes mercedes = new Mercedes();
        System.out.println(mercedes.direksiyon);
    }
}

class Mercedes extends Araba21{
    // has-a: Bir nesnenin icerisinde baska bir nesne olurturma. o zaman
    // mercedes has a motor.
    public Motor motor = new Motor();
}

class Araba21{
    public boolean teker = true;
    public boolean direksiyon = true;
}

class Motor21{
}