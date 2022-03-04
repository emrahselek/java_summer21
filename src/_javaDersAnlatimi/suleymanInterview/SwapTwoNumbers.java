package _javaDersAnlatimi.suleymanInterview;

//Write a Java Program to swap two numbers

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 22;

        System.out.println("Before number : " + n1 + " - " + n2);

        //1.Wat use 3rd variable
        int temp = 0;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After number : " + n1 + " - " + n2);

        //2.way do not use 3rd variable
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After number : " + n1 + " - " + n2);

    }

}
