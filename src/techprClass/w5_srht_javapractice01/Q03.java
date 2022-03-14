package techprClass.w5_srht_javapractice01;

public class Q03 {

	public static void main(String[] args) {
		
		/*
		    create 3 char variables then print A L I on the console using
	        String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    */
		
		//1.way
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(str.charAt(0)+" "+str.charAt(11)+" "+str.charAt(8));
		
		
		//2.way
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char a = abc.charAt(0);
		char b = abc.charAt(11);
		char c = abc.charAt(8);
		
		System.out.println(a + " " + b + " " + c);
		
	}

}
