package techpro.day16_w5_ekskn_statickeyword;


public class X1_Students {
    
    String name;
    static String id;
    int grade;
    int year;
    static int counter =1000;
    
    public X1_Students(String name, int grade, int year) {
        
        this.name = name;
        this.grade = grade;
        this.year = year;
        setId();
    
    
    //when we make a variable static, any changes will be visible, will effect the objects for the following operations
    }
    
    public void setId() {
        counter++;
        id = ""+year+grade+counter;
        
    }
    
}
