// Java0810.java
// This program demonstrates the <equals> method, which is capable of
// testing equality of string objects correctly.


import java.util.*;


public class Java0810
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a string ===>>  ");
		String s1 = input.nextLine();
		String s2 = "Waltz";
		String s3 = "Foxtrot";
		System.out.println();

		if (s1.equals(s2))
			System.out.println(s1 + " equals " + s2);
		else
			System.out.println(s1 + " does not equal " + s2);
		if (s1.equals(s3))
			System.out.println(s1 + " equals " + s3);
		else
			System.out.println(s1 + " does not equals " + s3);
	}
}
