class  BankAccount
{
	private double balance;
	public double getBalance()
	{
		return balance;
	}
	public void setDeposit(double amount)
	{
		this.balance+=amount;//Implement deposite logic here
	}
	public void setWithdraw(double amount)
	{
		this.balance-=amount;//Implement withdraw logic here
	}
}

class DriverClass2
{

	public static void main(String[] args) 
	{
		BankAccount account=new BankAccount();
		System.out.println("Balance Initial:"+account.getBalance());
		account.setDeposit(1000);
		System.out.println("Balance After Deposit:"+account.getBalance());
        account.setWithdraw(500);
		System.out.println("Balance After withdraw:"+account.getBalance());
		
	}
}


/*
Encapsulation is one of the fundamental principles of object-oriented programming(OOP) 
        and involves hiding internal data and implementation details of a class and providing access to them through methods. 
		It helps in achieving data abstraction and protects the data from unauthorized access. */