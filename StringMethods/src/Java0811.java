// Java0811.java
// This program demonstrates the <compareTo> method, which returns an integer value.
// The returned value indicates which string alphabetically goes before the other.
// If the value is negative, the original string goes first.
// If the value is positive, the parameter string goes first.
// If the value is zero, both strings are equal.


public class Java0811
{
	public static void main (String[] args)
	{
		String s1 = "AARDVARK";
		String s2 = "ZEBRA";
		String s3 = "AARDVARK";
		String s4 = "BART";

		int value1 = s1.compareTo(s2);
		int value2 = s1.compareTo(s3);
		int value3 = s2.compareTo(s1);
		int value4 = s1.compareTo(s4);

		System.out.println("value1:  " +  value1);
		System.out.println("value2:  " +  value2);
		System.out.println("value3:  " +  value3);
		System.out.println("value4:  " +  value4);
		System.out.println();
	}
}
