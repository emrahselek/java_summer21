package day19_w6_ekskn_arraylists;

import java.util.ArrayList;

public class X4_Lists04 {

	public static void main(String[] args) {
				
		/*
		  Please create an Integer ArrayList
          add the numbers : 3, 45, 12, 3, 6, 45, 7, 8
          print your list
          remove the repeated elements from your list
          please print the unique list 
		 */
		
		//1.way:
		ArrayList<Integer> list0 = new ArrayList<>();
		list0.add(3);
		list0.add(45);
		list0.add(12);
		list0.add(3);
		list0.add(6);
		list0.add(45);
		list0.add(7);
		list0.add(8);
		System.out.println("before removing duplicate elements: " +list0);
		
		ArrayList<Integer> listUnique = new ArrayList<>();
		
		for(int i=0; i<list0.size(); i++) {
			if(!listUnique.contains(list0.get(i))) {
				listUnique.add(list0.get(i));
			}else {
				continue;
			}
		}
		System.out.println("after removing duplicate elements: " +listUnique);
		
		
		// 2.way:
		
		
		
		
		
		
		
	}

}
