package Collection;
import java.util.LinkedList;

class A
{
	
}
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();
		l.add("Raj");
		l.add("Vijay");
		l.add("Albert");
		l.add("James");
		//System.out.println(l);					//[Raj, Vijay, Albert, James]
		l.addFirst("Samarth");
		l.addLast("Jain");
		System.out.println(l);					//[Samarth, Raj, Vijay, Albert, James, Jain]
		
		System.out.println(l.getFirst());			// Samarth
		System.out.println(l.getLast());			// Jain
		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		//System.out.println(l.poll());
		System.out.println(l);
		//System.out.println(l.removeLast());				//Jain
		//System.out.println(l.removeFirst());			// Samarth
		
		System.out.println(l);					//[Raj, Vijay, Albert, James]
		l.
		//l.remove("James");						// [Raj, Vijay, Albert]
		//l.remove();									// Raj
		//System.out.println(l.remove(1));				// Albert
		
		//System.out.println(l);						//[Vijay]

		LinkedList l1 = new LinkedList();
		l1.add("King");
		l1.add("Soilder");
		System.out.println(l.addAll(l1));			// true
		System.out.println(l);					// [Samarth, Raj, Vijay, Albert, James, Jain, King, Soilder]
		
		
		
	}

}
