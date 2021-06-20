package ExceptionzHandling;

public class ExpectionDay4 {
	
	public static void main(String[] args)
	{
	/////////////////////////////////// CASE-I //////////////////////////////////
		
		System.out.println("Statement-1");
		try
		{
			System.out.println("Statement-2");
			System.out.println(10/0);							/* Exception occurs at this line, so it will move to catch block and execute it and terminate the pgm,it won't return to try blcok again to exceute Satement-3. */
			System.out.println("Statement-3");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(10/2);
		}
		System.out.println("Statement-4");
		
		
		////////////////////////////////  CASE-II ////////////////////////////////////
		
		System.out.println("---------------------------Case II -------------------------------");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		
		///////////////////////////CASE-III //////////////////////////////////////////
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Throwable Exception");
		}
		
		
	}

}
