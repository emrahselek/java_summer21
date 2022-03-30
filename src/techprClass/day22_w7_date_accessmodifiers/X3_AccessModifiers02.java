package techprClass.day22_w7_date_accessmodifiers;

import techprClass.day20_w6_arraylists.AccessModifiers03;

public class X3_AccessModifiers02 {

	public static void main(String[] args) {
		
		/*To access any class member from another class there are 2 ways
		 * 1-'Call by class name' =>static must be used 
		 * 2- By object
		 * 
		 2-if a class member is private, we cannot access it from different class. 
		 
		 */
			
		X2_AccessModifiers01 obj1 = new X2_AccessModifiers01();
		
		System.out.println(obj1.name);
		
		System.out.println(obj1.schoolName);
		
		AccessModifiers03 obj2 = new AccessModifiers03();//techpro.day20_w6_ekskn_arraylists
		
		System.out.println(obj2.lName);
			
	}

}