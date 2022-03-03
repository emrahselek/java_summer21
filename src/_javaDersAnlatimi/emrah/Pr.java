package _javaDersAnlatimi.emrah;

public class Pr {
    //Leap Year: feb 29, it is leap lear
    //1) if year divide by 100, then must be divided by 400
    //2) if year doesn't divide by 100, then must be divided by 4

    public static void main(String[] args) {

        int year = 2003;

        if(year%100==0 && year%400==0){
            System.out.println("leap year");
        }else if(year%100!=0 && year%4==0){
            System.out.println("leap year");
        }else {
            System.out.println("Not leap year");
        }
    }

}