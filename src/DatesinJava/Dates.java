package DatesinJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Dates {
	
	
	// Java.util.date
	public static void main(String args[])
	{
		Date d = new Date();
		System.out.println("Date d is " + d);							// Tue Jun 03 00:00:00 IST 3919
		Date d1 = new Date();
		System.out.println("Date d is " + d1);							// Sat Jul 05 00:00:00 IST 3919
		long milsec = System.currentTimeMillis();
		Date d2 = new Date(milsec);
		System.out.println(System.currentTimeMillis());							// To get current timestamp in milliseconds
		
		long milsec1 = 50000;
		d2.setTime(50000);												// It will give current date and time of milliseconds mentioned in parameter
		System.out.println("Date d2 is : " + d2);						// Thu Jan 01 05:30:50 IST 1970
		System.out.println("Millsec to Date is : " +d2);				// Thu Jan 01 05:30:50 IST 1970
		if(d1.after(d))
		{
			System.out.println(d1 + " is after " + d);
		}
		
		String sf = new SimpleDateFormat("dd-MMM-YYYY").format(d);
		System.out.println("Date to string is : " +sf);						// 03-Jun-3919
		
		LocalDate ld = LocalDate.of(2019, 03, 14);
		ld.getDayOfWeek();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-EEE-yyyy");
		
		System.out.println(ld.format(formatter));
		
		//System.out.println("Date to string is : " +ldf);
		
	}
	
	
}
