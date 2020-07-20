// Java1401.java
// The < + > operator in Java is overloaded.
// This program shows that the same operator can perform
// arithmetic addition and string concatenation.


public class Java1401
{
	public static void main (String[] args)
	{
		int n1 = 1000;
		int n2 = 2000;
		int n3 = n1 + n2;

		String s1 = "1000";
		String s2 = "2000";
		String s3 = s1 + s2;

		System.out.println("n1 + n2 = " + n3);
		System.out.println();
		System.out.println("s1 + s2 = " + s3);
		System.out.println();
	}
}

