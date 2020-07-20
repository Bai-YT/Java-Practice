// Java0802.java
// This program demonstrates the use of the <length> method.
// It also reviews string concatenation with the < + > operator.


public class Java0802
{
	public static void main (String[] args)
	{
		String s1 = "Argentine";
		String s2 = "Tango";
		String s3 = s1 + " " + s2;
		System.out.println(s1 + " has " + s1.length() + " characters.");
		System.out.println(s2 + " has " + s2.length() + " characters.");
		System.out.println(s3 + " has " + s3.length() + " characters.");
		System.out.println();
	}
}
