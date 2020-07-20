// Interface05
// This program shows how one class, <Bank> can implement two
// interfaces <Checking> and <Savings>.


public class Bank implements Checking,Savings
{
	private double checking;
	private double savings;

	public Bank(double c, double s)				
   { 
      checking = c; 
      savings = s;	
   }

	public double getChecking()					   
   { return checking; }   
	public void checkingDeposit(double amount)   
   { checking += amount; }
   public void checkingWithdrawal(double amount)
   { checking -= amount; }
   
   public double getSavings()					      
   { return savings; }
	public void savingsDeposit(double amount)		
   { savings += amount; }
	public void savingsWithdrawal(double amount)	
   { savings -= amount; }
}


