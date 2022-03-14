package javaDersAnlatimi.suleymanInterview;

public class Palindrome {
    public static void main(String[] args) {
        String str = "nurses run";
        str = str.replace(" ", "").toLowerCase();
        String rverse = "";


        for( int i=str.length()-1; i >= 0; i-- ){
            rverse = rverse + str.charAt(i);
        }
        if ( str.equals(rverse)){
            System.out.println(str + " is a palindrome");
        }else {
            System.out.println(str + " is a not palindrome");
        }
    }
}
