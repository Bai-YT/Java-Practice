// Interface06
// This <Bank1> interface declares a data field.
// This is only possible if the field has an assigned value.


public abstract interface Bank1
{
   public abstract double rate;

	public abstract double getBalance();
	public abstract void makeDeposit(double amount);
	public abstract void makeWithdrawal(double amount);
}


