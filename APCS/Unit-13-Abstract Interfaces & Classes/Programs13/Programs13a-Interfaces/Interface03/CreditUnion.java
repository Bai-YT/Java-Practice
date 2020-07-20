// Interface03
// This <CreditUnion> class partially implements the <Bank> interface.


public class CreditUnion implements Bank
{
	private double balance;

	public CreditUnion(double c)					
   { 
      balance = c;	
   }

	public double getBalance()					   
   { 
      return balance; 
   }

	public void makeDeposit(double amount)		
   { 
      balance += amount; 
   }
}


