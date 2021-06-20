package arrays;

public class ArraySolution {
	
	public static void main(String[] args)
	{
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		int[] b = new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j>i;j--)
			{
				
				if(a[i]>a[j])
				{
					b[i]=a[i];
				}
				else
				{
					b[i]=a[j];
				}
			}
			
			
		}
		for(int k=0;k<b.length;k++)
		{
			System.out.println(b[k]);
		}
		
		
	}

}
