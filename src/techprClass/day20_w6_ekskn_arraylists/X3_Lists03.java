
package techprClass.day20_w6_ekskn_arraylists;
import java.util.ArrayList;
import java.util.List;

		public class X3_Lists03 {
		    public static void main(String[] args) {
		        /*
		         * Create a method to delete odd elements and multiply even elements by 3 from the list
		         */
		        List<Integer> list1 = new ArrayList<>();
		        List<Integer> listnew = new ArrayList<>();
		        listnew.add(3);
		        listnew.add(6);
		        listnew.add(7);
		        listnew.add(8);
		        listnew.add(11);
		        
		        list1.add(2);
		        list1.add(3);
		        list1.add(6);
		        list1.add(8);
		        list1.add(7);
		        
		        multiplyEvenNumbersByThree(list1);
		        multiplyEvenNumbersByThree(listnew);
		    }
		    
		    public static void multiplyEvenNumbersByThree(List<Integer>list) {
		        for(int i=0; i<list.size();i++) {
		            if(list.get(i)%2!=0) {
		                list.remove(i);
		                i--;
		            }else {
		                list.set(i, list.get(i)*3);
		            }
		        }System.out.println(list);
		    }
		}