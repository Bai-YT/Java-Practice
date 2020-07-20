// Interface03
// The <Runner03> class tests the <Bank> interface and the
// partial implementation of the  <CreditUnion> class.
// This does not compile. All abstract methods must be implemented.


public class Runner03
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

