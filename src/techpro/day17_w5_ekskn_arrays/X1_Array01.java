package techpro.day17_w5_ekskn_arrays;

import java.util.Arrays;

public class X1_Array01 {
    
    /*
     * we use arrays to store multiple elements in to the same container
     * we can store just same data types into the same array
     * we can use just primitive data types theoretically
     * but array itself is non primitive 
     * arrays store inside heap memory
     * we reach elements by using index
     */
	
    public static void main(String[] args) {
        
        //How to create an array==> datatype + arrayname + [] = new + datatype + [size of array] ; 
        int arr[]= new int [5];
         
        //adding elements into the array
        arr[0]=3;
        arr[1]=2;
        arr[2]=4;
        arr[3]=9;
        arr[4]=7;
        
        //how to print an array
        System.out.println(Arrays.toString(arr));
                
        //how to print a specific index
        System.out.println(arr[1]);
        System.out.println(arr[3]);
        //we get indexoutofboundexception if we put a number greater than the arrays' size
        //System.out.println(arr[5]);
        
        
        //how to get number of elements inside an array
        //do nt mix it with the method of Length() that we used for string
        System.out.println("the number of the elements inside the array is: "+arr.length);
        
      
    }
}