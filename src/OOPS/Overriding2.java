package OOPS;

class Human
{
	public void eat()
	{
		System.out.println("Human eats's");
	}
	public void walk()
	{
		System.out.println("Human can walk");
	}

}

class Man extends Human
{
	public void eat()
	{
		System.out.println("Man eats a lot eats's");
	}
	
	public void walk()
	{
		System.out.println("Man walks very fast");
	}
	
}

public class Overriding2 {
	
	public static void main(String[] args)
	{
		Human h = new Man();
		h.eat();
		h.walk();
	}
	
	
}
