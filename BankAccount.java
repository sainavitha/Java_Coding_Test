package activities;
public class BankAccount 
    {
	private double balance;
	
	public BankAccount(double initial_balance)
	{
		
	balance=initial_balance;
		
	}
	public void deposit(double Amt)
	{
		if(Amt>0)
		{
			balance+=Amt;
			System.out.println("Deposited: " +Amt);
		}
		else
		{
			System.out.println("please Deposit amount must be positive.");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
			System.out.println("withdraw: " +amount);
		}
		else if(amount>balance)
		{
			System.out.println("Insufficient amount......! ");
			
		}
		else 
		{
			System.out.println("withdraw amount must be positive");
			
		}
	
	}
	public double getBalance() {
		return balance;
	}
	public static void main(String[] args)
	{
	BankAccount Acc=new BankAccount(1000.00); 
        System.out.println("Balance: " + Acc.getBalance());
	Acc.deposit(400.00);
	System.out.println("balance after deposit is: " +Acc.getBalance());
	Acc.withdraw(100.00);
	System.out.println("balancr after withdraw: " +Acc.getBalance());
	Acc.withdraw(1500.00);
        System.out.println("Balance after withdraw: " + Acc.getBalance());
        // Try to deposit a negative amount
        Acc.deposit(-100.00);
        System.out.println("Balance after negative deposit: " + Acc.getBalance());
}
}
