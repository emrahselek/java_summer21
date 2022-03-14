package emrah;

public class Day03_LeapYear {

    public static void main(String[] args){

        //Leap Year: feb 29, it is leap lear
        //1) if year divide by 100, then must be divided by 400
        //2) if year doesn't divide by 100, then must be divided by 4

        int year=2000;

        if(year%100==0 && year%400==0) {
            System.out.println(year + " is a leap year");
        }else if(year%100!=0 && year%4==0) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not leap year");
        }
    }

}
