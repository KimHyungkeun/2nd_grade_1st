package Question7;

public class BankAccount {

	private double balance;
	public BankAccount(double balance) {
		// TODO Auto-generated constructor stub
		
		if(balance < 0)
		{
			IllegalArgumentException exception = new IllegalArgumentException("Balance must be positive");
			throw exception;
		}
		this.balance = balance;
		System.out.println("Inputed Balance = "+this.balance);
	}
	
	public void add(double amount)
	{
		System.out.println("Amount = "+amount);
		if(amount < 0)
		{
			IllegalArgumentException exception = new IllegalArgumentException("Amount must not negative!!");
			throw exception;
		}
		balance = balance + amount;
		System.out.println("Balance = "+balance);
	}
	
	public void withdraw(double amount)
	{
		System.out.println("Amount = "+amount);
		if(amount > balance)
		{
			IllegalArgumentException exception = new IllegalArgumentException("Amount exceeds balance!!");
			throw exception;
		}
		balance = balance - amount;
		System.out.println("Balance = "+balance);
	}

}
