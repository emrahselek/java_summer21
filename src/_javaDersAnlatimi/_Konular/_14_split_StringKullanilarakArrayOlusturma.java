package _javaDersAnlatimi._Konular;

import java.util.Arrays;

public class _14_split_StringKullanilarakArrayOlusturma {

    public static void main(String[] args) {
        //Bir string'i arraya donusturmek icin kullanlan split methodudur. Bu method yardimi ile bir string degeri
        //icindeki datalari istedigimiz gibi parcalara bolebiliyor ve parcalardanda bir tane array elde etmis
        //oluyoruz.

        String diller = "Turkce,Ingilizce,Arapca,Fransizca,Almanca";
        String [] array = diller.split(",");
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        // length : Bir array'in kac elemendan olustugunu length ifadesini kullanarak ogrenebiliriz
        System.out.println(array.length); //--> 5

        String ifade = "Ben JAVAYI seviyorum";
        String [] arr = ifade.split("JAVAYI");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        String metin = "Bugun cuma. Iyi gunler. Kendine iyi bak.";
        String [] cumleler = metin.split("\\.");
        System.out.println(cumleler.length);
        System.out.println(Arrays.toString(cumleler));

        //Kullanicidan bir metin yazmasi gerekir. Elde ettiginiz string'i . ifadesine gore parcalar ayirip
        //kac cumleden olustugu kullanicaya soylenir ve kac karakterden olustuguda yine kullaniciya soylenebilir.



    }
}
