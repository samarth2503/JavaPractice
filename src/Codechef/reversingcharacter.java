package Codechef;

import java.util.Scanner;
import java.util.regex.Pattern;

public class reversingcharacter {
	
	
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		anagrams(s1,s2);
		
	}
	
	public static void anagrams(String s1,String s2)
	{
		boolean status = true;
		
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s", "").toLowerCase();
		int count=0;
		if(s1.length()!=s2.length())
		{
			status=false;
		}
		else
		{
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			
			for(char c:c1)
			{
				
				int index = s2.indexOf(c);
				
				if(index!=-1)
				{
					s2=s2.substring(0,s2.indexOf(c))+s2.substring(s2.indexOf(c)+1, s2.length());
					count++;
				}
				else
				{
					
					status=false;
				}
			}
			System.out.println("Count is "+count);
			if(status)
			{
				System.out.println("String are anagrams");
			}
			else
			{
				System.out.println("String are anagrams");
			}
		}
	}

}
