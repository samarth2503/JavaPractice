package OOPS;

public class Constructor {
	
	static int count =0;
	{
		count++;
		
	}
	
	public Constructor()
	{
		
		//count++;
	}
	
	public Constructor(int i)
	{
		//count++;
	}
	
	public Constructor(double d)
	{
		//count++;
		
	}
	
	public static void main(String args[])
	{
		
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(10);
		Constructor c2 = new Constructor(10.5);
		System.out.println(count);
	}
}
