
public class TestBank {
	public static void main(String []args)
	{
		TDBank td = new TDBank();
		//td.a(")  ;
		td.accountname("TD Checking !");
		
		
		td.setBalance(500);
		td.setBalance(100);
		Bank bank = new TDBank();
		
		td.display();
	    bank.balanceTotal(td.getBalance());
	}

}
