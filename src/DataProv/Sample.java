package DataProv;

import java.util.LinkedList;
import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args)
	{
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 0; i < N; i++) {
//            int value = scan.nextInt();
//            list.add(value);
//        }
//        
		String seats[] = new String[108];
        int k=0;
        Scanner s = new Scanner(System.in);
        
        for(int i =1;i<=9;i++)
        {
            for(int j=1;j<=12;j++)
            {
                if(j==1 || j==6 || j==7 || j==12)
                {
                    seats[k]="WS";
                    k++;
                }

                if(j==2|| j==11 || j==5 || j==8)
                {
                    seats[k]="MS";
                    k++;
                }

                if(j==3 || j==10 || j==4 || j==9)
                {
                    seats[k]="AS";
                    k++;
                }
            }
        }
        
        int testcase = s.nextInt();
        for(int c=0;c<testcase;c++)
        {
        	int seat = s.nextInt();
            for(int l=1;l<=6;l++)
            {
            	if(l<=3)
            	{
            		if(seats[seat+l-1].equals(seats[seat-1]))
            	    {
            		    System.out.println(seat+l+" "+seats[seat+l-1]);
            		    break;
                    }
            	}
            	else
            	{
            		int count=0;
            		if(seats[seat-l].equals(seats[seat-1]))
            	    {
            			count++;
            		    System.out.println(seat-(count)+" "+seats[seat+l-1]);
            		    break;
                    }
            	}
                
            }
        }

	}
	

}
