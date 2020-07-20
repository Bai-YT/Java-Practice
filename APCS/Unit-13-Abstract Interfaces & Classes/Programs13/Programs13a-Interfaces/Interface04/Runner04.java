// Interface04
// This program tests the <CreditUnion> class defining more methods
// than are declared in the <Bank> interface.


public class Runner04
{
	public static void main (String[] args)
	{
		CreditUnion tom = new CreditUnion(736829056,5000.0);
      
      System.out.println("Tom's account: " + tom.getAccount());
      System.out.println("Tom's balance: " + tom.getBalance());
	}
}
