package Collection;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		h.add("S");
		h.add("A");							// hascode=65
		h.add("B");							// hascode = 66
		h.add("S");
		//h.add(10);							// hascode = 10
		h.add("M");							// hascode ==77
		//h.add(null);						// hashcode(null)==0
		System.out.println(h);
		System.out.println(h.hashCode());			// hashcode 0f all the element is 301
		Iterator<String> itr = h.iterator();
		
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.print(s);
			System.out.println(s.hashCode());
		}
	
	
	
	LinkedHashSet<String> lh = new LinkedHashSet<String>();
			lh.add("A");
			lh.add("B");
			lh.add("M");
			lh.add("E");
			lh.add("C");
			lh.add("M");
			System.out.println(lh);
	}

}
