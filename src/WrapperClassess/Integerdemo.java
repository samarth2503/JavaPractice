/*  Wrapper class provide mechanism to convert primitive into Object and Object into primitive
 * Automatic conversion of primitive to Object is autoboxing 
 * Automatic conversion of Object to Primitive is unboxing
 * 



*/
package WrapperClassess;

public class Integerdemo {
	
	public static void Integer(int a,int b,int c,int d)
	{
		/// Autoboxing
	
		Integer i = Integer.valueOf(a);						// Converting explicitly
		Integer i1 = b;										// autoboxing internally complier will write Integer.valueof(b);
		System.out.println("Interger value is "+i);
		
		System.out.println("Interger value is "+i1);
		
		//Unboxing
		
		Integer i2 = new Integer(c);						// Converting Integer to int.
		int j = i2.intValue();								// Converting integer to int explicitly.
		int k = i2;											// unboxing now complier will write i2.intvalue();
		
		
		//parseInt --- Accept String as argument and return primitive type
		
		int e = Integer.parseInt("30");
		int f = Integer.parseInt("+20");
		int g = Integer.parseInt("-40");
		
		System.out.println("e is "+e+" f is "+f+" g is "+g );
		
	}
	public static void FloatValue()
	{
		Integer a = new Integer(1000);
		Double d = new Double(2000.00000);
		
		float result = a.floatValue();
		float result1= d.floatValue();
		
		System.out.println("Result is "+result+" and result1 is "+result1);
		
		int x=10;
		int b= 5;
		
		Float f = new Float(x);
		System.out.println("Output is "+f.floatValue()/b);
		
	}
	
	public static void main(String[] args)
	{
		Integerdemo id = new Integerdemo();
		String s ="Sam1234sam";
		FloatValue();
	}
	
}
