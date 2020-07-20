// MagpieTester02.java     12-26-14
// This program tests the Magpie02 class.
// ***************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered this "Magpie" file to focus on 
// CS topics as the "Magpie" Lab is integrated into the curriculum.


import java.util.Scanner;

public class MagpieTester02
{
	public static void main(String[] args)
	{
		Magpie02 maggie = new Magpie02();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}
