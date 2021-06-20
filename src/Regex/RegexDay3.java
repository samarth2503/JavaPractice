package Regex;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class RegexDay3 {
	
	public static void main(String[] args)
	{
		/////////////////Split by caharcter //////////////////////
		
		Pattern p = Pattern.compile("a");
		String[] s = p.split("Durga Software Solution");
		for(String s1 : s)
		{
			System.out.println(s1);
		}
		
		/////////////////Split by Space //////////////////////////
		
		Pattern p1 = Pattern.compile("\\s");
		String[] s1 = p.split("Durga Software Solution");
		for(String s2 : s1)
		{
			System.out.println(s2);
		}
		
		//////////////////// Spli by "."///////////////////////////
		Pattern p3 = Pattern.compile(".");
		String[] s3 = p3.split("www.durgasoft.com");
		for(String s4 : s3)
		{
			System.out.println(s4);							/// No output
		}
		
		///////////////////// split by symbol ///////////////////////
		
		Pattern p4 = Pattern.compile("\\.");         			// According to particualr pattern
		String[] s4 = p4.split("www.durgasoft.com");
		for(String s5:s4)
		{
			System.out.println(s5);
		}
		
		//////////////////////StringTokenizer /////////////////////////
		
		StringTokenizer st = new StringTokenizer("Durga Soft");
		
		while(st.hasMoreTokens())
		{
			System.out.println("Tokens are : "+st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer("19-04-2019","-");
		while(st1.hasMoreTokens())
		{
			System.out.println("Tokens are : "+st1.nextToken());
		}
	}

}
