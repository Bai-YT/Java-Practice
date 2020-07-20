// Java0801.java
// This program demonstrates multiple ways to construct String objects.
// Note that all four string objects store the same information.


public class Java0801
{
	public static void main (String[] args)
	{
		String s1 = "Tango";
		System.out.println("s1:  " + s1);

		String s2 = new String();
		s2 = "Tango";
		System.out.println("s2:  " + s2);

		String s3 = new String("Tango");
		System.out.println("s3:  " + s3);

		String s4 = new String(s3);
		System.out.println("s4:  " + s4);
	}
}
