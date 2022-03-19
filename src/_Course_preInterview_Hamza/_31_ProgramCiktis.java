package _Course_preInterview_Hamza;

public class _31_ProgramCiktis {
    public static void main(String[] args) {
        int x=4;
        /**
         System.out.println(x++);//4
         System.out.println(++x);//6
         System.out.println(x--);//6
         System.out.println(--x);//4
         */

        System.out.println(x++);//Sadece x degeri yazdirilir. Burda once x 'i yazdir. daha sonra arttir.
        System.out.println(x);
        System.out.println(++x);//Once arttir sonra X 'i yazdir
        System.out.println(x--);//Sadece x yazdir, daha sonra azalt. ama arttirilmis degeri yazma.
        System.out.println(--x);//azaltilmis degeri yaz. once azalt sonra yaz.
    }
}
