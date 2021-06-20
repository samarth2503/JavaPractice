package OOPS;

abstract class Bank {
	
	public void rateofIntrest()
	{
		System.out.println("Intrest is 5%");
	}
	
	public abstract void BankName();
	

}

public class AbstractwithConstructor extends Bank
{

	public void BankName()
	{
		System.out.println("Name of Bank is SBI");
	}
	public void Bankbranch()
	{
		System.out.println("Andheri Branch");
	}
	
	public static void main(String[] args)
	{
		Bank abc = new AbstractwithConstructor();
		abc.rateofIntrest();
		abc.BankName();
		
	}
	
}
