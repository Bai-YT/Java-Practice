// Test1323.java	
   
   abstract class Bank1
	{
			public abstract double getCheckingBalance();
			public abstract void makeCheckingDeposit(double amount);
			public abstract void makeCheckingWithdrawal(double amount);
	}
   
   class Bank11 extends Bank1
   {
      	public double getCheckingBalance() { return 0.0; }
			public void makeCheckingDeposit(double amount) { }
			public void makeCheckingWithdrawal(double amount) { }
   }

	abstract interface Bank2
	{
			public abstract double getCheckingBalance();
			public abstract void makeCheckingDeposit(double amount);
			public abstract void makeCheckingWithdrawal(double amount);
	}

   class Bank21 implements Bank2
   {
      	public double getCheckingBalance() { return 0.0; }
			public void makeCheckingDeposit(double amount) { }
			public void makeCheckingWithdrawal(double amount) { }
   }
