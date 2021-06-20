package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectionTest {
	
	A a1()
	{
		A a = new A();
		return a;
	}
	
	/*
	 * TypeCasting
	 * 
	 */
	Object a2()
	{
		A a = new A();
		return a;
	}
	
	/*
	 *   Making generic
	 *   
	 *   
	 */
	Object a3(String classname) throws InstantiationException, IllegalAccessException														
	{
		Object obj =null;
		try {
			obj = Class.forName(classname).newInstance();
			System.out.println("Class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
	
	void a4(String classname) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Class<?> cls = Class.forName(classname);
		A a = new A();
		Method meth[] = cls.getDeclaredMethods();
		
		for(Method methods:meth)
		{
			//System.out.println(methods.getName());
			//System.out.println(methods.getReturnType());
			//System.out.println(methods.getParameterCount());
			
			Class<?>[] para=methods.getParameterTypes();
			int count=methods.getParameterCount();
			if(count==1 && para[0]==int.class)
			{
				methods.invoke(a, 45);
			}
			else if(count==2 &&  para[0]==int.class && para[1]==String.class)
			{
				methods.invoke(a, 67,"Samarth");
			}
			
			
		}
		Method meth1[] = cls.getMethods();
		for(Method m:meth1)
		{
			System.out.println("------------------------------");
			System.out.println(m.getName());
		}
	}
	
	private void testMethod() throws InstantiationException, IllegalAccessException
	{
//		Object a = a1();
//		System.out.println("1");
//		System.out.println(a);
//		
//		Object obj = a2();											 Type Casting is used
//		A a1 = (A) obj;
//		System.out.println(a1);
		
		Object obj2=a3("Reflection.A");
		//A a2 = (A) obj2;
		System.out.println(obj2);
		
	}
	
	void m1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		Class<A> cls = A.class;									// It will stored all varibale,methods of Class A.
		Method methods[]=cls.getDeclaredMethods();
		A aaa = new A();
//		cls.getDeclaredMethod(name, parameterTypes) 			// this is useful for Particular methods
		
		/* to run a particular method
		  
		A aa = new A();
		Method meth = cls.getDeclaredMethod("m4",int.class);
		meth.invoke(aa, 67); */
		
		
		
		/* Requirement Suppose person 1 want m1,m2 methods to be exceuted, Person 2 want m4,m5
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("m1");
		al1.add("m2");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("m3");
		al2.add("m5");
		A aaa = new A();
		for(String methName : al1)
		{
			Method meth = cls.getDeclaredMethod(methName,int.class);
			meth.invoke(aaa, 67);
		} */
		
		
		
		for(Method method : methods)
		{
			System.out.println(method.getName());
			System.out.println(method.getReturnType());
			System.out.println("Paratmeter types are:"+method.getParameterTypes().toString());
			method.getParameterCount();
			Object obj[] = new Object[] {22,24,89};
			method.invoke(aaa,obj); 								// It will call method 1st parameter will contain instance of class 2nd will be arguments
		} 
		
		
	}
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException
	{
		ReflectionTest rt = new ReflectionTest();
		//rt.testMethod();
		try {
			rt.a4("Reflection.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



