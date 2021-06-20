package Codechef;

public class ToogleString {
	
	public static void main(String[] args)
	{
		String s="Samarth";
		String output="";
		String upper="";
		String lower="";
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			//Character ch = new Character(c);
			if(Character.isLowerCase(c))
			{
				//upper+=c;
				output+=Character.toString(c).toUpperCase();
				//upper="";
			}
			else
			{
				//lower+=c;
				output+=Character.toString(c).toLowerCase();
				//lower="";
			}
		}
		
		System.out.println("Output is :"+output);
		
	}

}
