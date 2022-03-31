package emrah_study;

public class Pr {

    public static void main(String[] args) {
        String str="man who man 654654 dick";
        System.out.println(reverseLetter(str));

    }
    static boolean isAlphabet(char char1){
        return(char1>='a' && char1<='z' || char1>='A' && char1<='Z');
    }

    static String reverseLetter(String s){
        int i=0;
        int j=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while (i<=j){
            if (!isAlphabet(s.charAt(i))){
                i++;
                continue;
            }else if (!isAlphabet(s.charAt(j))){
                j--;
                continue;
            }else {
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j,s.charAt(i));
            }
            i++;
            j--;
        }
        return sb.toString();
    }
}