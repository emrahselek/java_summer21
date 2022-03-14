package PreInterOnlineClass.pr;

public class Main {

    public static void main(String[] args) {
        OzClass nesne = new OzClass();
        System.out.println(nesne.NonStaticVariable);
        System.out.println(OzClass.staticVariable);

        nesne.NonStaticMethod();
        OzClass.staticMethod();


    }

}
