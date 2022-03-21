package _Course_preInterview_Hamza;

public class _43_Question_BinarySearch {
    public static void main(String[] args) {
        int[] array = {2,7,9,15,20,22,25,30,40};
        int index = binarySearch(array, 7);//aradigimiz sayi: 25, index de bize aradigimiz sayinin indexsini vercek
        System.out.println("Bulunan index: " + index);
    }

    private static int binarySearch(int[] array, int sayi) {
        int sol = 0;
        int sag = array.length - 1;
        int orta = (sol + sag) / 2;

        while (sol <= sag) {
            if (array[orta] < sayi) {
                sol = orta + 1;
            } else if (array[orta] == sayi) {
                return orta;
            } else if (array[orta] > sayi) {
                sag = orta + 1;
            }
            orta = (sag + sol) / 2;
        }
        return -1;
    }
}