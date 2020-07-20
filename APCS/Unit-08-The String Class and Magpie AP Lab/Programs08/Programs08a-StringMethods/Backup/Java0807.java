// Java0807.java
// This program demonstrates the <valueOf> method of the String class,
// which is shown to convert four data types to a string.
// Note that <valueOf> is a static method and must be called using <String.valueOf>.


public class Java0807
{
	public static void main (String[] args)
	{
		String s1 = String.valueOf(1000);
		String s2 = String.valueOf(123.321);
		String s3 = String.valueOf(true);
		String s4 = String.valueOf('A');
		String s5 = s1 + s2;

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println("s5: " + s5);
		System.out.println();
	}
}
