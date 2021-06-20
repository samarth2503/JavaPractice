/*
 * Bounded types:- Bounded types can be defined only by using extends keyword.
 * Implements and super keyword are not allowed.But we can replace implements keyword purpose with extends keyword.
 * Meaning of bounded type is it should in range of extends class.(exmaple: - Byte,Short,Integer,Double,Decimal fala under Number class)
 * If the type fall out of bounded type the exception will be thrown (java.lang.type is not in its bound.)
 * 
 */

/*   Prototype of generics
 * 
 * class Test<T extends X>										// X --- is a class then as type parameter(T) we can pass either X type or its child classes.
 * {
 * 
 * }
 */

package Generics;

import org.apache.log4j.spi.Configurator;

public class GenericsDemo5 {
	
	public static void main(String[] args)
	{
		
	}

}

class Test<T extends Number>									// T--- can anything Byte,Short,Integer,Double,Decimal...
{
	Test<Integer> i1 = new Test<Integer>();
	//Test<String> i2 = new Test<String>();						// Type parameter java.lang.string is not in its bound.
}

class Test2<T extends Number & Runnable>						// As type parmeter we can take anything which should be child class of number and should implements runable interface
{
	
}

class Test3<T extends Runnable & Comparable>					// Interface can extends multiple interface (T can be any interface which is bounded to Runnable and comparable)
{
	
}

class Test4<T extends Number & Runnable & Comparable>			
{
	
}

/*class Test5<T extends Runnable & Number>						// We have take class first followed by interface  .... [Number first Runnable later]
{
	
}

class Test6<T extends Number&Thread>							// Mutilpe Inheritance is not possible...[Number & Thread are classes]
{
	
}*/

class Test7<A,B>
{
	
}

class Test8<A,B,C>												// we can define any number of parameter but it should be seprated by commas			
{
	
}