package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	
	public static void main(String[] args)
	{
//		int count=0;
		String s = "a36#k@9&";
//		Pattern p = Pattern.compile("bb");
//		Matcher m = p.matcher(s);
//		
//		while(m.find())
//		{
//			System.out.println(m.start()+"  "+m.end()+"   "+m.group());   /// end will return end+1 index 
//			count++;
//		}
//		System.out.println(count);
		
		/* 	[abc]  ------------   either 'a' or 'b' or 'c'.
		   	[^abc] ------------    '^'(Negation) Except 'a' and 'b' and 'c'
		 	[a-z]  -----------    Lowercase alphabet from a to z
		 	[A-Z]  ------------   any uppercase alphabet symbol fromn A to Z.
		 	[a-zA-Z] ----------- Any Alphabet (lowercase,uppercase including except digit)
		 	[0-9]   -------------  Any digit symbol
		 	[0-9a-zA-Z] ---------  Any alphanumeric symbol
		 	[^0-9a-zA-Z] ---------- Except alphnumeric character (Sepcail character only)
		 	
	
		 	
		  */
		 
		Pattern p1 = Pattern.compile("[^abc]");
		Matcher m1 = p1.matcher(s);

		while(m1.find())
		{
			System.out.println(m1.start()+"   "+m1.group());   /// end will return end+1 index 

		}
		
		
		Pattern p2 = Pattern.compile("[^0-9a-zA-Z]");
		Matcher m2 = p2.matcher(s);

		while(m1.find())
		{
			System.out.println(m2.start()+"   "+m2.group());   /// end will return end+1 index 

		}
		
//		*************************************** Pre-defined character *****************************************************	 	
//	 	\s 			-------- Space character
//	 	\S          -----------  Expect Space character
//	 	\d          -----------  Any digit from 0 to 9[0-9]
//	 	\D          ---------- Expect digit, any character
//	 	\w          ----------  Any word character[0-9a-zA-Z]
//	 	\W          ----------- Expect word character [special character]
//	 	.           ------------  Any character
		
		Pattern p3 = Pattern.compile("\\s");
		Matcher m3 = p3.matcher("a36@ k*9z");
		//System.out.println()
		while(m3.find())
		{
			System.out.print("Space characters : -");
			System.out.println(m3.start()+"   "+m3.group());   /// end will return end+1 index 

		}
//		char c ='a';
//		byte b = (byte)c;
		
		byte b = 95;
		char c = (char)b;
		
		
		Pattern p4 = Pattern.compile("\\S");
		Matcher m4 = p4.matcher("a36@ k*9z");
		//System.out.println()
		while(m4.find())
		{
			System.out.print("Expect Space characters : -");
			System.out.println(m4.start()+"   "+m4.group());   /// end will return end+1 index 

		}
		
		Pattern p5 = Pattern.compile("\\d");
		Matcher m5 = p5.matcher("a36@ k*9z");
		//System.out.println()
		while(m5.find())
		{
			System.out.print("Space characters : -");
			System.out.println(m5.start()+"   "+m5.group());   /// end will return end+1 index 

		}
		
		Pattern p6 = Pattern.compile("\\D");
		Matcher m6 = p6.matcher("a36@ k*9z");
		//System.out.println()
		while(m6.find())
		{
			System.out.print("Digit characters : -");
			System.out.println(m6.start()+"   "+m6.group());   /// end will return end+1 index 

		}
		
		Pattern p7 = Pattern.compile(".");
		Matcher m7 = p7.matcher("a36@ k*9z");
		//System.out.println()
		while(m7.find())
		{
			System.out.print("Any characters : -");
			System.out.println(m7.start()+"   "+m7.group());   /// end will return end+1 index 

		}
		
		
	//***********************************************Quantifiers *********************************************
	// a ---------- Excatly one 'a'
	// a+ --------- Atleast one 'a'
	// a* --------- Any number of 'a' including zero number
	// a? ---------- Atmost one 'a'	
		
		Pattern p8 = Pattern.compile("a");
		Matcher m8 = p8.matcher("abaabaaab");
		
		while(m8.find())
		{
			System.out.print("Exactly one characters : -");
			System.out.println(m8.start()+"   "+m8.group());   /// end will return end+1 index 

		}
		
		Pattern p9 = Pattern.compile("a+");
		Matcher m9 = p9.matcher("abaabaaab");
		
		while(m9.find())
		{
			System.out.print("Atlest one  characters : -");
			System.out.println(m9.start()+"   "+m9.group());   /// end will return end+1 index 

		}
		
		Pattern p10 = Pattern.compile("a?");
		Matcher m10 = p10.matcher("abaabaaab");
		
		while(m10.find())
		{
			System.out.print("Atmost one characters : -");
			System.out.println(m10.start()+"   "+m10.group());   // one or less than one character(zero)  

		}
		
		
		Pattern p11 = Pattern.compile("a*");
		Matcher m11 = p11.matcher("abaabaaab");
		
		while(m11.find())
		{
			System.out.print("Any number of characters : -");
			System.out.println(m11.start()+"   "+m11.group());   // any number of character including zero  
			
		}
		
		
		
		
	}

}
