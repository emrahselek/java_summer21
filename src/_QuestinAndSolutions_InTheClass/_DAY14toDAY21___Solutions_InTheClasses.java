package _QuestinAndSolutions_InTheClass;

public class _DAY14toDAY21___Solutions_InTheClasses {

public static void main(String[] args) {
		
		
/*

  
===day17===============>
1) 		double a[]= {12.1, 11.0, 13.5, 11.2, 2.4, 4.1};
		
		double sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
 
 
2)  ????????



3)		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array to create an integer array...");
		int len = scanner.nextInt();
		int arr[] = new int[len];
		int numOfEl = 1;
		
		do {			
			System.out.println("Enter " + numOfEl + ". element");		
			arr[numOfEl - 1] = scanner.nextInt();
			numOfEl++;	
		}while(numOfEl<=len);
		System.out.println("Array before sort: " + Arrays.toString(arr))
		
		Arrays.sort(arr);
		System.out.println("Array after sort: " + Arrays.toString(arr));//[11, 12, 13]
		System.out.println("Minimum Element: " + arr[0]);
		System.out.println("Maximum Element: " + arr[arr.length-1]);
		System.out.println("Array before sort: " + Arrays.toString(brr));
 
 
4) 		int arr[] = {11, 21, 32};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];	
		}
		System.out.println(sum);
		
		
		
5) 		//1.Way: It works but not recommended because the number of scenarios is too much
		if(s5.startsWith("a") && s5.endsWith("a")) {
			System.out.println("--> " + (arr.length));
		}else if(s5.startsWith("a") && !s5.endsWith("a")) {
			System.out.println("))))> " + (arr.length - 1));
		}else if(!s5.startsWith("a") && !s5.endsWith("a")) {
			System.out.println("==> " + (arr.length - 1));
		}else if(!s5.startsWith("a") && s5.endsWith("a")){
			System.out.println("***>" + arr.length);
		}
		
		//2.Way: Number of all characters before removing "a"s - number of all characters after removing "a"s = Result
		//String s5 = "Mama may I go to Alabama";	
		String a1[] = s5.split("");
		String a2[] = s5.replace("a", "").split("");
		System.out.println("Second way: " + (a1.length-a2.length));//6
		
		//3.Way: Use loops
		int count = 0;		
		for(int i=0; i<s5.length(); i++) {
			if(s5.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("Third way: " + count);
				
		//4.Way: Use regex to remove all characters except "a"
		System.out.println("Fourth way: " + s5.replaceAll("[^a]", "").length());
		
 
 
6) 		int crr[][] = { {2}, {12, 13, 14, 10}, {3, 7} };
	
		int sum = 0; 
		
		for(int i=0; i< crr.length;            i++) {
			
			for(int k=0; k<crr[i].length;      k++) {
				
				sum = sum + crr[i][k];
			}		
		}	
		
		System.out.println(sum);
 
 
7) 		int arr[][] = { {1,2}, {3,4,5}, {6} };
		
		int brr[][] = { {7,8,9}, {10,11} };
		
		int outerLen = arr.length < brr.length ? arr.length : brr.length;
		
		int sum = 0;
		
		for(int i=0; i<outerLen; i++) {
			
			int innerLen = arr[i].length < brr[i].length ? arr[i].length : brr[i].length;
			
			for(int k=0; k<innerLen; k++){
	
				sum = sum + arr[i][k] + brr[i][k];
				
			}
			
		}
		
		System.out.println(sum);
		
		
		
8)		int arr[][] = { {1,2}, {3,4,5}, {6, 7, 9, 10} };
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum = sum + arr[i].length;
		}
		
		System.out.println(sum);
		
		int brr[] = new int[sum];
		
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int k=0; k<arr[i].length; k++) {
				
				brr[idx] = arr[i][k];
				
				idx++;
				
			}
		}
		
		System.out.println(Arrays.toString(brr));
		
		
9)		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a letter");
		char c = scan.next().charAt(0); //char c = scan.next().toUpperCase.charAt(0);
		System.out.println(list1);
		
		if(list1.contains(c)) {
			list1.set(list1.indexOf(c), '$');
		}else {
			list1.add(c);
		}
		System.out.println(list1);
		
 
 
10)		//1.way:
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



11)		public static void main(String[] args) {
	
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        
        increaseByTwo(list);
    }
    public static void increaseByTwo(List<Integer>list) {
        for(int i =0; i<list.size();i++) {
            list.set(i, list.get(i)+2);
        }
        System.out.println(list);
    } 



12)		package day20_w6_ekskn_arraylists;
		import java.util.ArrayList;
		import java.util.List;

		public class X3_Lists03 {
		    public static void main(String[] args) {
		      
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
 
  
 
 
 */
		
		
		
	}

}
