package emrah_study;

public class Day08_ReverseString {

//Write a Java Program to reverse a string

        public static void main(String[] args) {
            String str = "Java easy!";

            //1.Way using Stringbuilder
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            System.out.println("Using StringBuilder : " + stringBuilder.reverse());

            //2.Way using StringBuffer
            StringBuffer stringBuffer = new StringBuffer();
            System.out.println(str);
            System.out.println("Using StringBuffer : " + stringBuffer.reverse());

            //3.Way using for
            String rev = "";
            for (int i = str.length()-1; i >=0 ; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println("Using for loop : " + rev);

            //4.Way calling method
            revString(str);

        }
        public static String revString (String str){
            String rev= "";
            for (int i = str.length()-1; i >=0 ; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println("Using method : " + str);
            return rev;
        }
    }
