package javaDersAnlatimi._Konular;

public class _36_LocalveInstance {
    /*
        Local ve Instance Degiskenler ( Variables )
        Bir class icerisindeki her taraftan erisiebilen degiskenler instance variables olarak degerlendirilir.
        bir degiskeni herhangi bir method icerisinde kullanabilirsem instance variable olarak geciyor. Instance
        variablelar class'a ait olurlar.

        Local degiskenler ise class'a ait olmayan herhangi bir method icerisinde olan olusturulan degiskenlerdir.
        Sadece bulundugu methoda ait.

        Method icerisindeki parametre Local degiskendir.

     */

    public static void main(String[] args) {


    }
}

class Araba10{

    int hiz = 200;          //--> Instance variable
    String renk = "Siyah";  //--> Instance variable



    public void bilgiYazdir (){
        String isim = "Toyota"; //--> local variable
        System.out.println(hiz);
        System.out.println(renk);
    }

    public void deneme (int sayi){
        System.out.println(hiz);
        System.out.println(renk);
    }

}
