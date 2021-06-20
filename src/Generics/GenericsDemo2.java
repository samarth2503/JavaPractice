/*
 * Advantage of Generics:-
 * 
 * 1> Type safety     Eg:- ArrayList<String> al = new ArrayList<String>();
 * 2> Typecasting      
 * 
 */

package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsDemo2 {
	
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();					// Generic version of arraylist
		ArrayList a = new ArrayList();									// Non-Generic version of arraylist.
		
		al.add("durga");
		al.add("Ravi");
		al.add(new Integer(10));										// Compile time error. we can add only string type of object.
		
		String name1 = al.get(0);										// Type casting is not required as we have defined String
		
		ArrayList<String> al2 = new ArrayList<String>();					// ArrayList is Basetype, "<String>" is parameter type
		
		// Different way to represent arrayList(Polymorphism)
		
		ArrayList<String> l = new ArrayList<String>();					// valid
		List<String> l1 = new ArrayList<String>();						// valid	
		Collection<String> l2 = new ArrayList<String>();				// valid
		
		ArrayList<Object> l3 = new ArrayList<String>();					// Polymorphism concept applicable only for basetype not for parameter type. C.E:- Incomptiable type found arraylist of string required aarylist of Object.
		
		ArrayList<int> l4 = new ArrayList<int>();						// Unexpected type found int required : reference.
		
	}

}
