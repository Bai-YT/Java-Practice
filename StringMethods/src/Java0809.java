// Java0809.java
// This program checks equality of strings using the == operator.
// This program has unexpected results.


import java.util.Scanner;


public class Java0809
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a string ===>>  ");
		String s1 = input.nextLine();
		String s2 = "Waltz";
		String s3 = "Foxtrot";
		System.out.println();

		if (s1 == s2)
			System.out.println(s1 + " equals " + s2);
		else
			System.out.println(s1 + " does not equal " + s2);
		if (s1 == s3)
			System.out.println(s1 + " equals " + s3);
		else
			System.out.println(s1 + " does not equal " + s3);
		System.out.println();
	}
}
