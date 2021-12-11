package day17_w5_ekskn_arrays;

import java.util.Arrays;

public class X2_Array02 {

	public static void main(String[] args) {
				
		String eray []= new String[6];
		eray[0]="bahar";
		eray[1]="halil";
		eray[2]="nur";
		eray[3]="selen";
		eray[4]="zeki";
		
		System.out.println(Arrays.toString(eray));
		
		
		//print all elements one by one
		//1.way:
		System.out.println(eray[0]);
		System.out.println(eray[2]);
		System.out.println(eray[3]);
		System.out.println(eray[4]);
		System.out.println(eray[5]);
		System.out.println("=========");
		
		
		//2.way:
		System.out.println("By use for loop");
//		for(int i=0; i<6; i++) {
//			System.out.println(eray[i]);
//		}
		
		for(int i=0; i<eray.length; i++) {
			System.out.println(eray[i]);
		}
		System.out.println("---------");
		
		
		/*
        1)Create a double array whose length is 6
        2)Type a program to add all elements inside the array
        3)Print the sum on the console.
        */
		
		//we can also add elements directly into our array
		double a[]= {12.1, 11.0, 13.5, 11.2, 2.4, 4.1};
		
		double sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		
	}

}
