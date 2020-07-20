// Java0320.java
// This program demonstrates mathematical precedence in Java operations.


public class Java0320
{
	public static void main (String[] args)
	{
		double a, b, c, result;
		a = 1000;
		b = 100;
		c = 2.5;

		System.out.println();
		System.out.println("a = " + a + "  b = " + b + "  c = " + c);
		result = a + b * c;
		System.out.println("\na + b * c       = " + result);
		result = (a + b) * c;
		System.out.println("\n(a + b) * c     = " + result);
		result = a / b * c;
		System.out.println("\na / b * c       = " + result);
		result = a / (b * c);
 		System.out.println("\na / (b * c)     = " + result);
 		System.out.println();
   	}
}
