package emrah_study;

public class Day02_PrimeNumber {

        public static void main(String[] args) {
            /**
             Prime number is divided by 1 and itself. and just positive whole number.
             Prime Numbbe = Mutlak sayi

             #Conditions:
             must be bigger than 0,
             not zero,
             not negative number,
             0 is PN,
             just divide by 1 and itself

            */

            int mynumber= 10;
            int mycount=0;

            for(int i=2; i<mynumber; i++){
                if(mynumber % i == 0){
                    mycount++;
                }
            }

            if(mynumber<=0){
                System.out.println(mynumber + " is NOT Prime number");
            }else if(mynumber==1 || mycount==0){
                System.out.println(mynumber + " is prime number");
            }else  {
                System.out.println(mynumber + " is NOT Prime number");
            }
        }
    }





