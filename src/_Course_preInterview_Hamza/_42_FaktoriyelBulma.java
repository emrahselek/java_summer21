package _Course_preInterview_Hamza;

public class _42_FaktoriyelBulma {
    /*
         6 -> 6*5*4*3*2*1 = 720
     */
    public static void main(String[] args) {
        int faktoriyel = 1;
        int sayi = 6;

        for (int i=1; i<=sayi; i++){ // 1 2 3 4 5 6
            faktoriyel = faktoriyel * i ;
        }
        System.out.println(faktoriyel);

        //2.way:
        System.out.println(faktor(5));
    }

    //Method icinde method cagirma.
    public static int faktor(int i){
        if (i==1)
            return 1;
        else
            return (i*faktor(i-1));
    }
}

