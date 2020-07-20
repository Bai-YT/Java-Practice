
public class FR1302
{
   public static void main(String[] args)
   {
      Util util = new Util();
      util.center("XXXXXXXXXXXXXXXXXXXXXX");
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
   
	public void skip(int n) { }
		
	public void center(String str)
	{
		int len = str.length();
		int tab = (80 - len) / 2;
		for (int k = 1; k <= tab; k++)
		   System.out.print(" ");
		System.out.println(str);  
	}  

	public void rightJustify(String str) {  } 
}
