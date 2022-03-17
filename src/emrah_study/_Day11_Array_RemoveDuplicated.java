package emrah_study;
import java.util.*;
public class _Day11_Array_RemoveDuplicated {
	/*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter list elements, to stop entrance press '*'");

		String str = "";
		List<String> list = new ArrayList<>();
//		ArrayList<String> list2 = new ArrayList<>();
//		ArrayList<String> list3 = new ArrayList<String>();

		while(!str.equals("*")) {
			str = scan.next();
			if (!str.equals("*")) {
				list.add(str);
			}
		}
		System.out.println(list);

		Set<String> listSet = new HashSet<>(list);
		System.out.println(listSet);

//		Set<String> lis1 = new LinkedHashSet<>(list);// with sorted
//		System.out.println(lis1);
		scan.close();
	}
}