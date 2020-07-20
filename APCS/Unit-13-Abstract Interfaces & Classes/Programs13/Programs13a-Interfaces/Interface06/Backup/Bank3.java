// Interface06
// This <Bank3> class implements the <Bank2> interface
// and also provides a <getRate> method.


public class Bank3 implements Bank2
{
   private int account;
	private double balance;

	public Bank3(int a, double c)					
   {
      account = a; 
      balance = c;	
   }
   
   public double getRate()                   
   { return rate; }
   
   public int getAccount()                   
   { return account; }

	public double getBalance()					   
   { return balance; }

	public void makeDeposit(double amount)		
   { balance += amount; }

	public void makeWithdrawal(double amount)	
   { balance -= amount; }
}


