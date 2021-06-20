package Codechef;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Roughpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="[^A-Z]*";
		Pattern p;
		String input="AFREEN";
		String output="";
		int k=0;
		while(k<input.length())
		{
			
			if(k<input.length())
			{
				System.out.println("Lengt of "+k);
				String s = String.valueOf(input.charAt(k));
				p = Pattern.compile(s+"+");
				
				Matcher m = p.matcher(input);
				
				if(m.find())
				{
					if(m.group().length()>1)
					{
						int a = (int) input.charAt(k);
						
						while(true)
						{
							a=a-1;
							if(primenum(a))
							{
								char c = (char) a;
								System.out.println("Index is "+k);
								output += m.group().toString().replaceAll(s, String.valueOf(c));
								
								break;
							}
							
						}
						k+=m.group().length();
						//System.out.println("After increment index is "+k);
						
					}
					else if(m.group().length()==1)
					{
						int a = (int) input.charAt(k);
						
						while(true)
						{
							a=a+1;
							if(primenum(a))
							{
								char c = (char) a;
								output+=c;
								break;
							}
						}
						k++;
					}
					else
					{
						k++;
					}
					
				}
				
				
			}
			
			
		}
		System.out.println("String is "+output);

	}
	
	public static boolean primenum(int n)
	{
		if(n==0 || n==1)
		{
			return false;
		}
		else
		{
			int count=0;
			for(int k=2;k<n;k++)
			{
				if(n%k==0)
				{
					count++;
				}
			}
			if(count>0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	}

}
