package OOPS;

class Parent
{
	int a=10;
	
	public void property()
	{
		System.out.println("Cash + Land + Gold");
	}
	
	public void marry()
	{
		System.out.println("SubhLakshmi");
	}
	
	public double d1()
	{
		return 10.5;
	}
	public Object m1()
	{
		String s ="Co-varint type";
		return s;
	}
	
	private void m2()
	{
		System.out.println("Private Methods in Parent class");
	}
	
	public final void m3()
	{
		System.out.println("Final Methods in Parent class");
	}
	
	public void m4()
	{
		System.out.println("This is m4 method");
	}
	public static void m6()
	{
		System.out.println("This is static method");
	}
	
}

///////////////////////////////////////////// abstract method in overridiing ////////////////////////////////////////////
class A
{
	public void m5()
	{
		System.out.println("Non-Abstact Method");
	}
}

abstract class B extends A
{
	public abstract void m5();
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////

class P
{
	public void m1()
	{
		System.out.println("This is Parent method");
	}
}

class C extends P
{
	public void m2()
	{
		System.out.println("This is Child method");
	}
}


//////////////////////////////////////////////
public class Overrding extends Parent {
	
	
	public void marry()
	{
		System.out.print(super.a);
		System.out.println("Usha/Asha");
	}
	
	public int d1()
	{
		return 10;
	}
	public String m1()
	{
		String s ="Co-varint type";
		return s;
	}
	
	private void m2()
	{
		System.out.println("Private Methods in Child class");
	}
	
	public 
	public void m3()
	{
		System.out.println("Final Methods in Parent class");
	}
	
	void m4()
	{
		System.out.println("This is default scope method");
	}
	
	public void m6()											// This instance method cannot override the static method from Parent
	{
		System.out.println("Non-static method");
	}
	
	
	public static void main(String args[])
	{
		//CASE-I
		Parent p = new Parent();
		p.marry();											// SubhLakshmi
		Overrding o = new Overrding();
		o.marry();											// Usha/Asha
		Parent p1 = new Overrding();
		p1.marry();											// Usha/Asha ( In Overriding method resolution is always take care by JVM based on run-time Object. Hence overrding also considered as Run-time polymorphism or dynamic polymorphism or late-binding)
		
		//CASE-II--- Co-variant type
		o.m1();												// Co-variant type
		
		//CASE-III 
		o.d1();												// The return type is incompatible with Parent.d1()
		
		
		//CASE-IV(Overrding of private method)
		o.m2();													// It is valid but not over-ridding
		
		//CASE-V
		o.m3();													// we can't override parent class method in child classes( Cannot override the final method from Parent)
		
		//CASE-VI (final method in parent class can't override child class)
		B b = new B();
		b.m5();
		
		//CASE-VII( we can't decrease scope of overridden method)
		o.m4();
		
		//CASE-VIII
		o.m5();													// Static method cannot be overridden
		
		
		C c =new C();											// by using child refernce we cann call both parent class methods as well child calss methpd
		c.m1();
		c.m2();
		
		P p2 = new C();											// by using parent class refernce we can call both parent  class methods only.
		p2.m1();
		
	}

}
