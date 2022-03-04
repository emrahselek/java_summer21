package techpro.day23_w7_ahmt_stringbuilders;

public class X1_StringBuilder01 {

	public static void main(String[] args) {
						
		// How to create a string by using " stringBuilder class"
		
		// 1.way:
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);//empty   
		//System.out.println(sb.capacity());//default value 16
		sb.append("Ali");// append means adding
		System.out.println(sb);//Ali
		sb.append(" is a friend of Veli");
		System.out.println(sb);
		System.out.println("======");
		
//		String str="Veli";
//		System.out.println(str);;//Veli
//		str.toUpperCase();
//		System.out.println(str);// still "Veli"
//		System.out.println(str.toUpperCase());// VELI 
		
		// 2.way:
		StringBuilder sb1 =new StringBuilder("Veli is not my friend");
		System.out.println(sb1);//Veli is not my friend
		sb1.append(" and I do not know him.:)");
		System.out.println(sb1); //Veli is not my friend and I do not know him.:)
				
		// 3.way:
		StringBuilder sb2 = new StringBuilder(5);// capacity
		sb2.append("Javaxwwv");
		System.out.println(sb2);//Javaxwwv
		System.out.println(sb2.capacity());// 12
		System.out.println(sb2.length()); // 5
				
		//1.way: StringBuilder Methods append() in chain
		StringBuilder sb3 = new StringBuilder("Java");
		sb3.append('q').append('w').append('e');
		System.out.println(sb3);//Javaqwe
		// 2.way: If you want to add some of characters from a string we use the following method
		sb3.append("ahmet", 1, 3);
		System.out.println(sb3);//Javaqwehm
		
		
		// The index of the desired char value
		System.out.println(sb3.charAt(5));//w
		
		// How to delete
		sb3.delete(4, 6);// 4=including but 6=excluding
		System.out.println(sb3);//Javaehm
		sb3.deleteCharAt(0);
		System.out.println(sb3);//avaehm
		
		
	}

}
