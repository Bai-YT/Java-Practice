public class Test1313
{
	public static void main(String args[])
	{
		MyBank tom = new MyBank(5000.0);
      System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.makeCheckingDeposit(1500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());
		tom.makeCheckingWithdrawal(2500.0);
		System.out.println("Tom's checking balance: " + tom.getCheckingBalance());

	}
}


abstract interface Bank
{
	public abstract double getCheckingBalance();
	public abstract void makeCheckingDeposit(double amount);
	public abstract void makeCheckingWithdrawal(double amount);
}


class MyBank implements Bank
{
	private double checking;
	public MyBank(double c)								      { checking = c;	}
	public double getCheckingBalance()					   { return checking; }
	public void makeCheckingDeposit(double amount)	   { checking += amount; }
   public void makeCheckingWithdrawal(double amount)	{ checking -= amount; }
}


