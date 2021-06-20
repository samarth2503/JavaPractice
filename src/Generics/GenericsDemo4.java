package Generics;

public class GenericsDemo4 {
	
	public static void main(String[] args)
	{
		// String
		
		Gen<String> g = new Gen<String>("Durga");
		g.show();
		g.getObj();
		
		// Double
		
		Gen<Double> g1 = new Gen<Double>(10.55);
		g1.show();
		g1.getObj();
		
		// Integer
		
		Gen<Integer> g2 = new Gen<Integer>(10);
		g2.show();
		g2.getObj();
	}

}

class Gen<T>
{
	T ob;
	public Gen(T ob)
	{
		this.ob=ob;
	}
	
	public void show()
	{
		System.out.println("The type of parameter is : "+ob.getClass().getName());
	}
	
	public T getObj()
	{
		System.out.println("The Object is : "+ob);
		return ob;
	}
}
