package OOPS;

abstract class AbstractMethods {
	
	public abstract void m1();
	public abstract void m2();

}
class C extends AbstractMethods
{
	public void m1()
	{
		System.out.println("This is m1 method");
	}
	public void m2()
	{
		System.out.println("This is m2 method");
	}
}
