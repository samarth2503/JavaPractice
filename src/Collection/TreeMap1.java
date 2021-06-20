package Collection;
import java.util.*;
public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap m = new TreeMap();
		m.put(100,"ZZZ");
		m.put(103,"YYY");
		m.put(101,"XXX");
		m.put(104,106);
		m.put(null, "CCC");					// NPE.
		System.out.println(m);				//  {100=ZZZ, 101=XXX, 103=YYY, 104=106}
	}

}		
