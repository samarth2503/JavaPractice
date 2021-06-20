package Codechef;

import java.util.Scanner;

public class BasicBallonPrbm {
	
	public static void main(String args[] ) throws Exception {
		Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        
        int arr[][] = new int[10][2];
        int cost=1;
        int sum=0;
        int count=1;
        while(testcases!=0)
        {
            int green = s.nextInt();
            int purple = s.nextInt();
            int participants = s.nextInt();

            for(int i=0;i<10;i++)
            {
                for(int j=0;j<2;j++)
                {
                    arr[i][j]=s.nextInt();
                }
                
            }

            for(int i=0;i<participants;i++)
            {
            	if(count%2!=0)
            	{
            		if(arr[i][0]==1)
                	{
                		sum+=cost*green;
                	}
                	if(arr[i][1]==1)
                	{
                		sum+=cost*purple;
                	}
                	if(arr[i][0]==0)
                	{
                		sum+=0;
                	}
                	if(arr[i][1]==0)
                	{
                		sum+=0;
                	}
            	}
            	
            	if(count%2==0)
            	{
            		if(arr[i][0]==1)
                	{
                		sum+=cost*purple;
                	}
                	if(arr[i][1]==1)
                	{
                		sum+=cost*green;
                	}
                	if(arr[i][0]==0)
                	{
                		sum+=0;
                	}
                	if(arr[i][1]==0)
                	{
                		sum+=0;
                	}
            	}
            	
              
            }

            System.out.println(sum);
            sum=0;
            testcases--;
            count++;
            
        }

	}

}
