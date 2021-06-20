package DatesinJava;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

public class LocalDatesJava {
	
	public static void main(String args[]) throws ParseException
	{
		//LocalDate
		LocalDate date = LocalDate.now();								
		System.out.println(date);										// 2020-06-27
		LocalDate Yesterday = date.minusDays(1);						
		LocalDate DayafterTommrow= date.plusDays(2);
		System.out.println(Yesterday+" "+DayafterTommrow);				// 2020-06-26 2020-06-29
		
		LocalDate d1 = LocalDate.of(2020,06,03);
		LocalDateTime datetime=d1.atTime(10,15,9);
		System.out.println(datetime);
		System.out.println(d1);
		System.out.println(d1.isLeapYear());
		
		
		//Localtime
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalTime previoustime = time.minusHours(1);
		LocalTime Futuretime = time.plusHours(1);
		System.out.println(previoustime+ "   "+ Futuretime);
		LocalDate d2= LocalDate.of(2020, 6, 6);
		LocalDateTime ld2= time.atDate(d2);
		System.out.println("Localdate time is"+ld2);
		
		//LocalDatetimer
		LocalDateTime ldt3 = LocalDateTime.now();
		System.out.println("LocalDateTime is :" + ldt3);
		LocalDate d3 = LocalDate.of(2019, 05, 25);
		LocalTime t3 = LocalTime.of(11,23,32);
		LocalDateTime ldt4 = LocalDateTime.of(d3,t3);
		System.out.println("Created LocalDatetime is " + ldt4);
		
		//Formatting in LocalDatetime
		System.out.println("Before Formatting " + ldt3);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM-dd-yyyy::mm:HH:ss-EEEE");						// Jun-27-2020::08:14:54-Saturday
		String formatedDate = ldt3.format(format);
		System.out.println("formatted Datetiem is " + formatedDate);
		
		//MonthDay
		MonthDay md = MonthDay.now();
		System.out.println(md);
		LocalDate date2 = md.atYear(2017);
//		MonthDay md1 = MonthDay.of(03, 20);
//		LocalDate date3 = md1.atYear(2020);
//		System.out.println(date3);
		System.out.println("LocalDatetime of 2017 is "+date2);
		
		LocalDateTime date3 = LocalDateTime.of(2018,03,25,12,25);
		System.out.println(date3.get(ChronoField.DAY_OF_MONTH));
		System.out.println(date3.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(date3.get(ChronoField.DAY_OF_WEEK));
		System.out.println(date3.get(ChronoField.HOUR_OF_DAY));
		
		
		//OffsetTime
		OffsetTime ot = OffsetTime.now();
		System.out.println("OffSettime is " + ot);
		int h = ot.get(ChronoField.HOUR_OF_DAY);
		int m = ot.get(ChronoField.MINUTE_OF_DAY);
		int s = ot.get(ChronoField.OFFSET_SECONDS);
		System.out.println("Hour is " + h + "Minutes is " + m + "Seconds is " + s);
		
		
		//DateFormat and SimpleDateFormat is used to convert Date to String and parse String to Date.
		//DateTime Format
		Date d = new Date();
		System.out.println("Date is :" + d);
		
		String datetostr = DateFormat.getInstance().format(d);
		System.out.println("Date to String is:" +datetostr);
		datetostr = DateFormat.getDateInstance().format(d);
		System.out.println("Date Instance is "+ datetostr);
		datetostr = DateFormat.getTimeInstance().format(d);
		System.out.println("time Instance is " + datetostr);
		datetostr =DateFormat.getTimeInstance(DateFormat.SHORT).format(d);
		System.out.println("Time style is " +datetostr);
		datetostr =DateFormat.getTimeInstance(DateFormat.LONG).format(d);
		System.out.println("Time style Long is " + datetostr);
		datetostr =DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d);
		System.out.println("Time style Medium is " + datetostr);
		datetostr =DateFormat.getDateInstance(DateFormat.SHORT).format(d);
		System.out.println("Date style short is " + datetostr);
		datetostr =DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		System.out.println("Date style Medium is " + datetostr);
		datetostr =DateFormat.getDateInstance(DateFormat.LONG).format(d);
		System.out.println("Date style Long is " + datetostr);
		
		
		
		//SimpleDateformat
		Date d4 =new Date();
		System.out.println(d4.getMonth());
		//DD:- is number of Days 
		//Date to string
		SimpleDateFormat sd = new SimpleDateFormat("dd/MMM/yy");						/// MMMMM --- JANUARY,FEBUARY,MARCH.....  MMM ----- Jan,Feb,Mar....
		String dateString = sd.format(d4);
		System.out.println("Date to string is "+dateString);
		
		sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		dateString = sd.format(d4);
		System.out.println("Date to string is "+dateString);
		
		sd = new SimpleDateFormat("dd MMMM yyyy");
		dateString = sd.format(d4);
		System.out.println("Date to string is "+dateString);
		
		sd = new SimpleDateFormat("dd MMMM yyyy zzzz");
		dateString = sd.format(d4);
		System.out.println("Date to string is "+dateString);
		
		sd = new SimpleDateFormat("EEEE,dd MMMM yyyy z");
		dateString = sd.format(d4);
		System.out.println("Date to string is "+dateString);
		
		
		//String to Date
//		String birthday="03/25/1997";
//		Date strtodate = sd.parse(birthday);
//		System.out.println("string to Date " + strtodate);
		
		// Periods
		LocalDate now = LocalDate.now();
		LocalDate birth=LocalDate.of(1997, 03, 25);
		Period p = Period.between(birth, now);
		
		System.out.printf("Hello your age is %d year %d months and %d days", p.getYears(),p.getMonths(),p.getDays());
		
		
		DateTimeFormatter inBuiltFormatter1 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter inBuiltFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		System.out.println();
		System.out.println(inBuiltFormatter1.toFormat());
		System.out.println(inBuiltFormatter2);
	}

}
