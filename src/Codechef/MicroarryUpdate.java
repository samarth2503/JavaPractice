package Codechef;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MicroarryUpdate {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        int time=0;
        while(testcases!=0)
        {
            int arrlength = s.nextInt();
            int k = s.nextInt();
            int count=0;
            int arr[] = new int[arrlength-1];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=s.nextInt();
            }
            
            Arrays.sort(arr);
            int first =arr[0];
            while(first<k)
            {
            	first=first+1;
            	count++;
            }
            
            System.out.println(count);
            testcases--;
        }
	}

}
