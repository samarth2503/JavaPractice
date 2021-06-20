/*
 * If we have a requirement to store String type of element then we go for array as it provide type safety
 * If we provide any other type of object we get C.E:- incompatible type found java.lang.Integer required java.lang.String
 * Arrays are type safe,where as collection are not type safe(we cant give gaurantee for type of element present inside collection).
 * Main Objective of Generics is to provide type safety to Collections.
 * Type casting is required in Collection as we dont know the type of element present in collection.
 * Type casting is not required in array as element type is known in advance
 * 
 * 
 * To overcome the above mentiond problem 
 * 
 *  Generics concept was introduced in 1.5 version.hence main objective of generics are provifr type safety to resolve type casting problem
 *    
 */


package Generics;

import java.util.ArrayList;

public class GenericsDemo1 {
	
	public static void main(String[] args)
	{
		
		//Type Safety
		
		/*String[] str = new String[5];
		
		str[0]="Rahul";											// Type casting is not required as we know the type of element present inside Array,
		str[1]="Mukesh";
		str[2]=3; */
		
		ArrayList al = new ArrayList();
		al.add("Durga");
		al.add("10");
		al.add("Ravi");
		
		String name1 = al.get(0);							// Type casting is required as we dont know the type of element present inside collction
		String name2 = (String)al.get(1);
		
		System.out.println("Name 1 is "+name1 +"Name 2 is :"+name2);
		//Type Casting
		
		
		
		
	}

}
