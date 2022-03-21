package emrah_study;

public class pr {
    public static void main(String[] args) {

        int[] array = {1, 555, 8, 7, 54, 98, 454, 1020};
        int firstMaxNumber = 0;
        int secondMaxNumber = 0;

        for (int i : array){
            if (i>firstMaxNumber){
                secondMaxNumber=firstMaxNumber;
                firstMaxNumber=i;
            } else if (i>secondMaxNumber) {
                secondMaxNumber=i;
            }
        }
        System.out.println(firstMaxNumber);
        System.out.println(secondMaxNumber);
    }
}

