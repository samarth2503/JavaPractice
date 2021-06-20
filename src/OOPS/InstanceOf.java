package OOPS;

import java.util.ArrayList;

public class InstanceOf {
	
	public static void main(String[] args)
	{
		Thread t = new Thread();
		
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
		
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(1);
		al.add("String");
		al.add('c');
		al.add(12.3f);
		
		
		for(int a=0;a<al.size();a++)
		{
			Object o = al.get(a);
			
			if(o instanceof Integer)
			{
				System.out.println(o+" is instance of Integer");
			}
			else if(o instanceof String)
			{
				System.out.println(o+" is instance of String");
			}
			else if(o instanceof Character)
			{
				System.out.println(o +" is instance of Character");
			}
			else if(o instanceof Float)
			{
				System.out.println(o +" is instance of Float");
			}
		}
	}

}
