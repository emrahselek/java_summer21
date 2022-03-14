package javaDersAnlatimi._Konular;

public class _16_Donguler_while {

    public static void main(String[] args) {

        //Donguler : belirli bir kod blogunu birden fazla kez calistirmak icin kullanilir.
        //while : belirli bir kodu bizim istedigimiz sekilde calistiran yapilardir.
        //While icindeki kosul gerceklestigi sure boyunca calismaya devam eder.
        String [] isimler = {"Hamza", "Mehmet", "Sefa", "Bartu", "Ahmet", "Ayse"};
        int index = 0;

        //while dongusu ile arrayin icindeki tum verileri alip kullanabiliyoruz.
//        while (index < isimler.length){
//            System.out.println(isimler[index]);
//            index++;
//        }

        while (index<isimler.length){
            if (isimler[index].equals("Ayse")) {
                System.out.println("Ayse ismi array icinde var. ");
            }
            index++;
        }



    }
}
