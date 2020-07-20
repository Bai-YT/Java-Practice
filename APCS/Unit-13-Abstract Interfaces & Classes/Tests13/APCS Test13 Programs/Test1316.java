
public class Test1316
{
	public static void main (String args[])
	{
		BankAccounts tom = new BankAccounts(4000.0,6000.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.makeCheckingDeposit(1000.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.makeCheckingWithdrawal(2000.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
  		System.out.println();
  		System.out.println("Tom's savings balance:  " + tom.getSavingsBalance());
		tom.makeSavingsDeposit(3000.0);
		System.out.println("Tom's savings balance:  " + tom.getSavingsBalance());
		tom.makeSavingsWithdrawal(4000.0);
		System.out.println("Tom's savings balance:  " + tom.getSavingsBalance());
	}
}

abstract interface Checking
{
	public abstract double getCheckingBalance();
	public abstract void makeCheckingDeposit(double amount);
	public abstract void makeCheckingWithdrawal(double amount);
}

abstract interface Savings
{
	public abstract double getSavingsBalance();
	public abstract void makeSavingsDeposit(double amount);
	public abstract void makeSavingsWithdrawal(double amount);
}

class BankAccounts implements Checking, Savings
{
	private double checking;
	private double savings;

	public BankAccounts(double c, double s)				{ checking = c; savings = s; }
	public double getCheckingBalance()					   { return checking; }
	public double getSavingsBalance()					   { return savings; }
	public void makeCheckingDeposit(double amount)		{ checking += amount; }
	public void makeSavingsDeposit(double amount)		{ savings += amount; }
	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }
	public void makeSavingsWithdrawal(double amount)	{ savings -= amount; }
   public void transferToChecking(double amount)		
   { 
	   if (savings >= amount)
	   {
		   checking += amount;
		   savings  -= amount;
	   }
	   else
		   System.out.println("Insufficient Funds");
   }

}



