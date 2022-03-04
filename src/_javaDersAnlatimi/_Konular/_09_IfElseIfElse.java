package _javaDersAnlatimi._Konular;

public class _09_IfElseIfElse {
    public static void main(String[] args) {

        int sayi = 0;

        if(sayi > 0){
            System.out.println("Sayi pozitif");
        }else if ( sayi < 0){
            System.out.println("Sayi negatif");
        }else{
            System.out.println("Sayi sifira esit");
        }
        String gun = "Cuma";
        if ( gun.equals("Pazar")){
            System.out.println("Pazar gunundesiniz");
        }else if (gun.equals("Cumartesi")){
            System.out.println("Cumartesi gunundesiniz");
        }else {
            System.out.println("Hafta icindesiniz");
        }
    }
}
