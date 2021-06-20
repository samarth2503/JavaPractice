package Collection;
// 1) Insertion order preserved in LinkedHashMap.
// 2) LinkedHashSet band LinkedHashMap are coimmonly used for developing cache based application.
// all the methods and constructor present in Hashmap are available for LinkedHashMap.

import java.util.*;
public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> m = new LinkedHashMap<String,Integer>();
		
		m.put("Chiranjeevi",101);
		m.put("Balaish", 102);
		m.put("Venkatesh",103);
		m.put("Nagarjuna", 104);
		System.out.println(m);				// {Chiranjeevi=101, Balaish=102, Venkatesh=103, Nagarjuna=104}

	}

}







