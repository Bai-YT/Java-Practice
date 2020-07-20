// Interface02
// The <Runner02> class tests the implementation of the
// <CreditUnion> class and the <Bank> interface.


public class Runner02
{
	public static void main (String[] args)
	{
		CreditUnion tom = new CreditUnion(5000.0);
      System.out.println("Tom's balance: " + tom.getBalance());
		tom.makeDeposit(1500.0);
		System.out.println("Tom's balance: " + tom.getBalance());
		tom.makeWithdrawal(2500.0);
		System.out.println("Tom's balance: " + tom.getBalance());
	}
}

