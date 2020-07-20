// Java0324.java
// Sequence of operations matters.
// Casting executes before multiplication 
// unless parentheses are used.


public class Java0324
{
	public static void main (String[] args)
	{
      int a = (int) 3.14159 * 10;
      int b = (int) (3.14159 * 10);
		System.out.println(a);
      System.out.println(b);
	}
}

