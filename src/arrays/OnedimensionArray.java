package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class OnedimensionArray {
	
	public static void main(String args[])
	{
		int arr[] = new int[5];
		arr[0]=50;
		arr[1]=22;
		arr[2]=21;
		arr[3]=14;
		arr[4]=15;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The values are :" + arr[i]);
		}
		
		int min=arr[0];
		
		for(int j=1;j<arr.length;j++)
		{
			if(min>arr[j])
			{
				min=arr[j];
				
			}
		}
		System.out.println("the minium value is : "+min);
		
		Object obj[] = new Object[3];
		obj[0]=1;
		obj[1]=2;
		obj[2]=3;
		
		
		int obj1[]= {11,12,13};
		
		Integer[] arrr=new Integer[] {23,2,42,5};
		System.out.println(arrr[2]);
		int arr2[] = new int[3];
		List<Object[]> li = new ArrayList<Object[]>();
		li.add(new Object[] {89,90,65});
		System.out.println(li.get(0)[2]);
		
		
		 Account obj3[] = new Account[2] ;
	     obj3[0] = new Account();
	     obj3[1] = new Account();
	     obj3[0].setData(1,2,7);
	     obj3[1].setData(3,4,9);
	    //System.out.println("For Array Element 0");
	    //obj3[0].showData();
	    System.out.println("For Array Element 1");
	     obj3[1].showData();
	}

}

class Account{
	  int a;
	  int b;
	 public void setData(int c,int d,int e){
	   a=c;
	   b=d;
	   System.out.println(e);
	 }
	 public void showData(){
	   System.out.println("Value of a ="+a);
	   System.out.println("Value of b ="+b);
	 }
	}
