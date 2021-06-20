package Collection;
//interface Land
//{
//	void B();
//}
//class Student
//{
//	int a;
//	int b;
//	int c;
//	public void add(Practice p)
//	{
//		c= a+b;
//		p.B();
//		System.out.println(c);
//	}
//}
//public class Practice implements Land {
//	public void B()
//	{
//		String a = "Samrth";
//		System.out.print(a);
//	}
//	
//	public static void main(String[] args)
//	{
//		Land l = new Practice();
//		Student s = new Student();
//		s.a=10;
//		s.b=20;
//		l.B();
//		
//	}
//}
import java.util.*;
class Practice
{
	public static void main(String args[])
	{
		TreeSet<String> t = new TreeSet<String>();
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GanfgaBhavni");
		t.add("Ramulamma");
		
		System.out.println(t);		//[ShobhaRani, Roja, Ramulamma, RajaKumari, GanfgaBhavni]
	}
}
		
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = (String)obj2;
		return s2.compareTo(s1);
	}
}