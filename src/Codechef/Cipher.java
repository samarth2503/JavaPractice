package Codechef;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cipher {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String input= s.nextLine();
		int c = s.nextInt();
		String output="";
		String n="";
		
		
		for(int i=0;i<input.length();i++)
		{
			//System.out.println("I is :-"+i);
			//System.out.println("I is :-"+String.valueOf(input.charAt(i)));
			boolean str = Pattern.matches("[A-Za-z]", String.valueOf(input.charAt(i)));
			
			boolean num = Pattern.matches("[0-9]", String.valueOf(input.charAt(i)));
			
			/*if(num)
			{
				n+=String.valueOf(input.charAt(i));
				
				while(num)
				{
					
					k=i;
					//System.out.println("Number is :-"+k);
					try {
						k+=1;
						System.out.println("Next Index "+k);
						num = Pattern.matches("[1-9]", String.valueOf(input.charAt(k)));
						n+=String.valueOf(input.charAt(k));
					}
					catch(IndexOutOfBoundsException e)
					{
						break;
					}
					System.out.println("Next number "+String.valueOf(input.charAt(k)));
					System.out.println("Is number :-"+num);
				}
				
			}
			String strnum ="1234567890";
			String k =String.valueOf(input.charAt(i));
			while(k.contains(strnum))
			{
				n+=k;
				i+=1;
				k=String.valueOf(input.charAt(i));
				//break;
				System.out.println("Number is "+n);
			}*/
			
			
			
			
			boolean spc = Pattern.matches("[^1-9A-Za-z]", String.valueOf(input.charAt(i)));
			if(str)
			{
				int b = (int) input.charAt(i);
				if(b>=65 && b<=90)
				{
					if(b<=90-c)
					{
						int a = b+c;
						output+= (char)a;
					
					}
					else
					{
						int a=b-26+c;
						if(a<=90)
						{
							output+= (char)a;
						}
						else
						{
							while(!(a<=90))
							{
								a=a-26;
							}
							output+= (char)a;
						}
					}	
						
					
				}
			
				else if(b>=97 && b<=122)
				{
					
					if(b<=(122-c))
					{
						int a = b+c;
						output+= (char)a;
					}
					else
					{
						int a=b-26+c;
						if(a<=122)
						{
							output+= (char)a;
						}
						else
						{
							while(!(a<=122))
							{
								a=a-26;
							}
							output+= (char)a;
						}
						
						
					}
				}
				 
			}
			
			else if(num)
			{
				int number = Integer.parseInt(String.valueOf(input.charAt(i)));
				
				number=((number+c)%10)+48;
				
				output+=String.valueOf((char)number);
				
			}
			
			else
			{
				
				output+=String.valueOf(input.charAt(i));
				
			}
		}
		System.out.println(output);
	}

}

