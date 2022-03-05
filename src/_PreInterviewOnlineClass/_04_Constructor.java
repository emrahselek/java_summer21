package _PreInterviewOnlineClass;

public class _04_Constructor {

    public static void main(String[] args) {
        /**
         * Nasil bir insaati yapmak icin constructor(isci) ihtiyacimiz varsa,
           nesne olusturmak icinde const. ihtiyacimiz var.
         * Javada bir nesne olusturulurken kullanilan yapilar constructordur.
         * Her class'in default constructor'u vardir.
         *


         Constructor: Class ile ayni isimde olmak zorunda,
         ornegi ->  CarDesign honda = new CarDesign();

         CarDesign   -> Class Name
         honda       -> Nesene Adi
         CarDesign() -> Constructor

         */
        Book book = new Book();
        System.out.println(book.bookName);

        Pen emty = new Pen();
        Pen one = new Pen(321);
        Pen two = new Pen("NoNo",888);
        System.out.println(two.made);
        System.out.println(emty.made);

    }

}

class Book{
    //Her class'in default constructor'i vardir. Ornegi: Book classi gibi. Burda constructor gizlidir. Like " public book (){} "
    int bookprice=100;
    String bookName="Noone";
}

class Pen{
    //Kendimiz constructor olusturabiliriz biliriz. Ve defaul const. otomatikmen iptal olur.
    //Iki tur constructor var: Parametli ve parametsiz.

    String made = "An221";
    int price=100;

    //parametsiz const.
    public Pen(){
        made="harmex";
    }

    //Parametreli const.
    public Pen(int number){
        price=number;
    }

    public Pen(String name, int num){
        price=num;
        made=name;
    }


}

class MethodAndConstructor extends Exto{
    /**
     Arasindaki farklar:
     1- Constructor clas ismiyle ayni olmak zorunda, ama method degil. Method istedigi ismi alabilir.
     2- Const.'da return type yoktur. Ama method'da olmak zorunda(enkotu void kullaniri:D).
     3- Const. inheritance olamaz. Yani baska class'dan miras alamiyoruz. Amam methodlar miras alinabilir.
     4- Inheritancede constructor'i cagirmak icin super() kullaniriz. ama method'da kullanamayiz super().
     */
    public MethodAndConstructor(){
        //Constructor
        super(1);
    }
    public int motorPen(){
        //Method
        return 10;
    }
}

class Exto{
    public Exto(){
    }
    public Exto(int numExton){
        numExton=10;
    }
}