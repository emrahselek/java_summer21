package javainterviewcodequestions;

import java.util.*;

public class InterviewQuestion08_Array_RemoveDuplicated {
	
	/*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter list elements, to stop entrance press '*'");
		
		String str = "";
		List<String> list = new ArrayList<String>();
		
		while(!str.equals("*")) {
			str = scan.next();
			if(!str.equals("*")) {
				list.add(str);
			}
		}
		System.out.println(list);

		//If they ask you to remove duplicated elements from a collection tell them I convert
		//the collection to set
		Set<String> listSet = new HashSet<>(list);
		Set<String> lis1 = new LinkedHashSet<>(list);
		
		System.out.println(listSet);
		System.out.println(lis1);
		
		scan.close();

	}

}
