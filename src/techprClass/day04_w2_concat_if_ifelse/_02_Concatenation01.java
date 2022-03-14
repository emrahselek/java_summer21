package techprClass.day04_w2_concat_if_ifelse;

public class _02_Concatenation01 {

	public static void main(String[] args) {
		
		/*
		 Concatenation is used to join 2 Strings
		 */

		String fn1="Ali";
		String ln1="Can";
		System.out.println(fn1 + " " +ln1); //System.out.println("space");
		
		String fname="Eddy";
		String lname="Cool";
		System.out.println(fname + " " + lname);
		
		System.out.println(fname + 6 + 5);//Eddy65
		System.out.println(fname+ (6+5)); //Eddy11
		System.out.println(5+ fname+ (6*5));//5Eddy30
		
		
		// Homework==> using following variables print 61Study-1 on the console
				int numA = 2;
				int numB = 3;
				String str1 = "Study";
		System.out.println((numA*numB)+""+(numB-numA)+str1+(numB-numA));

	}

}
