import java.util.ArrayList;

public class Test1325
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
}


class MyBank extends Bank
{
	private double checking;
	public MyBank(double c)								{ checking = c;	}
	public double getCheckingBalance()					{ return checking; }
	public void makeCheckingDeposit(double amount)		{ checking += amount; }
	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }
}
