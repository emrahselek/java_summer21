package preInterOnlineClass;

public class _02_Object {
    /**
     Class         : Olusturacagimiz nesnenin tasarimi(sablonu).
     Object (Nesne): Class tasarimindan olusturulan somut nesne.

     Bir araba fabrikasini dusunelim, bu arabanin oncelikle tasarimi cizilir ve o tasarima uygun bir arac uretilir.
     Iste CLASS burda bizim tasarimimiz, OBJECT ise o tasarimdan urettigimiz arabadir.
     Araba class'indan bir nesne olusturdugumuzda, artik elimizde somut bir Araba vardir.
     NEW kelimesi ile belirli bir class'tan nesne olusturabiliriz.
     */

    public static void main(String[] args) {
        CarDesign honda = new CarDesign();
        System.out.println(honda.color);
        honda.run();

    }
}

class CarDesign {
    public String model = "Honda";
    public int speed = 350;
    public String color = "red";

    public void run() {
        System.out.println("It is running");
    }
    public void stop() {
        System.out.println("It can be stopped.");
    }
}

