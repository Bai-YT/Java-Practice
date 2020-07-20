// Interface05
// <Runner05> tests the <Bank> class implementing
// the <Checking> interface and the <Savings> interface.


public class Runner05
{
	public static void main (String[] args)
	{
		Bank tom = new Bank(5000.0,7500.0);
      System.out.println("Tom's checking balance: " + tom.getChecking());
  		System.out.println("Tom's savings balance: " + tom.getSavings());
	}
}

