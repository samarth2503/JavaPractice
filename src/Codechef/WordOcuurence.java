package Codechef;

import java.util.Scanner;

public class WordOcuurence {
	
	public static int Occurence(String word)
	{
		int count=0;
		String word_count="code";
		int word_len=word.length()-word_count.length();
		
		for(int i=0;i<=word_len;i++)
		{
			if(word.substring(i, i+word_count.length()).equals(word_count))
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the input = ");
		int count=s.nextInt();
		s.nextLine();
		
		while(count!=0)
		{
			String word = s.nextLine();
			
			System.out.println("The String "+word+" has "+Occurence(word)+" word_count");
			count--;
		}
//		
//		   String str = "Hello World!";  
//	          //Create a new scanner Object  
//	          Scanner scanner = new Scanner(str);  
//	          //Find a string "World"  
//	          System.out.println("Output: " + scanner.findInLine("World"));  
//	          //Print the rest of the string  
//	          System.out.println("Left String: " + scanner.nextLine());  
//	          scanner.close(); 
		
	}

}
