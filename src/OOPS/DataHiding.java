// Outside person can't access our internal data directly or internal data should not go out directly this oops feature is nothing but Datahiding.
// after validation or Authentication outside person can access our internal data.
// eg:-Gmail,Facebook (need username and password to access application)
// This feature is possible by declaring data member(variable) as private.
// Advantage of data hiding is security.

package OOPS;

class Data {
	
	private double balance;
	
	public Data(double balance)
	{
		this.balance=balance;
	}
	
	public double withdrawl(double amount)
	{
		if(amount>balance)
		{
			return 0.0;
		}
		else
		{
			balance=balance-amount;
			return amount;
		}
	}
	
	public double getbalance()
	{
		//withdrawl(amount);
		return balance;
	}

}

public class DataHiding
{
	public static void main(String[] args)
	{
		Data d = new Data(1234.0);
		System.out.println(d.getbalance());
	}
}