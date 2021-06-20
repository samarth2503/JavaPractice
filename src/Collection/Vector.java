package Collection;
import java.util.*;
public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.setSize(2);
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);					// [A, B, C, D]
		s.pop();
		System.out.println(s);					// [A, B, C]
		System.out.println(s.peek());			// C
		System.out.println(s);					// [A,B,C]
	
		System.out.println(s.search("B"));			// 2
		System.out.println(s.search("Z"));			// -1
		
		for (int i=0;i<=s.size();i++)
		{
			System.out.println(s.pop());
		}
	}

}
