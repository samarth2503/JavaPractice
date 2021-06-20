package Codechef;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Magicalword {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		Pattern p;
		
		int testcase = s.nextInt();
		s.nextLine();
		String output="";
		int k=0;
		while(testcase!=0)
		{
			String input=s.nextLine();
			while(k<input.length())
			{
				
				if(k<input.length())
				{
					System.out.println("Lengt of "+k);
					String s1 = String.valueOf(input.charAt(k));
					p = Pattern.compile(s1+"+");
					
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
									
									output += m.group().toString().replaceAll(s1, String.valueOf(c));
									
									break;
								}
								
							}
							k+=m.group().length();
							
							
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
			testcase--;
			System.out.println(output);
			output="";
			
		}
		
		

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
