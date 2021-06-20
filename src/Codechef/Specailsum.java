package Codechef;

import java.util.Scanner;

public class Specailsum {
	
	public static void main(String[] args)
	{
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
	
		int max=0;
		int sum=0;
		int k=0;
		for(int b=0;b<a.length;b++)
		{
			
			if(k<a.length)
			{
				int len = k+b;
				for(int c=k;c<=len;c++)
				{
					System.out.println("K plus b is ="+(k+b));
					sum+=a[c];
					System.out.println("sum is ="+sum);
					k=c;
					System.out.println("Index is"+k);
				}
				System.out.println("Out of loop");
				k++;
				if(sum>max)
				{
					max=sum;
				}
				sum=0;
				
			}
			
					
		}
		System.out.println(sum);
	}

}
