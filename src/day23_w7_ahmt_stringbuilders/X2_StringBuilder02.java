package day23_w7_ahmt_stringbuilders;

public class X2_StringBuilder02 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java123");
		StringBuilder sb2 = new StringBuilder("Java123");
		
		// how to compare?
		// StringBuilder equal method is not the same as String equal() method.
		// we can get true if we compare same object.
				
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb1.indexOf("1"));//4
		System.out.println(sb1.indexOf("a"));//1
		System.out.println(sb1);//Java123
		sb1.insert(3, "OX");
		System.out.println(sb1);//JavOXa123
		sb1.insert(1, "CCTYEWCC" , 2, 5);
		System.out.println(sb1);//JTYEavOXa123
				
		// Use reverse method to reverse a string
		sb1.reverse();
		System.out.println(sb1);//321aXOvaEYTJ
		sb1.replace(0, 3, "***");
        System.out.println(sb1);//***aXQvaEYTJ
        sb1.setCharAt(0, '9');
        System.out.println(sb1); // 9**XQvaEYTJ
        sb1.trimToSize();// reduce the storage to the size of the String
		
		
	}

}
