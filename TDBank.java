
public  class TDBank extends Bank implements BankInterface{
	
	int balance;
    String name;
	
	@Override
	public void accountname(String name) {
		
		this.name=name;
		
	}

	@Override
	public double getBalance() {
		return balance;
		
	}
	
	@Override
	public void setBalance(int x) {
		balance +=x;
		
	}
	
	@Override
	public void display() {
		
		System.out.println("Your account name "+name);
		System.out.println("Your account balance is: "+balance);
		
		
	}
	
	
	

}


