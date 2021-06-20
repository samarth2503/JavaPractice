package OOPS;

public class ConstructorOverloading {

	//////// CASE-1 ////////////////
	
	
//	public static void m1()
//	{
//		m2();
//	}
//	
//	public static void m2()
//	{
//		m1();
//	}
//	
//	public static void main(String[] args)
//	{
//		m1();
//		System.out.println("Main Method");					// Exception in thread "main" java.lang.StackOverflowError
//	}
	
	
	ConstructorOverloading()
	{
		this(10);
		System.out.println("No-args");
	}
	
	ConstructorOverloading(int i)
	{
		this(10.5);
		System.out.println("int -args");
	}
	
	ConstructorOverloading(double d)
	{
		System.out.println("double-args");
	}
	
	public static void main(String[] args)
	{
		ConstructorOverloading t1 = new ConstructorOverloading();				// double-args,int -args,No-args
		ConstructorOverloading t2 = new ConstructorOverloading(10);				// double-args,int -args
		ConstructorOverloading t3 = new ConstructorOverloading(10.5);			// double-args
		ConstructorOverloading t4 = new ConstructorOverloading(10l);			// double-args  (automatic conversion)
	}

}
