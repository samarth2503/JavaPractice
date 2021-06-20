/*
 * Generic concept is applicable only at compile time not at runtime.
 * At time of compilation at last step generic syntax (new ArrayList<String>) will be removed and hence for JVM generic syntax wont be availbale.  (Refer m2 method for Example)
 * 
 */
package Generics;

import java.util.ArrayList;

public class GenericsDemo8 {
	
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();				// Genercis Area
		al.add("Samarth");
		al.add("Ravi");
		m1(al);
		System.out.println(al);
		//al.add(10);													// It will throw compile error as the it is fall in generic area.  
		m2();
	}
	
	public static void m1(ArrayList l2)
	{
		l2.add(10);													// Non-Genercis Area : - If we pass generic object to non generic area it behave as non-generic
		l2.add(10.5);
	}
	
	public static void m2()
	{
		ArrayList l = new ArrayList<String>();							// In place of string we can user any type like Double,Integer it will behave in same manner.
		l.add(10);
		l.add(10.5);
		l.add("Java");
		System.out.println(l);
	}

}
