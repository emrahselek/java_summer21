package techprClass.day22_w7_date_accessmodifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class X1_Date01 {

	public static void main(String[] args) {
		
		// how to create date object
		
		LocalDate currentDate1 = LocalDate.now();
		
		System.out.println(currentDate1);
		
		System.out.println(currentDate1.plusDays(8));
		System.out.println(currentDate1.plusMonths(2));
		System.out.println(currentDate1.plusYears(5));
		System.out.println(currentDate1.plusDays(-11));
		
		System.out.println(currentDate1.plusDays(4).plusMonths(3).plusYears(2));
		
		System.out.println(currentDate1.getYear());
		System.out.println(currentDate1.getMonth());
		System.out.println(currentDate1.getMonthValue());
		System.out.println(currentDate1.getDayOfMonth());
		System.out.println(currentDate1.getDayOfWeek());
		System.out.println("===========");
		
		System.out.println(currentDate1.plusWeeks(2));
		
		System.out.println(currentDate1.minusDays(10));
		
		//compare
		LocalDate date2=LocalDate.of(2020, 8, 10);
		
		System.out.println(currentDate1.isAfter(date2));
		System.out.println(currentDate1.isBefore(date2));
				
		LocalDateTime dateTime1=LocalDateTime.now();
		System.out.println(dateTime1);
		
		LocalDate currentDate2=LocalDate.now();
		System.out.println(currentDate2);
		
		DateTimeFormatter dtformat1= DateTimeFormatter.ofPattern("dd-MMM/yy");
		/*
		 * m=> minutes
		 * M=> Months(1,2,3..)
		 * MM=> the number of month (07,08)
		 * MMM=> First 3 Characters
		 * MMMM=> Full name
		 */		
				
		System.out.println(dtformat1.format(currentDate2));
		System.out.println(dtformat1.format(currentDate2.plusMonths(2)));
		
		LocalTime currentTime1=LocalTime.now();
		System.out.println(currentTime1); //18:10:51.252512300
		
		DateTimeFormatter dtformat2 = DateTimeFormatter.ofPattern("HH:mm");
		/*
		 * hh => am-pm format
		 * HH => 24 hour format
		 */
		System.out.println(dtformat2.format(currentTime1));
				
		LocalDate d1 = LocalDate.now();
		
		LocalDate d2 = LocalDate.of(1984, 3, 9);
				
		// it return Year, Mounths and Days
		Period age = Period.between(d2, d1);
		System.out.println(age); //P-37Y-4M-3D
		
		// if i want to just the year
		int ageYear = Period.between(d2, d1).getYears();
		System.out.println(ageYear);
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
