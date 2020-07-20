public class BankAccount 
{
	String username;
	String password;
	double balance;
	static String compare;
	
	public BankAccount(){
		username = " ";
		password = " ";
		balance = 0.0;
	}
	
	public BankAccount(String acctUsername, String acctPassword, double acctBalance){
		username = acctUsername;
		password = acctPassword;
		balance = acctBalance;
	}
	
	public static BankAccount c = new BankAccount("Michael", "c", 800.0);	
	public static BankAccount a = new BankAccount("Tom", "a", 700.0) ;
	public static BankAccount b = new BankAccount("Jerry", "b", 600.0) ;
	
	public void deposit(String acctPassword, double amount){
	if(acctPassword.equals(password))
		balance += amount;
	System.out.println(balance);
	}
	
	public static void main(String[] args){
	c.deposit("c", 200);
	if (b.balance > a.balance)
	{compare = b.username + " is richer: " + b.balance;
	}
	else
	{compare = a.username + " is richer: " + a.balance;
	}
	System.out.println(compare);
	System.out.println(c.username + " " + c.balance);
	}
}