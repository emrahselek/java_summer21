package _javaDersAnlatimi._Konular;

public class _08_IfElse {
    public static void main(String[] args) {
        //Eger bir kosul gerceklesiyorsa if kod blogunun icerisini calistir aksi durumda else bolumunun icerisini
        //calistir.
        int sayi = 100;

        if(sayi >= 50){
            System.out.println("sayi 50ye esit ya da buyuk");
        }else {
            System.out.println("sayi 50den kucuktur");
        }

        String cinsiyet = "Erkek";
        int yas = 15;

        if (cinsiyet.equals("Erkek")){
            if (yas >=20 ){
                System.out.println("Askere gidebilirsiniz");
            }else {
                System.out.println("Yasiniz tutmadigi icin gidemezsiniz");
            }
        }else {
            System.out.println("Cinsiyetiniz kadin oldugu icin gidemezsiniz.");
        }

    }
}
