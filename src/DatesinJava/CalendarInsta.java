package DatesinJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarInsta {
	
	public static void main(String args[]) throws ParseException
	{
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());									// Thu Jun 25 22:01:53 IST 2020
		cal.add(Calendar.JUNE, 10);											// It will give next day(date).
		System.out.println(cal.getTime());									// Fri Jun 26 22:01:53 IST 2020
		
		cal.set(2020, 04, 2);												// It will set the date
		System.out.println(cal.getTime());																			
		cal.get(Calendar.DAY_OF_WEEK);
		cal.add(Calendar.DAY_OF_MONTH, 4);									// It will add 3 days in the date.
		System.out.println(cal.getTime());
		
		cal.add(Calendar.HOUR_OF_DAY, 2);
		cal.add(Calendar.MINUTE, 20);
		cal.add(Calendar.SECOND, 40);
		System.out.println(cal.getTime());									// Thu May 07 00:50:40 IST 2020
		
		
		int weedays=cal.getFirstDayOfWeek();
		System.out.println(weedays);										
		
		Calendar c1 = Calendar.getInstance();
		
		c1.add(Calendar.DAY_OF_MONTH, -15);
		System.out.println("15 Days ago is was " + c1.getTime());
		Calendar c2 = Calendar.getInstance();
		Date d1 = new Date();
		System.out.print("Set Time is : ");
		c2.setTime(d1);
		
		c2.add(Calendar.YEAR, 3);
		if(c2.after(c1))														// After method (Same for Before Method)
		{
			System.out.println("Date " + c2.getTime() + "is after " + c1.getTime());
		}
		System.out.println(c2.getWeekYear());									// Get current Year
		
		int hrs = c1.getActualMaximum(Calendar.HOUR);
		int min = c1.getActualMaximum(Calendar.MINUTE);
		int sec = c1.getActualMaximum(Calendar.SECOND);
		
		System.out.println("Max hours is " + hrs + " Max minutes is " + min + " Max seconds is " + sec);
		
		int year = c1.getActualMaximum(Calendar.YEAR);
		int mon = c1.getActualMaximum(Calendar.MONTH);
		int dayofweekmonth = c1.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		int dayofweek =c1.getActualMaximum(Calendar.DAY_OF_WEEK);
		int date = c1.getActualMaximum(Calendar.DATE);
		
		System.out.println("Max year is " + year + " Max Month is " + mon + " Max days is " + dayofweekmonth + " Max day of week " + dayofweek + " Date is " + date);
		
		Calendar today = Calendar.getInstance();
		Calendar future = Calendar.getInstance();
		future.set(Calendar.YEAR, 2021);
		System.out.println("Yaer is "+future.get(Calendar.YEAR));
		
		if(future.after(today))
		{
			System.out.println("Future Date is "+future.getTime());
		}
		
		monthnofrommonthname("Jan");
	
	}
	
	public static void monthnofrommonthname(String month) throws ParseException
	{
		Calendar cal = Calendar.getInstance();
		Date d = new SimpleDateFormat("MMM").parse(month);
		cal.setTime(d);
		System.out.println("Month is "+cal.get(Calendar.MONTH)+1);
	
	}
	
	
}
