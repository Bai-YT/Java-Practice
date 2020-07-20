
public class FR1301
{
   public static void main(String[] args)
   {
      Util util = new Util();
      System.out.println("XXXXXXXXXXXXXXXXXX");
      util.skip(2);
      System.out.println("XXXXXXXXXXXXXXXXXX");
   }	
}

abstract interface Output
{
	abstract public void skip(int n);

	abstract public void center(String str);

	abstract public void rightJustify(String str);
}

class Util implements Output
{	
   public Util() { }
   
	public void skip(int n)
	{
		for (int k = 1; k <= n; k++)
			System.out.println();
	}
	
	public void center(String str) 	{  } 

	public void rightJustify(String str) {  } 
}
