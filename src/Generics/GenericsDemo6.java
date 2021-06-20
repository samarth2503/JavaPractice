/*	WildCard characters
 * 
 * 	m1(AL<String> l)					// 
 *  m1(AL< ? extends X> l)
 *  m1(AL<? super X> l)
 *  
 */

package Generics;

import java.util.ArrayList;

public class GenericsDemo6 {
	
	public void m1(ArrayList<String> l)
	{
		// We can call this method by passing ArrayList of only String type
		// Within the methods we can add only String type of Object to list by mistake if we try to add any other type then we will get compile time error
		
		l.add("Sam");
		l.add(null);
		l.add(10, null);
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Rohn");
		l2.add("Alex");
	}
	
	public void m2(ArrayList<?> l)
	{	
		// We can call this method by passing ArrayList of any unknown type
		
		/*l.add(10.5);									// We dont know which type we are going to pass
		l.add('a'); */
		l.add(null);									// null is allowed becuase it is valid value for any type
														// This type of method best suitable for read-only operation
		ArrayList<?> al2 = new ArrayList<Integer>();
		al2.add(10, null);
		al2.add(20, null);
	}
	
	public void m3(ArrayList<? extends X> l)
	{
		// X can be either class or interface, If X is a class then we can call this method by passing arraylist of either X type or its child classes
		// If X is an interface then we can call this method by passing ArrayList of either X type or its implementation classes
		// Within the method we cant add anything to list expect null becuase we dont know the type of X exaclty
		
		ArrayList<? extends Number> al3 = new ArrayList<Integer>();
		al3.add(15, null);
		al3.add(45, null);
	}
	
	public void m4(ArrayList<? super X> l)
	{
		// X can be either class or interface
		// If X is a class then we can call this method by passing ArrayList of either X type or its super classes
		// If X is an interface then we can cal;l this method by passing ArrayList of either X type or its super classes of implemenation class of X
		// In array list we can add X type of Object and null to List
		
	}

}
