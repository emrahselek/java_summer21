package emrah_study;

public class _05_Review {

    public static void main(String[] args){
        palindrome();
        primNumber();
        leapYear();

    }

    public static void palindrome() {
        String str = "madam";

        String rvr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rvr = rvr + str.charAt(i);
        }

        if (str.equals(rvr)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static void primNumber(){
        int number=10;

        int count=0;
        for(int i=2; i<number; i++){
            if (number%i==0) {
                count++;
            }
        }
        if(number<=0) {
            System.out.println("prime number");
        }else if(number==1 || count==0){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }

    public static void leapYear() {
        int year = 2000;

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("leap year");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }

}
