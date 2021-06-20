package Collection;

public class Staticblock {
	
	static int i=10;
	
	static											// --1								
	{
		m1();
		System.out.println(i);
		System.out.println("First static block");
	}
	
	public static void main(String[] args)				//  --3
	{
		//m1();
		System.out.println(i);
		System.out.println("Main method");
	}
	
	public static void m1() {
		// TODO Auto-generated method stub
		System.out.println("Inside static method");
		System.out.println(i);
	}
	static											// --2
	{
		m1();
		
		System.out.println("Second static block");
	}
	
	static int j=20;
	
}

////// Exceution sequence of static block ///////
	
//	public static void main(String[] args)
//	{
//		/*System.out.println(15>>2);
//		System.out.println(20<<5);
//		
//		System.out.println(-20>>2);  
//	    System.out.println(-20>>>2);*/
//	    
//	    int [] a= {1,2,5,6,3,2};
//	    a[0]=10;
//	    a[1]=20;
//	    a[2]=30;
//	    a[3]=40;
//	    a[4]=50;
//	    int b=0;
//	    
////	    for(int i=0;i<a.length;i++)
////	    {
////	    	b+=10;
////	    	a[i]=b;
////	    	System.out.println("The value of array is"+ a[i]);
////	    }
//	    int temp;
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	for(int j=i+1;j<a.length;j++)
//	    	{
//	    		if(a[i]>a[i+1])
//	    		{
//	    			temp=a[i];
//	    			a[i]=a[i+1];
//	    			a[i+1]=temp;
//	    		}
//	    	}
//	   	    
//	    }
//	    System.out.println(a[1]);  
//	 
//	    
	    
//	}
//}



