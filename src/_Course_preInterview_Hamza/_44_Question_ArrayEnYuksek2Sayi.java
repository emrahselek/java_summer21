package _Course_preInterview_Hamza;
/*
    Array icerisindeki en yuksek iki sayiyi bulan java kodu yaziniz.
 */
public class _44_Question_ArrayEnYuksek2Sayi {
    public static void main(String[] args) {
        int[] array = { 2,7,10,50,15,1};

        int enYuksekSayi = 0;
        int enYuksekSati2 = 0;

        for (int i : array){
            if(i>enYuksekSayi){
                enYuksekSati2=enYuksekSayi;
                enYuksekSayi=i;
            }else if(i> enYuksekSati2){
                enYuksekSati2=i;
            }
        }
        System.out.println(enYuksekSayi);
        System.out.println(enYuksekSati2);
    }
}