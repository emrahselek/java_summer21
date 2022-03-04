package _javaDersAnlatimi._Konular;

public class _18_forEach {
    public static void main(String[] args) {
        //for each aslinda for loopun ta kendisi ama kullanim olarak bir cok noktadan avantaj sagliyor bizi degisken olulsturmak
        // indexin degerinin arttirip azaltman kurtarir. Bize sadece o liste icerisindeki datalari bize direk veren bir yapidir.
        //eger bir index ile array icersindeki o andataki bulundugumuz sira index ile bir isimiz yoksa sadece amacimiz o liste icerisindeki
        //verileri teker teker alip kullanmaksa ozaman for each i kullanmak tercih edilir.
        //for each icinde kullanilacak olan data tipi arrayin data tipi ile ayni olmak zorundadir.
       /*
            for ( data tipi isim : liste ){
                calistirilacak kodlar
            }
       */
        String[] isimler = {"Ali", "Veli", "Selami"};

        //while ?
        //for ?
        // for (int i = 0; i < isimler.length; i++) {
        //     System.out.println(isimler[i]);
        // }
        // System.out.println();


        for (String e : isimler) {
            System.out.println(e);
        }


    }
}
