/*
 * A simple class to run the Magpie class.
 * This version tests the Magpie2b class
 * and now provides a loop for program input.
 ***********************************************************
 * author Laurie White
 * version April 2012
 * Divided into stages and altered July 2014 by Leon Schram
 */

import java.util.Scanner;

public class MagpieRunner2b
{
	public static void main(String[] args)
	{
		Magpie2b maggie = new Magpie2b();

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
