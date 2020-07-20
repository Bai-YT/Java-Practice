// Interface04
// This <CreditUnion> class defines the <getAccount> method,
// which was not an abstract method of the <Bank> interface.
// A concrete class may implement more methods, but never less
// methods than are declared in the interface.


public class CreditUnion implements Bank
{
   private int account;
	private double balance;

	public CreditUnion(int a, double c)					
   {
      account = a; 
      balance = c;	
   }
     
   public int getAccount()                   
   { return account; }

	public double getBalance()					   
   { return balance; }

	public void makeDeposit(double amount)		
   { balance += amount; }

	public void makeWithdrawal(double amount)	
   { balance -= amount; }
   
}


