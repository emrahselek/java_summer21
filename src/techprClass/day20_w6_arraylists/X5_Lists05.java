package techprClass.day20_w6_arraylists;

import java.util.ArrayList;
import java.util.List;

public class X5_Lists05 {

	
    /*
    
    1-) please write a method which adds * to th eall elements
        List<String> str  = new ArrayList<>();
        str.add("aa");
        str.add("bab");
        str.add("ab");
        str.add("ac");
        
    2-) Given a list of integers, return a list where each integer is multiplied with itself.   
       
    3-) please create a method which multiplies all the elements by itself and then call it from the main method
     
         
        
      */

		public static void main(String[] args) {
	        List<String> str  = new ArrayList<>();
	        str.add("aa");
	        str.add("bab");
	        str.add("ab");
	        str.add("ac");
	        
	        addingStarAtTheEnd(str);
	        List<Integer> list1 = new ArrayList<>();
	        list1.add(2);
	        list1.add(3);
	        list1.add(6);
	        list1.add(8);
	        list1.add(7);
	        multiplyTheNumberByItself(list1);
	      
	    }
	    public static void addingStarAtTheEnd(List<String>list){
	        for(int i=0; i<list.size();i++){
	            list.set(i,list.get(i)+"* ");
	        }
	        System.out.println(list);
	    }
	    
	    public static void multiplyTheNumberByItself(List<Integer>list){
	        for(int i=0; i<list.size();i++){
	            list.set(i,list.get(i)*list.get(i));
	        }
	        System.out.println(list);

		
		
	}

}
