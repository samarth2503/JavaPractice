package Collection;
import java.util.*;
import java.lang.*;
public class TreeSet1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<String>(new MyComparator());
		t.add("Raja");
		t.add("Samarth");
		t.add("Rana");
		t.add("Jadhav");
		t.add("Paresh");
		t.add("Ball");
		System.out.println(t);
//		System.out.println(t.pollFirst());					// Samarth(Remove first element)
//		System.out.println(t.pollLast());					// Ball(Remove last element)
		
//		System.out.println(t.first());						// Samarth	(returns first element)
//		System.out.println(t.last());						// Ball 	(returns last element)
//		System.out.println(t.headSet("Jadhav"));			//[Samarth,Rana,Raja,Paresh]
//		System.out.println(t.tailSet("Rana"));				//[Rana,Rajesh,Paresh,Jadhav,Ball]
//		System.out.println(t.subSet("Samarth", "Paresh"));	//[Samarth,Rana,Raja]
	}
}
class MyComparator implements Comparator<TreeSet1> {
	
		public int compare(Object obj1,Object obj2)
		{
			String s1 = obj1.toString();
			System.out.println(s1);
			String s2 = (String)obj2;
			System.out.println(s2);
			return s1.compareTo(s2);			// [Ball, Jadhav, Paresh, Raja, Rana, Samarth]
			return -s1.compareTo(s2);			// [Samarth, Rana, Raja, Paresh, Jadhav, Ball]
			return -s2.compareTo(s1);			// [Ball, Jadhav, Paresh, Raja, Rana, Samarth]
			return s2.compareTo(s1);			// [Samarth, Rana, Raja, Paresh, Jadhav, Ball]
		}

	
}



//class Employee implements Comparable
//{
//	String name;
//	int eid;
//	
//	Employee(String name,int eid)
//	{
//		this.name=name;
//		this.eid=eid;
//	}
//	
//	public String toString()
//	{
//		return name+"----"+eid;
//	}
//	
//	public int comapreTo(Object obj)
//	{
//		int eid1=this.eid;
//		Employee e = (Employee)obj;
//		 int eid2=e.eid;
//		 
//		 if(eid1<eid2)
//		 {
//			 return -1;
//		 }
//		 else if(eid1>eid2)
//		 {
//			 return 1;
//		 }
//		 else return 0;
//	}
//
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}
//class CompComp
//{
//	public static void main(String[] args)
//	{
//		Employee e1 = new Employee("Samarth",101);
//		Employee e2 = new Employee("Peter",102);
//		Employee e3 = new Employee("Jhon",103);
//		Employee e4 = new Employee("Kiran",104);
//		
//		TreeSet t = new TreeSet();
//		t.add(e1);
//		t.add(e2);
//		t.add(e3);
//		t.add(e4);
//		System.out.println(t);
		
//		TreeSet t1 = new TreeSet(new MyComparator());
//		t1.add(e1);
//		t1.add(e2);
//		t1.add(e3);
//		t1.add(e4);
//		System.out.println(t1);
	}
}

//class MyComparator implements Comparator
//{
//	public int compare(Object obj1,Object obj2)
//	{
//		Employee e1 = (Employee)obj1;
//		Employee e2 = (Employee)obj2;
//		String s1 = e1.name;
//		String s2 = e2.name;
//		return s1.compareTo(s2);
//	}
//}