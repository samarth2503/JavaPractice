package Codechef;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int q = s.nextInt();
        Example(a,q);

	}
	
	
	
	public static void Example(int b,int q)
    {
        Scanner s = new Scanner(System.in);
        int a[] = new int[b];
        int sum=0;
        for(int j=0;j<b;j++)
        {
            a[j]=j+1;
        }
        while(q!=0)
        {
            int first = s.nextInt();
            int second = s.nextInt();
            int diff = second - first;
            for(int k=first;k<second;k++)
            {
                sum+=a[k];
            }
            
            int div = (sum/diff);
            sum=0;
            System.out.println(Math.floor(div));
            q--;
        }
    }

}
