/* Variable present in abstract class can be initalize through child class constrictor */


package OOPS;

abstract class Person {
	
	String name;
	int rollno;
	
	public abstract int Rollno ();
	public abstract String Name();
	public void m3()
	{
		System.out.println("M3 method");
	}
}
public class AbstractMethod extends Person
{
	AbstractMethod(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public int Rollno()
	{
		return rollno;
	}
	public String Name()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		AbstractMethod abs = new AbstractMethod("Samarth",23);
		System.out.println("Name is "+abs.Name());
		System.out.println("Roll no is "+abs.Rollno());
		abs.m3();
	}
	

}
