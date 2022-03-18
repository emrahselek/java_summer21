package _Course_preInterview_Hamza;

public class _01_JDK_JRE_JVM {

    public static void main(String[] args) {

        /**
         JVM (Java Virtual Machine) converts the java code into bytecode(011010110).
         JRE (Java Runtime Environment) provides JVM + Library. Java code execute here.
         JDK (Java Development Kit) provides JRE + compiler + debugger. JDK is used to develop java software.
         JDK = JRE + compiler + debugger...... JDK(JRE(JVM))
         */

        // Java read the code from left to right and up to down
        System.out.println(10 + 50 + 20);//80
        System.out.println(10 + 30 + "best");//40best
        System.out.println("best" + 10 + 30);//best1030
        System.out.println("best" + (10 + 30));//best40

        // But here before times and divide operation.
        System.out.println(10 * 40 + "best");//400best
        System.out.println("best" + 10 * 40);//best400
        System.out.println("best" + (10 * 40));//best400

        String mn = "best" + 20 + 30 + "cool";//best2030cool
        String mx = "best" + (20 + 30) + "cool";//best50cool
        System.out.println(mn);
        System.out.println(mx);


    }

}

