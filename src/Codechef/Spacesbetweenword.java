package Codechef;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spacesbetweenword {
	
	public static void main(String args[])
	{
//		String s = "My   Name   Is    Ram";
//		String output=s.replaceAll("\\s+", " ");
//		System.out.println(output);
		
	/*	int ar[] = new int[] {1,2,3,4,5,6};
		int leng=ar.length;
		int br[] = new int[ar.length];
		for(int i=leng-1;i>=leng/2;i--)
		{
			br[leng-i-1]=ar[i];
		}
		
		for(int j=0;j<leng/2;j++)
		{
			br[(leng/2)+j]=ar[j];
		}
		
		for(int out:br)
		{
			System.out.print(out+",");
		}*/
		
		String input = "IAmASoftwareEnginner";
		
		String result = ""+input.charAt(0);		
		
		for(int i=1;i<input.length();i++)
		{
			//boolean m = Pattern.matches("[A-Z]", String.valueOf(input.charAt(i)));
			String charcter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String m = String.valueOf(input.charAt(i));
			
			if(charcter.contains(m))
			{
				result+=" "+input.charAt(i);
			}
			else
			{
				result+=input.charAt(i);
			}
			
		}
		System.out.println("Ouput is "+result);
	}

}
