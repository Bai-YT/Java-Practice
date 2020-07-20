import java.util.ArrayList;

public class Test1322
{
	public static void main (String args[])
	{
		MyBank tom = new MyBank(5000.0);
   		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.makeCheckingDeposit(2500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.makeCheckingWithdrawal(1500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
	}
}


abstract class Bank
{
	public abstract double getCheckingBalance();
	public abstract void makeCheckingDeposit(double amount);
	public abstract void makeCheckingWithdrawal(double amount);
   public void makeLoan(double amount);
}

