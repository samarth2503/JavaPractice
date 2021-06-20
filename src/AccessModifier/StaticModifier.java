package AccessModifier;

public class StaticModifier {
	
	static int x = 100;
	int y=200;
	
////CASE-1 (Overloading of main method/////
	
	public static void main(int[] args)
	{
		System.out.println("Integer args");
	}
	
	public static void main(String[] args)
	{
		StaticModifier sm = new StaticModifier();
		x=150;
		sm.y=250;
		StaticModifier sm1 = new StaticModifier();
		System.out.println(sm1.x + "......" +sm1.y);
		sm1.m1();
	}

//////// Instance memeber in static method //////////
	public static void m1()
	{
		//int y = 10;
		System.out.println(y);					// Instnace variable can be accessed from static method,only ststaic memeber can be accssed.
		System.out.println(x);
	}
	
	
	
	

}
