package javaDersAnlatimi._Konular;

public class _49_Inheritance_Genel_Isleyis {
    /*
    Extend mantiginda ilk calisan son extend yapilan classtir. Asagidaki ornekte son class olan arac classi
    motor classina extend oldugu icin ve araba15 classida motor classina extend oldugu icin
    calisma oncelici arac , motor , araba oluyor.
     */

    public static void main(String[] args) {

        Araba15 nesne = new Araba15();
        nesne.calistir();
        nesne.durdur();

    }
}

class Araba15 extends Motor {

    String isim = "Toyota";
    int maxHiz = 200;

    public Araba15(){
        System.out.println("Araba");
    }

}

class Motor extends Arac{

    public Motor(){
        System.out.println("Motor");
    }

    public void calistir (){
        System.out.println("Motor Calisti.");
    }
    public void durdur(){
        System.out.println("Motor durduruldu");
    }
}

class Arac {
    public Arac(){
        System.out.println("Arac");
    }
}
