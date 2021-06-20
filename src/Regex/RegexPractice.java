package Regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
	
	public static void main(String[] args) throws IOException
	{
		////////////////////// Program to check valid phone number //////////////////////////
//		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
//		Scanner s = new Scanner(System.in);
//		CharSequence[] c = new CharSequence[4]; 
//		for(int i=0;i<c.length;i++)
//		{
//			c[i]=(CharSequence)s.nextLine();
//			Matcher m = p.matcher(c[i]);
//			
//			if(m.find() && m.group().equals(c[i]))
//			{
//				System.out.println("Vlaid mobile number");
//			}
//			else
//			{
//				System.out.println("Invalid Mobile number");
//			}
//		}
		
		
		////////////////////// valid email id ////////////////////////
		
//		Pattern p1 = Pattern.compile("[a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
//		Scanner s1 = new Scanner(System.in);
//		CharSequence[] c1 = new CharSequence[4]; 
//		for(int i=0;i<c1.length;i++)
//		{
//			c1[i]=(CharSequence)s1.nextLine();
//			Matcher m1 = p1.matcher(c1[i]);
//			
//			if(m1.find() && m1.group().equals(c1[i]))
//			{
//				System.out.println("Valid Email Id");
//			}
//			else
//			{
//				System.out.println("Invalid Email Id");
//			}
//		}
		
		/////////////////////// write pgm to read all mobile number present in given input file where mobile number mixed with normal text data /////////////////////////////
		
//		PrintWriter pw =new PrintWriter("D:\\Selenium WorkSpace\\JavaPractice\\OOPS\\Input.txt");
//		BufferedReader br = new BufferedReader(new FileReader("D:\\Selenium WorkSpace\\JavaPractice\\OOPS\\Output.txt"));
//		Pattern p3 = Pattern.compile("(0|91)?[7-9][0-9]{9}");
//		String line = br.readLine();
//		while(line!=null)
//		{
//			Matcher m3 = p3.matcher(line);
//			while(m3.find())
//			{
//				pw.println(m3.group());
//			}
//			line=br.readLine();
//		}
//		pw.flush();		
//		pw.close();
		
//   (0|1)?\\d[-]([0][1-9]|[1][012])[-](19|20)[0-9][0-9]   ----- Date Pattern.
	
	   
	    Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
	}

}
class MyRegex
{
	String pattern ="(0[.]|[0-9]\\d[.]|(1|0)[0-9][0-9][.]|2[0-4]\\d[.]|25[0-5][.]){3}(0|[0-9]\\d|(0|1)[0-9][0-9]|2[0-4]\\d|25[0-5])";
}

