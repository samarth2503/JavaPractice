package Codechef;

import java.util.regex.Pattern;

public class space {
	
	public static void main(String[] args)
	{
		String input="IAmASoftwareTestEngineer";
		String output="";

		for(int i=0;i<=input.length()-1;i++)
			
		{
			boolean m = Pattern.matches("[A-Z]", String.valueOf(input.charAt(i)));
			try {
				
				if(m)
				{
					boolean n = Pattern.matches("[A-Z]", String.valueOf(input.charAt(i+1)));
					if(n)
					{
						output+=String.valueOf(input.charAt(i))+" ";
					}
					
					else
					{
						output+=String.valueOf(input.charAt(i));
					}
				}
				else
				{
					boolean n = Pattern.matches("[A-Z]", String.valueOf(input.charAt(i+1)));
					if(true)
					{
						output+=String.valueOf(input.charAt(i));
					}
				
					else
					{
						output+=String.valueOf(input.charAt(i));
					}
				}
				
			}
			catch(StringIndexOutOfBoundsException e)
			{
				output+=String.valueOf(input.charAt(i));
			}
			
			
		}
		System.out.println(output);
	}

}
