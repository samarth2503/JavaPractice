package ExceptionzHandling;

public class Exception {
	
	//////////////////////////// Case-2 ////////////////////////
	
	public static void main(String[] args)
	{
		doStuff();
		System.out.println(10/0);
	}
	
	public static void doStuff()
	{
		domoreStuff();
		System.out.println("Hi");
	}
	
	public static void domoreStuff()
	{
		System.out.println("Hello");
	}
	

}
