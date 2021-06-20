package Collection;

import java.util.ArrayList;
import java.util.Hashtable;

public class hashtable {
	
	public static void main(String[] args)
	{
		Hashtable<String,String> hm = new Hashtable<String,String>();
		
		hm.put("1", "Samarth");
		hm.put("2", "Mahesh");
		hm.put("1", "Mukesh");
		hm.put("3", "Rakesh");
		hm.put("4","NA");
		hm.put("5","NA");
		hm.put("6","NA");
		
		System.out.println("Hashtable is "+hm.toString());
		ArrayList<Hashtable<String,String>> al = new ArrayList<Hashtable<String,String>>();
		
		al.add(hm);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println("Key values are = "+al.get(i));
		}
		
		Object[] obj = new Object[al.size()];
		obj=al.toArray(obj);
		System.out.println("Length of array is = "+obj.length);
		for(int j=0;j<obj.length;j++)
		{
			System.out.println("Object are "+obj[j]);
		}
		
	}

}
