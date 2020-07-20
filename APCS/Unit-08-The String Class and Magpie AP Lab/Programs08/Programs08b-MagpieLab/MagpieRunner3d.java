/**
 * A simple class to run the Magpie class.
 * This version tests the Magpie3d class.
 *************************************************************
 * author Laurie White
 * version April 2012
 * Divided into stages and altered July 2014 by Leon Schram
 */

import java.util.Scanner;

public class MagpieRunner3d
{
	public static void main(String[] args)
	{
		Magpie3d maggie = new Magpie3d();

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
