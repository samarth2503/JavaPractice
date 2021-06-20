package Collection;
import java.util.*;  
class ArrayList1{  
	
	int rollno;
	String name;
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Ravi");//Adding object in arraylist  
  list.add("Vijay");  
  list.add("Ravi");  
  list.add("Ajay");  
  
  Collections.sort(list);
  
  System.out.println("After Sorting : "+list);
  
  ArrayList<Integer> al = new ArrayList<Integer>();
  al.add(11);
  al.add(12);
  al.add(13);
  List<String> a = list.subList(0, 2);
  System.out.println(a);
  //boolean b= list.addAll(al);
  System.out.println(list);
  //Traversing list through Iterator  
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  } 
	 list.add(2,"Sam");
	 list.add(3,"Ram");
	 System.out.println(list);
	 
	 String s=list.remove(4);
	 System.out.println(s);
	 
	 System.out.println(list.remove("Sam"));			//true
	 System.out.println(list.remove(4));				//Ajay
	 System.out.println(list);
	 
	 System.out.println(list.contains("Ram"));
	 System.out.println(list.size());
	 
	 System.out.println(list.get(0));
	 System.out.println(list.set(3,"Jay"));				//Replace Ravi by Jay.
	 System.out.println(list);
	 
	 list.add(4,"Ram");
	 System.out.println(list);
	 System.out.println(list.lastIndexOf("Ram"));			//Last occurence of specified Object (4)
	 
	 System.out.println(list.indexOf("Ram"));			//First Occurence (2) 
	 
	 System.out.print(list.subList(2,5));
	 
//	 ArrayList1 (int rollno,String name)
//	 {
//		 this.rollno=rollno;
//		 this.name=name;
//	 }
 }	 
}  
//public class ArrayList2
//{
//	//public static void main(String args[])
//	{	
//		List<String> al = new ArrayList<String>();
//		al.add("A");
//		al.add("B");
//		al.add("C");
//		al.add(1,"D");
//		al.add(4,"E");
//		
//		System.out.println(al);
//		//System.out.println(l1);
//		
//		ArrayList<Object> l2 = new ArrayList<Object>();
//		l2.add("A");
//		l2.add("B");
//		l2.add("C");
//		l2.add(1,"D");
//		l2.add(4,"E");
//		Collections.reverse(l2);
//		System.out.println(l2);
//		l2.addAll(al);
//		
//		ListIterator<Object> lI = l2.listIterator(l2.size());
//		while(lI.hasPrevious())
//		{
//			System.out.println(lI.previous());
//		}
//		System.out.println(l2);
////		System.out.println(l2.get(0));
////		System.out.println(l2.containsAll(al));
////		System.out.println(l2);
//		if (al.equals(l2))
//		{
//			System.out.println("Equla");
//		}
//		else
//		{
//			System.out.println("Not Equla");
//		}
////		int j =l1.size()-1;
////		for(int i=j;i>=0;i--)
////		{
////			l2.add(l1.get(i));	
////		}
////		System.out.println(l2);
//		//System.out.println(l1);
//		/*ArrayList1 a = new ArrayList1(12,"Samarth");
//		ArrayList1 b = new ArrayList1(13,"Jhon");
//		
//		ArrayList<ArrayList1> a1 = new ArrayList<ArrayList1>();
//		a1.add(a);
//		a1.add(b);
//		for(ArrayList1 a2:a1)
//		{
//			System.out.println(a2.rollno+" "+a2.name);
//		}*/
//}
//}
//
