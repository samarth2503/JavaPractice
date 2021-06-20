package Collection;

import java.util.*;

public class IdentityHashMap1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*HashMap m = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		m.put(i1, "Pawan");
		m.put(i2, "kalyan");
		System.out.println(m);					// {10=kalyan} */
		
		
//		IdentityHashMap m = new IdentityHashMap();
//		Integer i1 = new Integer(10);
//		Integer i2 = new Integer(10);
//		
//		m.put(i1, "Pawan");
//		m.put(i2, "kalyan");
//		System.out.println(m);					// {10=Pawan, 10=kalyan}
		
		
		
// Temp object not eligible for gc because it is associated with hashmap.
		
		WeakHashMap h = new WeakHashMap();
		Temp t = new Temp();
		System.out.println(t);					// temp
		h.put(t,"Durga");
		System.out.println(h);					// {temp=Durga}
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(h);					// {temp=Durga}
	}

}
class Temp
{
	
	public String toString()
	{
		return "temp";
	}
	
	public void finalize()
	{
		System.out.println("Finalize method");
	}
}

// Temp object eligible with gc becuase it is associated with WeakHashMap.

/*WeakHashMap h = new WeakHashMap();
Temp t = new Temp();
System.out.println(t);					// temp
h.put(t,"Durga");
System.out.println(h);					// {temp=Durga}
t=null;
System.gc();							// finalize method.
Thread.sleep(5000);
System.out.println(h);					// {}
}

}
class Temp
{

public String toString()
{
return "temp";
}

public void finalize()
{
System.out.println("Finalize method");
}
}*/



