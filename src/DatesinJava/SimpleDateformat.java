/*
 *  Parse -- means String to date (format is = Mon Jun 01 00:00:00 IST 1970)
 *  formatting -- Date to String
 */


package DatesinJava;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateformat {
	
	public static void main(String[] args) throws ParseException
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YYY");
		System.out.println("MM-dd-YYYY format is = "+sdf.format(d));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-YY");
		System.out.println("dd-M-YY format is = "+sdf1.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("MM-dd-YYYY format is = "+sdf2.format(d));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MMMM-YYYY");
		System.out.println("MM-dd-YYYY format is = "+sdf3.format(d));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("E, dd-MMMM-YYYY zzzz");
		System.out.println("E, dd-MMMM-YYYY zzzz format is = "+sdf4.format(d));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd-MM-YYYY HH:MM:SS z");
		System.out.println("dd-MM-YYYY HH:MM:SS z format is = "+sdf5.format(d));
		
		
		// Parsing String to Date
		SimpleDateFormat sdf6 = new SimpleDateFormat("dd/MM/YYYY");
		Date d1 = sdf6.parse("31/06/2020");
		System.out.println("Date is "+d1);
		
		SimpleDateFormat sdf7 = new SimpleDateFormat("MMM");
		Date d2 = sdf7.parse("Mar");
		System.out.println("Date is "+d2);
		
		
		
	}

	

}
