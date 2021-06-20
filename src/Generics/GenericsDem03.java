/*
 * Until 1.4v a non generics version of aaraylist is decalred as follow
 * 
 */

package Generics;

public class GenericsDem03 {
	
	public static void main(String[] args)
	{
		
	}

}

//Until 1.4 non generics version of arraylist declared as follow.

class arrayList
{
	public void add(Object o)
	{
		System.out.println("Add method");
	}
	
	public Object get(int index)
	{
		Object o ="";
		return o;
	}
}

// 1.5 version

/*class ArrayList<T>														// '<T>' is parameter type which can be(String,Integer,Double,Character etc...).such type of parameterized classes are generics or template.
{
	public void add(T t)												// Base on runtime requirement T will be replaced with provide type 	
	{
		System.out.println("Add method");
	}
	
	public T get(int index)
	{
		return T;
	}
}  */

// Generics version of arrayList can be created as follows

ArrayList<String> al5 = new ArrayList<String>();
al5.add("Durga");
al5.add(new Integer(5));												// we will get error

String ele1 = al5.get(0);												// Type casting is not required as it will return String		


//Complier version of arrayList class as follows

class ArrayList1<String>
{
	public void add(String s)
	{
		System.out.println("Add method of generics arraylist");
	}
	
	public String get(int index)
	{
		String s = (String) "Get method of generics arraylist";
		return s;
	}
}


// Based on our requirement we can define our own generic classes

class Account<Gold>
{
	Account<Gold> ac = new Account<Gold>();
}


