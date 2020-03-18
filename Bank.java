
public abstract class Bank 
{
	private double balance;
	
	public void balanceTotal(double b)
	{
		balance = b;
		System.out.println("your Toatal balance : "+balance);
		
	}
	public abstract void display();

}
