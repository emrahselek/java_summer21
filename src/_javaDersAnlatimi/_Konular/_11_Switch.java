package _javaDersAnlatimi._Konular;

public class _11_Switch {
    //switch case ihtimallerin belirli oldugu durumlarda kullanilir. Ihtimallerin belirli olmadi durumlarda
    // if else kullanilir. Durumlar belli oldugu icin kosul diye bir sey yoktur switchte. Durum bu ise calis
    // durum bu degilse calisma durumudur.
    //
    public static void main(String[] args) {
        int gun = 5;
        //if kullanirsak
//        if ( gun ==1){
//            System.out.println("Pazartesi");
//        }else if (gun ==2){
//            System.out.println("sali");
//        }else if (gun ==3){
//            System.out.println("carsamba");
//        }else if (gun ==4){
//            System.out.println("persembe");
//        }else if (gun ==5){
//            System.out.println("cuma");
//        }else if (gun ==6){
//            System.out.println("cumartesi");
//        }else if (gun ==7){
//            System.out.println("pazar");
//        }
//
        switch (gun){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlis sayi");
        }
    }
}
