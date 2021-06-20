package DatesinJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {
	
	public static void main(String[] args)
	{
		LocalDateTime date1 = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a,EEEE");
		
		System.out.println("Format is :- "+formatter.format(date1));
		
		LocalDate date2 = LocalDate.of(2019,11,15);
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("M/d/YYY");
		System.out.println("Format is :-"+formatter1.format(date2));
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		DateTimeFormatter inBuiltFormatter1 = DateTimeFormatter.ISO_DATE_TIME;
	}

}
