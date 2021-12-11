package w2_ergn_practiceClass;

public class HealtyProblem_Emrah {

	public static void main(String[] args) {
        
		 String name="Emrah";
		 String surname="SELEK";
		 int years=37;
		 double height=180;
		 double weight=100;
		 double bmi=weight / (height * height / 10000);
		 String status;
		 if(bmi<=20) {
			 status="weak";
		 }else if(bmi<=25) {
			 status="healty";
		 }else if(bmi<=30) {
			 status="fat";
		 }else
			 status="obese";
      System.out.println(name + " " + surname + " is " + years + " years old ,his height is " + height
				+ " and his weight is " + weight + " He is " + status + " because his BMI=" + bmi);
	}
}

