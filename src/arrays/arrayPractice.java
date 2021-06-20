package arrays;

import java.util.LinkedList;
import java.util.Scanner;

public class arrayPractice {
	
	public static void main(String args[])
	{
		String[] s = {"Durga","Soft","Channel"};
		Object[] o = s;

		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
		
		Object[] o1 = new Object[] {"String",10,10.5f,11.3,'c'};
		
		for(int i=0;i<o1.length;i++)
		{
			System.out.println(o1[i]);
		}
		
		int[] ch= {'a','b'};
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		char[] ch1 = {'a','b','c'};
		//int[] i1 = ch1;												// char[] type array cannot be promoted to int[] type.
		
		int[] a = {10,20,40};
		int[] b = {30,50};
		
		a=b;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);								// 30,50
		}
		
		///////////////// 2-D array /////////////////////
		
		int[][] x = new int[2][];
		x[0]=new int[] {'a','b'};
		x[1] = new int[] {10,20,40};
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println(x[i][j]);
			}
		}
		
		int[][][] y = new int[][][] {{{10,20,30},{40,50}},{{60,70,80},{90,100}}};			// Decalration,Initization,Instantiation.
		
		int[][][] k = new int[2][][];
		k[0] = new int[2][]; 
		k[0][0] = new int[3];
		k[0][1] = new int[2];
		
		k[1] = new int[3][];
		
		
		
		
	}
}
