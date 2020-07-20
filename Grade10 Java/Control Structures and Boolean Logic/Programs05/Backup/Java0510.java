// Java0510.java
// This program displays various counting schemes.
// It also demonstrates the versatility of the <for> loop.


public class Java0510
{
	public static void main(String[] args)
	{    
      for (int p = 1; p <= 15; p++)
		     System.out.print(p + "  ");
		System.out.println("\n");

		for (int q = 1; q <= 15; q+=3)
			System.out.print(q + "  ");
		System.out.println("\n");

		for (int r = 15; r >= 1; r--)
			System.out.print(r + "  ");
		System.out.println("\n");

		for (double s = 0; s <= 3; s+=0.5)
			System.out.print(s + "  ");
		System.out.println("\n");

		for (char t = 'A'; t <= 'Z'; t++)
			System.out.print(t + "  ");
	}
}

