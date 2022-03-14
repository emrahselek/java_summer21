package javaDersAnlatimi.suleymanInterview;


import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class RandomArray {

    public static void main(String[] args) {
        
        Integer [] arr = {1,2,3,4,5};

        List<Integer> arrList = Arrays.asList(arr);

        Random rand = new Random();

        int radIdx1 = rand.nextInt(5);
        int radIdx2 = rand.nextInt(5);

        if (radIdx1 == radIdx2){
            radIdx2 = rand.nextInt(5);
        }
        System.out.println(arrList);

        int temp = arrList.get(radIdx1);
        arrList.set(radIdx1, arrList.get(radIdx2));
        arrList.set(radIdx2, temp);

        System.out.println(arrList);

        if (Math.abs(arrList.indexOf(arrList.get(radIdx1))- arrList.indexOf(arrList.get(radIdx2)))==1){
            System.out.println("You can bride");
        }else {
            System.out.println("You cannot bride");
        }

        
    }
    
}
