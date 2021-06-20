package Collection;
import java.util.*;

public class Examples {
		
		private static final String StringBuffer = null;

		public static void main(String args[])
		{
			/*ArrayList l = new ArrayList();
			l.add("A");
			l.add("B");
			l.add("C");
			l.add("D");
			l.add("E");
			
			System.out.println(l);
			
			ListIterator itr = l.listIterator(3);
			while(itr.hasPrevious())
			{
				String s = (String) itr.previous();
				if(s.equals("A"))
				{
					itr.add("E");
				}
				else if(s.equals("B"))
				{
					int a=itr.previousIndex();
					System.out.println(a);
				}
				else if(s.equals("C"))
				{
					itr.set("F");
				}
				
				System.out.println(s);
			}
			System.out.println(l);
			
		}*/
		/*LinkedHashSet h = new LinkedHashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);*/
			
		/*TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("Z");
		t.add("L");
		t.add("B");
		System.out.println(t); */
			/*StringBuffer sb = new StringBuffer("A");
			StringBuffer sb1 = new StringBuffer("B");
		System.out.println("A".compareTo(null));     //NPE
		System.out.println("Z".compareTo("K"));
		System.out.println("B".compareTo("B"));*/
		
		
		/*StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.append("abcdefghijklmnopq"));
		System.out.println(sb.capacity());*/
		
		/*String s = new String("Durga");
		System.out.println(s.length());
		
		String s1 = new String(new StringBuffer("Durga"));
		System.out.println(s1);
		
		char ch[]= {'j','a','v','a'};
		String s2 = new String(ch);
		//char[] ch= {'j','a','v','a'};
		System.out.println(s2);
				
		byte[] b = {97,98,99,100};
		String s3 = new String(b);
		System.out.println(s3);
			
		String s = " Samarth Jain ";
		//System.out.println(s.charAt(20));
		
		//String s1=s.concat("Solution");
		//System.out.println(s.replace('a','b'));
		
		System.out.println(s.length());
		System.out.println(s.trim().length());
			
		StringBuffer sb = new StringBuffer("Samarth");
		//System.out.println(sb.append("Jain"));
		//System.out.println(sb.append(3.14));
		
		//sb.append("ABC");
		//System.out.println(sb.capacity());
		//sb.trimToSize();
		String sb1 = "Prashant";
		System.out.println(sb1.length());*/
		/*LinkedList l = new LinkedList();
		l.add("A");
		l.add("B");
		l.add(10);
		System.out.println(l);
		l.set(1,"Durga");
		l.add(2,"Software");
		System.out.println(l);
		l.addFirst("Venky");
		l.removeLast();
		l.addLast("Jain");
		System.out.println(l.size());
		//ArrayList al = new ArrayList(l);
		//al.add("Rajendra");
		//System.out.println(l);
		List l1 = new ArrayList(); */
			
		List v = new ArrayList();
		boolean a=v.add("A");
		System.out.println(a);
		
	}
}

