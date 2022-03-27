package emrah_study;

public class pr {
    public static void main(String[] args) {
        String str = "nurses run";
        System.out.println(str);
        str.replace(" ", "").toLowerCase();
        System.out.println(str);// "nurses run"
        // When println str String, It is nothing change here. String is an immutable for security.

        str = str.replace(" ", "").toLowerCase();
        System.out.println(str);// But here, we assign new value for str String


    }

}



