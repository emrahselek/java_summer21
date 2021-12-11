package day19_w6_ekskn_arraylists;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class X1_Lists01 {

	public static void main(String[] args) {
		
		/*
		 * arraylist is resizable,
		 * we can store nonprimitives,
		 * we can not store multiple data types.
		 */
		
		
		//create an arraylist:
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
             List<Integer> list3 = new ArrayList<Integer>();
        //Scanner scan = new Scanner(System.in);
        
        //add elements
        list1.add(33);
        list1.add(4);
        list1.add(7);
        list1.add(6);
        list1.add(1);
        list1.add(12);
        list1.add(27);
        
        //how to print all elements
        System.out.println(list1);
                
        //how to add elements into specific index
        list1.add(3, 8);
        System.out.println("after adding 8 into index 3rd: "+list1);
        
        //How to sort ArrayList ascending order
        Collections.sort(list1);
        System.out.println("after sorting:"+list1);
        
        //How to sort an arraylist in descending order
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("sorting in descending order: "+list1);
        
        //How to print specific element from ArrayList
        System.out.println(list1.get(2));
        System.out.println(list1.get(5));
        
        //How to get number of elements inside an ArrayList
        System.out.println("the number of the elements: " + list1.size());
       
        
        /* 
         Queastion:
          	Create listnum and,
        	add the numbers "17,23, 11,17,3,5,8,-5,-3"
        	Please find and print the min and max elements in the list
        */
       
        ArrayList<Integer> listnum = new ArrayList<>();
        listnum.add(17);
        listnum.add(23);
        listnum.add(11);
        listnum.add(17);
        listnum.add(3);
        listnum.add(5);
        listnum.add(8);
        listnum.add(-5);
        listnum.add(-3);
        
        Collections.sort(listnum);
        System.out.println(listnum);
        System.out.println("minimum: "+listnum.get(0));
        System.out.println("maximum: "+listnum.get(listnum.size()-1));
        
        
	}

}
