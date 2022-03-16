package _Course_preInterview_Hamza;

public class _13_AccessModifiers {

    /**
     * private      ->      Class
     * default      ->      Class   Package
     * protected    ->      Class   Package    SubClass
     * public       ->      GLOBAL

     */

    private int sayiPrivate=10;
    int sayiDefault = 10;
    protected int sayiProtected = 10;// Baska package de extend yaparak kullanabiliyoruz
    public int sayiPublic = 10;

}

class other{
    public static void main(String[] args) {
        _13_AccessModifiers ooo = new _13_AccessModifiers();
        System.out.println(ooo.sayiDefault);
        System.out.println(ooo.sayiProtected);
        System.out.println(ooo.sayiPublic);
    }
}
