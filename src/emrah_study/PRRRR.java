package emrah_study;

public class PRRRR {

    public static String xPublic="public";
    static String xDefault="defaul";
    protected static String xProtected="protected";
    private static String xPrivate="private";


    public static void main(String[] args) {
        System.out.println(xPublic);
        System.out.println(xDefault);
        System.out.println(xProtected);
        System.out.println(xPrivate);
    }

}
class Yeni{
    public static void main(String[] args) {
        System.out.println(PRRRR.xPublic);
        System.out.println(PRRRR.xDefault);
        System.out.println(PRRRR.xProtected);
    }
}
