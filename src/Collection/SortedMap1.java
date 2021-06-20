package Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1 {
	
	public static void main(String args[])
	{
	
		TreeMap<Integer,String> m = new TreeMap<Integer,String>();
		m.put(100,"First");
		m.put(103,"third");
		m.put(104,"four");
		m.put(102,"Two");
		m.put(100,"Zero");
		m.put(107,"Seven");
		m.put(110,"Ten");
		//m.put(104,106);
		System.out.println(m.firstEntry());
		//System.out.println(m.pollFirstEntry());
		System.out.println(m.ceilingKey(111));
		System.out.println(m);
		
		Map.Entry<Integer,String> m1 = (Entry<Integer, String>) m.entrySet();
		System.out.println(((TreeMap<Integer, String>) m1).higherEntry(104));
	}

}
