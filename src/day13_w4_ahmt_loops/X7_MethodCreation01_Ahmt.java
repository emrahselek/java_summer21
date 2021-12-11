package day13_w4_ahmt_loops;

//Tech.: Ahmet

public class X7_MethodCreation01_Ahmt {

    public static void main(String[] args) {
       
        System.out.println(findSum(5,8));
        System.out.println(findSum(10,25));
        System.out.println(findProduct(2,5,8));
        System.out.println(findProduct(5,10,12));
     }
        
     // to run the method that we just typed, call it from main method
   
    public static int findSum(int a , int b) {
        return a+b; // when use 'void' in method, means don't need write "return". 
    }
    
    
    //we can create methods with multiple variables 
    public static int findProduct(int x, int y , int z) {
            
        return x*y*z;
    }
    
}
