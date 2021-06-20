package Generics;

import java.util.Comparator;

public class GenericsDemo7<T> {
	
	// We can use T within this class base on our requirement.
	
	public <T> void m4(T obj)
	{
		// We can use T within this class based on our requirement.
		// we have to declare type parametr('T') before return type.
	}
	
	public <T extends Number> void m5()
	{
		
	}
	
	public <T extends Runnable> void m6()				
	{
		// T can be any interface as Runnable is interface
	}
	
	public <T extends Number & Runnable> void m7()
	{
		// Number is class and Runnable is interface
	}
	
	public <T extends Comparator & Runnable> void m8()
	{
		// comapartor & runnable is interface
	}
	
	public <T extends Number & Comparator & Runnable> void m9()
	{
		// comapartor & runnable is interface and Number is class
	}
	
	public <T extends Number & Thread> void m10()
	{
		// Number and Thread are classes and mutilple inheritance for class is not accepted in Java
	}
	
	
}
