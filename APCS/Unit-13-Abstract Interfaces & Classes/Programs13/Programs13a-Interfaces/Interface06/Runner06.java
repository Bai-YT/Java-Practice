// Interface06
// This program tests <Bank1> interface with a non-abstract
// data field and a <getRate> method in the <Bank2> class.


public class Runner06
{
	public static void main (String[] args)
	{
		Bank3 tom = new Bank3(736829056,5000.0);
      
      System.out.println("Tom's account: " + tom.getAccount());
      System.out.println("Tom's balance: " + tom.getBalance());
      System.out.println("Tom's rate:    " + tom.getRate());
      System.out.println("Tom's rate:    " + tom.rate);
	}
}
