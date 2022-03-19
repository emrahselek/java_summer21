package _Course_preInterview_Hamza;

public class _35_StringExample {
    public static void main(String[] args) {

        String a = new String("Game Over");
        String b = new String("Game Over");
        String c = b;

        //"==" --> Hem degerleri hemde Referanslari kontrol eder.
        if (a==b){ // Burda degerler ayni ama referans ayni degil. Ondan dolayi bunu calistirmaz
            System.out.println(" a == b");
        }

        // "equals" --> Burda sadece deger'e bakar.
        if (a.equals(b)){ // Iki string'in degerleri ayni
            System.out.println("a equals b");
        }

        // Burda degerler ve referanslar aynidir.
        if (b==c){
            System.out.println(" b == c");
        }
    }
}
