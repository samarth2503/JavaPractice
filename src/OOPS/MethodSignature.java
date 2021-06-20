package OOPS;

class Animal
{
	
}
class Monkey extends Animal
{
	
}

class OverLoading
{
	public void m1(int i)
	{
		System.out.println("Method m1 with parameter i is :" +i);
	}
	
	public void m6(int i)
	{
		System.out.println("Genearl method");
	}
	
	public void m6(int... i)
	{
		System.out.println("Var-args method");
		System.out.println("i is: "+i);
	}
	
	public void m7(Animal a)
	{
		System.out.println("Animal Version");
	}
	
	public void m7(Monkey m)
	{
		System.out.println("Monkey version");
	}
	
	public void m1(int a ,int b)
	{
		System.out.println("Method m2 with parameter a and b is :" +a +" and "+ +b);
	}
	
	public void m3(String s)
	{
		System.out.println("Method m3 with parameter s is :" +s);
	}
	
	public void m4(String s,float f)
	{
		System.out.println("Method m4 with parameter s and f is :" +s +" and "+ f);
		int a='a';
		System.out.println("a is : "+a);
		float f1 = (float) 10.5;
		double d = 10.5f;
	}
	
	
	public void m5(String s)
	{
		System.out.println("String version");
	}
	
	public void m5(Object o)
	{
		System.out.println("Object Version");
	}
	
	public void m3(StringBuffer sb)
	{
		System.out.println("StringBuffer version");
	}
	
	public void m2(int i, float f)
	{
		System.out.println("int-float arguments");
	}
	
	public void m2(float f,int i)
	{
		System.out.println("float-int argument");
	}
}

public class MethodSignature {
	
//	public void m1(int a)
//	{
//		System.out.println("A is : "+a);
//	}
//	
//	public int m1(int b)
//	{
//		return 10;
//	}
	
	public static void main(String args[])
	{
//		MethodSignature t = new MethodSignature();
//		t.m1(10);
		//Case-I(Automatic conversion)
		OverLoading o = new OverLoading();
		o.m4("Durga", 10l);
		o.m1(10, 20);
		o.m1('a');														// narrow conversion(char can be promoted to int type) 
//		o.m1(10l);														// long can't be promoted to int.(C.E : - The method m1(int) in the type OverLoading is not applicable for the arguments (long))
		
		
		//CASE-II
		
		o.m5("String");								// String version
		o.m5(new Object());							// Object version
		o.m5(null);									//String version( while resolving overloaded method complier will give precendence for child type argument when compared with parent type arguiment)
		
		//CASE-III
		o.m3("Durga");
		o.m3(new StringBuffer("string Buffer"));
//		o.m3(null);											// Refernce to m3 is ambigious (both string and stringbuffer are child of Object class.Hence it throws ambigous error).
		
		
		//CASE-IV
		
		o.m2(10, 10.5f);									//	int-float argument
		o.m2(10.5f, 10);									// float-int argument
//		o.m2(10, 10);										// Ambigious refernce to m2.(int can be promoted to float)
//		o.m2(10.5f, 10.5f);									// The method m2(float, int) in the type OverLoading is not applicable for the arguments (float, float)
		
		//CASE-V
		o.m6();												// Var-args merhod (It can take 0 argument also)
		o.m6(10,20);										// Var-args method
		o.m6(10);											// General method( Perference will be given to old version(General method) over new veersion( 
		
		//CASE-VI
		Animal a = new Animal();
		o.m7(a);											// animal version
		Monkey m = new Monkey();
		o.m7(m);											//mONKEY VERSION
		
		Animal a1 = new Monkey();
		o.m7(a1);											// Animal version
		
	}
	
	

}
