package day18passbyvaluepassbyreferencedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datetime01 {

	public static void main(String[] args) {
		//Dates
		LocalDate currentDate01 = LocalDate.now();
		
		System.out.println(currentDate01);//2020-10-04
		
		currentDate01.plusDays(3);
		
		System.out.println(currentDate01.plusDays(3));//2020-10-07
		
		System.out.println(currentDate01.plusMonths(2));//2020-12-04
		
		System.out.println(currentDate01.plusMonths(4));//2021-02-04
		
		System.out.println(currentDate01.plusYears(2));//2022-10-04
		
		System.out.println(currentDate01.minusDays(5));//2020-09-29
		
		System.out.println(currentDate01.minusMonths(5));//2020-05-04
		
		System.out.println(currentDate01.minusYears(5));//2015-10-04
		
		currentDate01.minusMonths(3).minusDays(6);
		
		System.out.println(currentDate01.minusMonths(3).minusDays(2));//2020-07-02
		
		//Time
		
		LocalTime currentTime01 = LocalTime.now();
		
		System.out.println(currentTime01);
		
		System.out.println(currentTime01.plusHours(2).plusMinutes(5).plusSeconds(11));//13:42:25.033
		
		System.out.println(currentTime01.minusHours(2).minusSeconds(20));//09:37:40.783
		
		
		// Date and Time
		 LocalDateTime curDateTime01 = LocalDateTime.now();
		 
		 System.out.println(curDateTime01);//2020-10-04T11:39:35.799
		 
		 //How to Update Date format
		 
		 LocalDate currentDate02 = LocalDate.now();
		 
		 System.out.println(currentDate02);
		  
		 DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("MM-dd-yyyy"); 
		 
		 
		 System.out.println(dtf02.format(currentDate02));
		 
		 //How to Update Time Format
		 
		 LocalTime currentTime02 = LocalTime.now();
		 
		 DateTimeFormatter dtf03 = DateTimeFormatter.ofPattern("hh:mm"); 
		 
		 dtf03.format(currentTime02);
		 
		 System.out.println(dtf03.format(currentTime02));
		 
		 System.out.println(currentTime02);
		 
		 dtf03.format(currentTime02.plusHours(3));
		 
		 System.out.println(dtf03.format(currentTime02.plusHours(3)));
		 
		 DateTimeFormatter dtf04 = DateTimeFormatter.ofPattern("HH:mm"); 
		 
		 System.out.println(dtf04.format(currentTime02.plusHours(3)));
		 
		 
		 
		
	}

}
