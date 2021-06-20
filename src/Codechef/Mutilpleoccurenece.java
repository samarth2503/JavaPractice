package Codechef;

public class Mutilpleoccurenece {
	
	public static void main(String[] args)
	{
		String input= "abracadabra";
		String unique="";
		String output="";
		for(int i=0;i<input.length();i++)
		{
			if(!unique.contains(String.valueOf(input.charAt(i))))
			{
				unique+=String.valueOf(input.charAt(i));
			}
			
		}
			
		for(int j=0;j<unique.length();j++)
		{
			
			for(int k=0;k<input.length();k++)
			{
				
				if(String.valueOf(unique.charAt(j)).equals(String.valueOf(input.charAt(k))))
				{
					output+=input.charAt(k);
				}
			}
		
		}
		
		System.out.println("Output is "+output);
	

//		
//		String input="Samarth";
//		String output="";
//		for(int j=input.length()-1;j>=0;j--)
//		{
//			output+=input.charAt(j);
//		}
//		System.out.println(output);
	
	}

}
