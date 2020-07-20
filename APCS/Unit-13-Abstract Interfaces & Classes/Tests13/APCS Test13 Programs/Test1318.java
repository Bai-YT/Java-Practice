
public class Test1318
{
	public static void main (String args[])
	{
		MyBank tom = new MyBank(7000.0);
 		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.makeCheckingDeposit(2500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.makeCheckingWithdrawal(1500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.computeInterest();
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
	}
}

abstract interface Bank
{
	public double rate = 0.05;
	public abstract double getCheckingBalance();
	public abstract void makeCheckingDeposit(double amount);
	public abstract void makeCheckingWithdrawal(double amount);
	public abstract void computeInterest();
}

class MyBank implements Bank
{
	private double checking;
	private double interest;

	public MyBank(double c)
	{
		checking = c;
		interest = 0.0;
		//	rate = 0.1;
	}

	public double getCheckingBalance()					{ return checking;    }
	public void makeCheckingDeposit(double amount)		{ checking += amount; }
	public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }
	public void computeInterest()
	{
		interest = checking * rate;
		checking += interest;
	}
}
