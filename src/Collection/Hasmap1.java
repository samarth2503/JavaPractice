package Collection;


import java.util.*;
import java.util.Map.Entry;
public class Hasmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer>m = new HashMap<String ,Integer>();
		m.put("Chiranjeevi",101);
		m.put("Balaish", 102);
		m.put("Venkatesh",103);
		m.put("Nagarjuna", 104);
		m.put("Balaish", 102);
		System.out.println(m);			// {Balaish=102, Chiranjeevi=101, Venkatesh=103, Nagarjuna=104}
		
		System.out.println(m.put("Chiranjeevi", 105));		//101
		
		System.out.println(m.get("Venkatesh"));
		System.out.println(m);
		m.remove("Nagarjuna");
		System.out.println(m);
		m.putIfAbsent("Samarth", 104);
		System.out.println(m);

		Set<String> s = m.keySet();
		System.out.println(s);			// [Balaish, Chiranjeevi, Venkatesh, Nagarjuna]
		
		Collection<Integer> c = m.values();
		System.out.println(c);			// [102, 105, 103, 104]
		
		Set<Map.Entry<String,Integer>> s1 = m.entrySet();
		System.out.println(s1);			// [Balaish=102, Chiranjeevi=105, Venkatesh=103, Nagarjuna=104]
		
		Iterator<Map.Entry<String, Integer>> itr =s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,Integer> m1 = itr.next();
//			 if(m1.getKey().equals("Venkatesh"))
//			 {
//				 m1.setValue(106);		
//			 }
			System.out.println(m1.getValue());
			System.out.println(m1.getKey()+"   "+m1.getValue());
		}
		System.out.println(m);			// {Balaish=102, Chiranjeevi=105, Venkatesh=106, Nagarjuna=104}
						
	}

}
