package javaDersAnlatimi.suleymanInterview;

/*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	*/

import java.util.*;

public class RemoveDupList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list elemant and stop enter press '*' ");

        String str = "";
        List<String> list = new ArrayList<>();

        while (!str.equals("*")){
            str = sc.nextLine();
            if ( !str.equals("*")){
                list.add(str);
            }
        }
        System.out.println(list);

        //Duplicati engellemek icin hashset kullaniliyor.
        Set<String> list2 = new HashSet<>(list);
        System.out.println(list2);
    }

}
